package org.apache.commons.io;

import java.io.File;
import java.util.Locale;
import org.junit.Test;
import junit.framework.TestCase;

public class FilenameUtilsWildcardTestCase extends TestCase {
    private static final boolean WINDOWS = (File.separatorChar) == '\\';

    public FilenameUtilsWildcardTestCase(String name) {
        super(name);
    }

    public void testMatchOnSystem() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatchOnSystem");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4997,null,4996,org.apache.commons.io.FilenameUtils.wildcardMatchOnSystem(null, "Foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4999,null,4998,org.apache.commons.io.FilenameUtils.wildcardMatchOnSystem("Foo", null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5001,null,5000,org.apache.commons.io.FilenameUtils.wildcardMatchOnSystem(null, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5003,null,5002,org.apache.commons.io.FilenameUtils.wildcardMatchOnSystem("Foo", "Foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5005,null,5004,org.apache.commons.io.FilenameUtils.wildcardMatchOnSystem("", ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5007,null,5006,org.apache.commons.io.FilenameUtils.wildcardMatchOnSystem("Foo", "Fo*"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5009,null,5008,org.apache.commons.io.FilenameUtils.wildcardMatchOnSystem("Foo", "Fo?"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5011,null,5010,org.apache.commons.io.FilenameUtils.wildcardMatchOnSystem("Foo Bar and Catflap", "Fo*"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5013,null,5012,org.apache.commons.io.FilenameUtils.wildcardMatchOnSystem("New Bookmarks", "N?w ?o?k??r?s"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5015,null,5014,org.apache.commons.io.FilenameUtils.wildcardMatchOnSystem("Foo", "Bar"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5017,null,5016,org.apache.commons.io.FilenameUtils.wildcardMatchOnSystem("Foo Bar Foo", "F*o Bar*"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5019,null,5018,org.apache.commons.io.FilenameUtils.wildcardMatchOnSystem("Adobe Acrobat Installer", "Ad*er"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5021,null,5020,org.apache.commons.io.FilenameUtils.wildcardMatchOnSystem("Foo", "*Foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5023,null,5022,org.apache.commons.io.FilenameUtils.wildcardMatchOnSystem("BarFoo", "*Foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5025,null,5024,org.apache.commons.io.FilenameUtils.wildcardMatchOnSystem("Foo", "Foo*"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5027,null,5026,org.apache.commons.io.FilenameUtils.wildcardMatchOnSystem("FooBar", "Foo*"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5028,org.apache.commons.io.FilenameUtilsWildcardTestCase.WINDOWS);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5030,null,5029,org.apache.commons.io.FilenameUtils.wildcardMatchOnSystem("FOO", "*Foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5031,org.apache.commons.io.FilenameUtilsWildcardTestCase.WINDOWS);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5033,null,5032,org.apache.commons.io.FilenameUtils.wildcardMatchOnSystem("BARFOO", "*Foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5034,org.apache.commons.io.FilenameUtilsWildcardTestCase.WINDOWS);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5036,null,5035,org.apache.commons.io.FilenameUtils.wildcardMatchOnSystem("FOO", "Foo*"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5037,org.apache.commons.io.FilenameUtilsWildcardTestCase.WINDOWS);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5039,null,5038,org.apache.commons.io.FilenameUtils.wildcardMatchOnSystem("FOOBAR", "Foo*"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatchCaseSpecified() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatchCaseSpecified");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4933,null,4932,org.apache.commons.io.FilenameUtils.wildcardMatch(null, "Foo", org.apache.commons.io.IOCase.SENSITIVE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4935,null,4934,org.apache.commons.io.FilenameUtils.wildcardMatch("Foo", null, org.apache.commons.io.IOCase.SENSITIVE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4937,null,4936,org.apache.commons.io.FilenameUtils.wildcardMatch(null, null, org.apache.commons.io.IOCase.SENSITIVE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4939,null,4938,org.apache.commons.io.FilenameUtils.wildcardMatch("Foo", "Foo", org.apache.commons.io.IOCase.SENSITIVE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4941,null,4940,org.apache.commons.io.FilenameUtils.wildcardMatch("", "", org.apache.commons.io.IOCase.SENSITIVE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4943,null,4942,org.apache.commons.io.FilenameUtils.wildcardMatch("Foo", "Fo*", org.apache.commons.io.IOCase.SENSITIVE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4945,null,4944,org.apache.commons.io.FilenameUtils.wildcardMatch("Foo", "Fo?", org.apache.commons.io.IOCase.SENSITIVE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4947,null,4946,org.apache.commons.io.FilenameUtils.wildcardMatch("Foo Bar and Catflap", "Fo*", org.apache.commons.io.IOCase.SENSITIVE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4949,null,4948,org.apache.commons.io.FilenameUtils.wildcardMatch("New Bookmarks", "N?w ?o?k??r?s", org.apache.commons.io.IOCase.SENSITIVE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4951,null,4950,org.apache.commons.io.FilenameUtils.wildcardMatch("Foo", "Bar", org.apache.commons.io.IOCase.SENSITIVE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4953,null,4952,org.apache.commons.io.FilenameUtils.wildcardMatch("Foo Bar Foo", "F*o Bar*", org.apache.commons.io.IOCase.SENSITIVE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4955,null,4954,org.apache.commons.io.FilenameUtils.wildcardMatch("Adobe Acrobat Installer", "Ad*er", org.apache.commons.io.IOCase.SENSITIVE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4957,null,4956,org.apache.commons.io.FilenameUtils.wildcardMatch("Foo", "*Foo", org.apache.commons.io.IOCase.SENSITIVE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4959,null,4958,org.apache.commons.io.FilenameUtils.wildcardMatch("Foo", "Foo*", org.apache.commons.io.IOCase.SENSITIVE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4961,null,4960,org.apache.commons.io.FilenameUtils.wildcardMatch("Foo", "*Foo", org.apache.commons.io.IOCase.SENSITIVE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4963,null,4962,org.apache.commons.io.FilenameUtils.wildcardMatch("BarFoo", "*Foo", org.apache.commons.io.IOCase.SENSITIVE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4965,null,4964,org.apache.commons.io.FilenameUtils.wildcardMatch("Foo", "Foo*", org.apache.commons.io.IOCase.SENSITIVE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4967,null,4966,org.apache.commons.io.FilenameUtils.wildcardMatch("FooBar", "Foo*", org.apache.commons.io.IOCase.SENSITIVE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4969,null,4968,org.apache.commons.io.FilenameUtils.wildcardMatch("FOO", "*Foo", org.apache.commons.io.IOCase.SENSITIVE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4971,null,4970,org.apache.commons.io.FilenameUtils.wildcardMatch("BARFOO", "*Foo", org.apache.commons.io.IOCase.SENSITIVE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4973,null,4972,org.apache.commons.io.FilenameUtils.wildcardMatch("FOO", "Foo*", org.apache.commons.io.IOCase.SENSITIVE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4975,null,4974,org.apache.commons.io.FilenameUtils.wildcardMatch("FOOBAR", "Foo*", org.apache.commons.io.IOCase.SENSITIVE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4977,null,4976,org.apache.commons.io.FilenameUtils.wildcardMatch("FOO", "*Foo", org.apache.commons.io.IOCase.INSENSITIVE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4979,null,4978,org.apache.commons.io.FilenameUtils.wildcardMatch("BARFOO", "*Foo", org.apache.commons.io.IOCase.INSENSITIVE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4981,null,4980,org.apache.commons.io.FilenameUtils.wildcardMatch("FOO", "Foo*", org.apache.commons.io.IOCase.INSENSITIVE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4983,null,4982,org.apache.commons.io.FilenameUtils.wildcardMatch("FOOBAR", "Foo*", org.apache.commons.io.IOCase.INSENSITIVE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4984,org.apache.commons.io.FilenameUtilsWildcardTestCase.WINDOWS);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4986,null,4985,org.apache.commons.io.FilenameUtils.wildcardMatch("FOO", "*Foo", org.apache.commons.io.IOCase.SYSTEM));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4987,org.apache.commons.io.FilenameUtilsWildcardTestCase.WINDOWS);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4989,null,4988,org.apache.commons.io.FilenameUtils.wildcardMatch("BARFOO", "*Foo", org.apache.commons.io.IOCase.SYSTEM));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4990,org.apache.commons.io.FilenameUtilsWildcardTestCase.WINDOWS);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4992,null,4991,org.apache.commons.io.FilenameUtils.wildcardMatch("FOO", "Foo*", org.apache.commons.io.IOCase.SYSTEM));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4993,org.apache.commons.io.FilenameUtilsWildcardTestCase.WINDOWS);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4995,null,4994,org.apache.commons.io.FilenameUtils.wildcardMatch("FOOBAR", "Foo*", org.apache.commons.io.IOCase.SYSTEM));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSplitOnTokens_add1718() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_add1718");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSplitOnTokens_add1719() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_add1719");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSplitOnTokens_add1720() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_add1720");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSplitOnTokens_add1721() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_add1721");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSplitOnTokens_add1722() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_add1722");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSplitOnTokens_add1723() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_add1723");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSplitOnTokens_add1724() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_add1724");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSplitOnTokens_add1725() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_add1725");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSplitOnTokens_add1726() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_add1726");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens");
        assertArrayEquals(new String[]{ "foo" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation5800() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation5800");
        assertArrayEquals(new String[]{ "Ad" , "foo" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation5801() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation5801");
        assertArrayEquals(new String[]{ "Ad" , "*" , "bar" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation5802() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation5802");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("foo"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation5803() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation5803");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "foo" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation5804() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation5804");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "bar" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation5805() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation5805");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "bar" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation5806() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation5806");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("foo"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation5807() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation5807");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "foo" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation5808() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation5808");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "foo" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation5809() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation5809");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "bar" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation5810() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation5810");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "foo" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation5811() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation5811");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("foo"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation5812() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation5812");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "foo" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation5813() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation5813");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "foo" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation5814() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation5814");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "bar" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation5815() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation5815");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "bar" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation5816() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation5816");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("bar"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation5817() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation5817");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "bar" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation5818() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation5818");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("bar"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation5819() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation5819");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "foo" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation5820() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation5820");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "bar" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation5821() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation5821");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "foo" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation5822() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation5822");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "foo" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation5823() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation5823");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("bar"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation5824() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation5824");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "bar" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation5825() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation5825");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "bar" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation5826() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation5826");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "bar" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation5827() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation5827");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "bar" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation5828() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation5828");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "bar" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation5829() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation5829");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("bar"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation5830() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation5830");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "foo" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation5831() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation5831");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "foo" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation5832() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation5832");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "foo" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation5833() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation5833");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "bar" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation5834() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation5834");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("bar"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation5835() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation5835");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "foo" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation5836() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation5836");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens("bar"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSplitOnTokens_remove1311() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_remove1311");
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSplitOnTokens_remove1312() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_remove1312");
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSplitOnTokens_remove1313() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_remove1313");
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSplitOnTokens_remove1314() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_remove1314");
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSplitOnTokens_remove1315() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_remove1315");
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSplitOnTokens_remove1316() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_remove1316");
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSplitOnTokens_remove1317() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_remove1317");
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSplitOnTokens_remove1318() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_remove1318");
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSplitOnTokens_remove1319() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_remove1319");
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void assertArrayEquals(Object[] a1, Object[] a2) {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4919,a1.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4920,a2.length);
        for (int i = 0 ; i < (a1.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4921,a1[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4922,a2[i]);
        }
    }

    private void assertMatch(String text, String wildcard, boolean expected) {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4923,((text + " ") + wildcard));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4924,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4926,null,4925,org.apache.commons.io.FilenameUtils.wildcardMatch(text, wildcard));
    }

    @Test(timeout = 1000)
    public void testMatch2_add1686() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_add1686");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_add1687() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_add1687");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_add1688() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_add1688");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_add1689() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_add1689");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_add1690() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_add1690");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_add1691() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_add1691");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_add1692() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_add1692");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_add1693() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_add1693");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_add1694() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_add1694");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_add1695() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_add1695");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_add1696() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_add1696");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_add1697() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_add1697");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_add1698() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_add1698");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_add1699() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_add1699");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_add1700() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_add1700");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_add1701() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_add1701");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_add1702() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_add1702");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_add1703() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_add1703");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_add1704() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_add1704");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_add1705() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_add1705");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_add1706() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_add1706");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_add1707() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_add1707");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_add1708() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_add1708");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_add1709() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_add1709");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_add1710() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_add1710");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_add1711() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_add1711");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_add1712() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_add1712");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_add1713() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_add1713");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_add1714() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_add1714");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_add1715() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_add1715");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_add1716() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_add1716");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_add1717() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_add1717");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch");
        assertMatch("bar", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2");
        assertMatch("log.txt", "bar", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5705() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5705");
        assertMatch("log.txt", "log.txt", false);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5706() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5706");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("foo", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5707() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5707");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "foo", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5708() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5708");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", true);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5709() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5709");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("foo", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5710() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5710");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "foo", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5711() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5711");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", false);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5712() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5712");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("foo", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5713() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5713");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "bar", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5714() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5714");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", true);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5715() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5715");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("bar", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5716() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5716");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "bar", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5717() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5717");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", false);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5718() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5718");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("bar", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5719() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5719");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "foo", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5720() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5720");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", false);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5721() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5721");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("bar", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5722() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5722");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "bar", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5723() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5723");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", true);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5724() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5724");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("foo", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5725() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5725");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "bar", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5726() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5726");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", false);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5727() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5727");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("foo", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5728() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5728");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "bar", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5729() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5729");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", true);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5730() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5730");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("foo", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5731() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5731");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "bar", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5732() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5732");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", false);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5733() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5733");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("foo", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5734() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5734");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "foo", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5735() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5735");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", true);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5736() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5736");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("foo", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5737() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5737");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "bar", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5738() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5738");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5739() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5739");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("foo", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5740() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5740");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "bar", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5741() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5741");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5742() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5742");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("foo", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5743() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5743");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "bar", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5744() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5744");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", true);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5745() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5745");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("foo", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5746() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5746");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "bar", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5747() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5747");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", false);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5748() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5748");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("foo", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5749() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5749");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "foo", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5750() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5750");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", false);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5751() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5751");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("bar", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5752() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5752");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "bar", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5753() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5753");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", false);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5754() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5754");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("foo", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5755() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5755");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "bar", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5756() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5756");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", false);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5757() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5757");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("bar", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5758() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5758");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "foo", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5759() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5759");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", false);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5760() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5760");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("foo", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5761() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5761");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "bar", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5762() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5762");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", false);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5763() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5763");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("bar", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5764() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5764");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "bar", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5765() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5765");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", false);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5766() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5766");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("foo", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5767() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5767");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "bar", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5768() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5768");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", false);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5769() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5769");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("bar", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5770() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5770");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "foo", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5771() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5771");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", false);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5772() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5772");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("bar", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5773() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5773");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "bar", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5774() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5774");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", false);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5775() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5775");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("foo", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5776() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5776");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "bar", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5777() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5777");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", false);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5778() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5778");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("foo", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5779() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5779");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "foo", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5780() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5780");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", false);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5781() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5781");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("foo", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5782() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5782");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "foo", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5783() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5783");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", false);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5784() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5784");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("bar", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5785() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5785");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "foo", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5786() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5786");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", true);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5787() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5787");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("foo", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5788() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5788");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "bar", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5789() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5789");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", false);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5790() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5790");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("bar", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5791() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5791");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "foo", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5792() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5792");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", false);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5793() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5793");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("foo", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5794() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5794");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "foo", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5795() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5795");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", false);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5796() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5796");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("foo", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5797() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5797");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "foo", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation5798() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation5798");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", false);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_remove1279() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_remove1279");
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_remove1280() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_remove1280");
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_remove1281() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_remove1281");
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_remove1282() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_remove1282");
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_remove1283() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_remove1283");
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_remove1284() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_remove1284");
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_remove1285() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_remove1285");
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_remove1286() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_remove1286");
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_remove1287() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_remove1287");
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_remove1288() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_remove1288");
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_remove1289() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_remove1289");
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_remove1290() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_remove1290");
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_remove1291() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_remove1291");
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_remove1292() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_remove1292");
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_remove1293() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_remove1293");
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_remove1294() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_remove1294");
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_remove1295() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_remove1295");
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_remove1296() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_remove1296");
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_remove1297() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_remove1297");
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_remove1298() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_remove1298");
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_remove1299() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_remove1299");
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_remove1300() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_remove1300");
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_remove1301() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_remove1301");
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_remove1302() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_remove1302");
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_remove1303() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_remove1303");
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_remove1304() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_remove1304");
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_remove1305() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_remove1305");
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_remove1306() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_remove1306");
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_remove1307() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_remove1307");
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_remove1308() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_remove1308");
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_remove1309() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_remove1309");
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMatch2_remove1310() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_remove1310");
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "*.txt?", true);
        assertMatch("log.txt", "*.txt?", false);
        assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        assertMatch("progtestcase.java~5", "*test*.java~*~", false);
        assertMatch("log.txt", "log.*", true);
        assertMatch("log.txt", "log?*", true);
        assertMatch("log.txt12", "log.txt??", true);
        assertMatch("log.log", "log**log", true);
        assertMatch("log.log", "log**", true);
        assertMatch("log.log", "log.**", true);
        assertMatch("log.log", "**.log", true);
        assertMatch("log.log", "**log", true);
        assertMatch("log.log", "log*log", true);
        assertMatch("log.log", "log*", true);
        assertMatch("log.log", "log.*", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
@Test(timeout = 1000)
    public void test_IO_246_add1727() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_add1727");
        assertMatch("aaa", "aa*?", true);
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
@Test(timeout = 1000)
    public void test_IO_246_add1728() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_add1728");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
@Test(timeout = 1000)
    public void test_IO_246_add1729() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_add1729");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
@Test(timeout = 1000)
    public void test_IO_246_add1730() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_add1730");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
@Test(timeout = 1000)
    public void test_IO_246_add1731() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_add1731");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
@Test(timeout = 1000)
    public void test_IO_246_add1732() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_add1732");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
@Test(timeout = 1000)
    public void test_IO_246_add1733() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_add1733");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
@Test(timeout = 1000)
    public void test_IO_246_add1734() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_add1734");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
@Test(timeout = 1000)
    public void test_IO_246_add1735() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_add1735");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
@Test(timeout = 1000)
    public void test_IO_246_add1736() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_add1736");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
@Test(timeout = 1000)
    public void test_IO_246_add1737() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_add1737");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
@Test(timeout = 1000)
    public void test_IO_246_add1738() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_add1738");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246");
        assertMatch("foo", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation5838() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation5838");
        assertMatch("aaa", "bar", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation5839() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation5839");
        assertMatch("aaa", "aa*?", false);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation5840() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation5840");
        assertMatch("aaa", "aa*?", true);
        assertMatch("bar", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation5841() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation5841");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "bar", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation5842() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation5842");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", true);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation5843() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation5843");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("foo", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation5844() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation5844");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "foo", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation5845() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation5845");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", true);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation5846() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation5846");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("bar", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation5847() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation5847");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "foo", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation5848() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation5848");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", true);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation5849() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation5849");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("foo", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation5850() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation5850");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "bar", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation5851() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation5851");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", false);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation5852() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation5852");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("foo", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation5853() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation5853");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "foo", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation5854() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation5854");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", false);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation5855() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation5855");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("bar", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation5856() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation5856");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "bar", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation5857() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation5857");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", false);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation5858() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation5858");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("foo", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation5859() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation5859");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "foo", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation5860() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation5860");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", true);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation5861() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation5861");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("bar", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation5862() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation5862");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "foo", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation5863() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation5863");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", true);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation5864() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation5864");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("bar", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation5865() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation5865");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "bar", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation5866() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation5866");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", true);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation5867() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation5867");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("foo", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation5868() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation5868");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "bar", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation5869() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation5869");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", false);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation5870() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation5870");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("bar", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation5871() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation5871");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "bar", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation5872() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation5872");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", false);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
@Test(timeout = 1000)
    public void test_IO_246_remove1320() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_remove1320");
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
@Test(timeout = 1000)
    public void test_IO_246_remove1321() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_remove1321");
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
@Test(timeout = 1000)
    public void test_IO_246_remove1322() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_remove1322");
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
@Test(timeout = 1000)
    public void test_IO_246_remove1323() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_remove1323");
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
@Test(timeout = 1000)
    public void test_IO_246_remove1324() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_remove1324");
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
@Test(timeout = 1000)
    public void test_IO_246_remove1325() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_remove1325");
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
@Test(timeout = 1000)
    public void test_IO_246_remove1326() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_remove1326");
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
@Test(timeout = 1000)
    public void test_IO_246_remove1327() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_remove1327");
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
@Test(timeout = 1000)
    public void test_IO_246_remove1328() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_remove1328");
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
@Test(timeout = 1000)
    public void test_IO_246_remove1329() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_remove1329");
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
@Test(timeout = 1000)
    public void test_IO_246_remove1330() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_remove1330");
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
@Test(timeout = 1000)
    public void test_IO_246_remove1331() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_remove1331");
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLocaleIndependence_add1684() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_add1684");
        Locale orig = Locale.getDefault();
        Locale[] locales = Locale.getAvailableLocales();
        String[][] data = new String[][]{ new String[]{ "I" , "i" } , new String[]{ "i" , "I" } , new String[]{ "i" , "İ" } , new String[]{ "i" , "ı" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "σ" } , new String[]{ "ς" , "σ" } };
        try {
            for (int i = 0 ; i < (data.length) ; i++) {
                for (Locale locale : locales) {
                    Locale.setDefault(locale);
                    Locale.setDefault(locale);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,("Test data corrupt: " + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4929,data[i][0],4928,data[i][0].equalsIgnoreCase(data[i][1]));
                    boolean match = org.apache.commons.io.FilenameUtils.wildcardMatch(data[i][0], data[i][1], org.apache.commons.io.IOCase.INSENSITIVE);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,(((java.util.Locale.getDefault().toString()) + ": ") + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4931,match);
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLocaleIndependence_add1685() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_add1685");
        Locale orig = Locale.getDefault();
        Locale[] locales = Locale.getAvailableLocales();
        String[][] data = new String[][]{ new String[]{ "I" , "i" } , new String[]{ "i" , "I" } , new String[]{ "i" , "İ" } , new String[]{ "i" , "ı" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "σ" } , new String[]{ "ς" , "σ" } };
        try {
            for (int i = 0 ; i < (data.length) ; i++) {
                for (Locale locale : locales) {
                    Locale.setDefault(locale);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,("Test data corrupt: " + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4929,data[i][0],4928,data[i][0].equalsIgnoreCase(data[i][1]));
                    boolean match = org.apache.commons.io.FilenameUtils.wildcardMatch(data[i][0], data[i][1], org.apache.commons.io.IOCase.INSENSITIVE);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,(((java.util.Locale.getDefault().toString()) + ": ") + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4931,match);
                }
            }
        } finally {
            Locale.setDefault(orig);
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleIndependence() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence");
        Locale orig = Locale.getDefault();
        Locale[] locales = Locale.getAvailableLocales();
        String[][] data = new String[][]{ new String[]{ "foo" , "i" } , new String[]{ "i" , "I" } , new String[]{ "i" , "İ" } , new String[]{ "i" , "ı" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "σ" } , new String[]{ "ς" , "σ" } };
        try {
            for (int i = 0 ; i < (data.length) ; i++) {
                for (Locale locale : locales) {
                    Locale.setDefault(locale);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,("Test data corrupt: " + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4929,data[i][0],4928,data[i][0].equalsIgnoreCase(data[i][1]));
                    boolean match = org.apache.commons.io.FilenameUtils.wildcardMatch(data[i][0], data[i][1], org.apache.commons.io.IOCase.INSENSITIVE);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,(((java.util.Locale.getDefault().toString()) + ": ") + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4931,match);
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleIndependence_literalMutation5681() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation5681");
        Locale orig = Locale.getDefault();
        Locale[] locales = Locale.getAvailableLocales();
        String[][] data = new String[][]{ new String[]{ "I" , "foo" } , new String[]{ "i" , "I" } , new String[]{ "i" , "İ" } , new String[]{ "i" , "ı" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "σ" } , new String[]{ "ς" , "σ" } };
        try {
            for (int i = 0 ; i < (data.length) ; i++) {
                for (Locale locale : locales) {
                    Locale.setDefault(locale);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,("Test data corrupt: " + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4929,data[i][0],4928,data[i][0].equalsIgnoreCase(data[i][1]));
                    boolean match = org.apache.commons.io.FilenameUtils.wildcardMatch(data[i][0], data[i][1], org.apache.commons.io.IOCase.INSENSITIVE);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,(((java.util.Locale.getDefault().toString()) + ": ") + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4931,match);
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleIndependence_literalMutation5682() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation5682");
        Locale orig = Locale.getDefault();
        Locale[] locales = Locale.getAvailableLocales();
        String[][] data = new String[][]{ new String[]{ "I" , "i" } , new String[]{ "foo" , "I" } , new String[]{ "i" , "İ" } , new String[]{ "i" , "ı" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "σ" } , new String[]{ "ς" , "σ" } };
        try {
            for (int i = 0 ; i < (data.length) ; i++) {
                for (Locale locale : locales) {
                    Locale.setDefault(locale);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,("Test data corrupt: " + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4929,data[i][0],4928,data[i][0].equalsIgnoreCase(data[i][1]));
                    boolean match = org.apache.commons.io.FilenameUtils.wildcardMatch(data[i][0], data[i][1], org.apache.commons.io.IOCase.INSENSITIVE);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,(((java.util.Locale.getDefault().toString()) + ": ") + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4931,match);
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleIndependence_literalMutation5683() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation5683");
        Locale orig = Locale.getDefault();
        Locale[] locales = Locale.getAvailableLocales();
        String[][] data = new String[][]{ new String[]{ "I" , "i" } , new String[]{ "i" , "bar" } , new String[]{ "i" , "İ" } , new String[]{ "i" , "ı" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "σ" } , new String[]{ "ς" , "σ" } };
        try {
            for (int i = 0 ; i < (data.length) ; i++) {
                for (Locale locale : locales) {
                    Locale.setDefault(locale);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,("Test data corrupt: " + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4929,data[i][0],4928,data[i][0].equalsIgnoreCase(data[i][1]));
                    boolean match = org.apache.commons.io.FilenameUtils.wildcardMatch(data[i][0], data[i][1], org.apache.commons.io.IOCase.INSENSITIVE);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,(((java.util.Locale.getDefault().toString()) + ": ") + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4931,match);
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleIndependence_literalMutation5684() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation5684");
        Locale orig = Locale.getDefault();
        Locale[] locales = Locale.getAvailableLocales();
        String[][] data = new String[][]{ new String[]{ "I" , "i" } , new String[]{ "i" , "I" } , new String[]{ "foo" , "İ" } , new String[]{ "i" , "ı" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "σ" } , new String[]{ "ς" , "σ" } };
        try {
            for (int i = 0 ; i < (data.length) ; i++) {
                for (Locale locale : locales) {
                    Locale.setDefault(locale);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,("Test data corrupt: " + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4929,data[i][0],4928,data[i][0].equalsIgnoreCase(data[i][1]));
                    boolean match = org.apache.commons.io.FilenameUtils.wildcardMatch(data[i][0], data[i][1], org.apache.commons.io.IOCase.INSENSITIVE);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,(((java.util.Locale.getDefault().toString()) + ": ") + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4931,match);
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleIndependence_literalMutation5685() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation5685");
        Locale orig = Locale.getDefault();
        Locale[] locales = Locale.getAvailableLocales();
        String[][] data = new String[][]{ new String[]{ "I" , "i" } , new String[]{ "i" , "I" } , new String[]{ "i" , "bar" } , new String[]{ "i" , "ı" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "σ" } , new String[]{ "ς" , "σ" } };
        try {
            for (int i = 0 ; i < (data.length) ; i++) {
                for (Locale locale : locales) {
                    Locale.setDefault(locale);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,("Test data corrupt: " + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4929,data[i][0],4928,data[i][0].equalsIgnoreCase(data[i][1]));
                    boolean match = org.apache.commons.io.FilenameUtils.wildcardMatch(data[i][0], data[i][1], org.apache.commons.io.IOCase.INSENSITIVE);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,(((java.util.Locale.getDefault().toString()) + ": ") + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4931,match);
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleIndependence_literalMutation5686() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation5686");
        Locale orig = Locale.getDefault();
        Locale[] locales = Locale.getAvailableLocales();
        String[][] data = new String[][]{ new String[]{ "I" , "i" } , new String[]{ "i" , "I" } , new String[]{ "i" , "İ" } , new String[]{ "bar" , "ı" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "σ" } , new String[]{ "ς" , "σ" } };
        try {
            for (int i = 0 ; i < (data.length) ; i++) {
                for (Locale locale : locales) {
                    Locale.setDefault(locale);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,("Test data corrupt: " + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4929,data[i][0],4928,data[i][0].equalsIgnoreCase(data[i][1]));
                    boolean match = org.apache.commons.io.FilenameUtils.wildcardMatch(data[i][0], data[i][1], org.apache.commons.io.IOCase.INSENSITIVE);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,(((java.util.Locale.getDefault().toString()) + ": ") + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4931,match);
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleIndependence_literalMutation5687() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation5687");
        Locale orig = Locale.getDefault();
        Locale[] locales = Locale.getAvailableLocales();
        String[][] data = new String[][]{ new String[]{ "I" , "i" } , new String[]{ "i" , "I" } , new String[]{ "i" , "İ" } , new String[]{ "i" , "bar" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "σ" } , new String[]{ "ς" , "σ" } };
        try {
            for (int i = 0 ; i < (data.length) ; i++) {
                for (Locale locale : locales) {
                    Locale.setDefault(locale);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,("Test data corrupt: " + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4929,data[i][0],4928,data[i][0].equalsIgnoreCase(data[i][1]));
                    boolean match = org.apache.commons.io.FilenameUtils.wildcardMatch(data[i][0], data[i][1], org.apache.commons.io.IOCase.INSENSITIVE);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,(((java.util.Locale.getDefault().toString()) + ": ") + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4931,match);
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleIndependence_literalMutation5688() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation5688");
        Locale orig = Locale.getDefault();
        Locale[] locales = Locale.getAvailableLocales();
        String[][] data = new String[][]{ new String[]{ "I" , "i" } , new String[]{ "i" , "I" } , new String[]{ "i" , "İ" } , new String[]{ "i" , "ı" } , new String[]{ "bar" , "ς" } , new String[]{ "Σ" , "σ" } , new String[]{ "ς" , "σ" } };
        try {
            for (int i = 0 ; i < (data.length) ; i++) {
                for (Locale locale : locales) {
                    Locale.setDefault(locale);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,("Test data corrupt: " + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4929,data[i][0],4928,data[i][0].equalsIgnoreCase(data[i][1]));
                    boolean match = org.apache.commons.io.FilenameUtils.wildcardMatch(data[i][0], data[i][1], org.apache.commons.io.IOCase.INSENSITIVE);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,(((java.util.Locale.getDefault().toString()) + ": ") + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4931,match);
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleIndependence_literalMutation5689() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation5689");
        Locale orig = Locale.getDefault();
        Locale[] locales = Locale.getAvailableLocales();
        String[][] data = new String[][]{ new String[]{ "I" , "i" } , new String[]{ "i" , "I" } , new String[]{ "i" , "İ" } , new String[]{ "i" , "ı" } , new String[]{ "Σ" , "foo" } , new String[]{ "Σ" , "σ" } , new String[]{ "ς" , "σ" } };
        try {
            for (int i = 0 ; i < (data.length) ; i++) {
                for (Locale locale : locales) {
                    Locale.setDefault(locale);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,("Test data corrupt: " + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4929,data[i][0],4928,data[i][0].equalsIgnoreCase(data[i][1]));
                    boolean match = org.apache.commons.io.FilenameUtils.wildcardMatch(data[i][0], data[i][1], org.apache.commons.io.IOCase.INSENSITIVE);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,(((java.util.Locale.getDefault().toString()) + ": ") + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4931,match);
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleIndependence_literalMutation5690() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation5690");
        Locale orig = Locale.getDefault();
        Locale[] locales = Locale.getAvailableLocales();
        String[][] data = new String[][]{ new String[]{ "I" , "i" } , new String[]{ "i" , "I" } , new String[]{ "i" , "İ" } , new String[]{ "i" , "ı" } , new String[]{ "Σ" , "ς" } , new String[]{ "bar" , "σ" } , new String[]{ "ς" , "σ" } };
        try {
            for (int i = 0 ; i < (data.length) ; i++) {
                for (Locale locale : locales) {
                    Locale.setDefault(locale);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,("Test data corrupt: " + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4929,data[i][0],4928,data[i][0].equalsIgnoreCase(data[i][1]));
                    boolean match = org.apache.commons.io.FilenameUtils.wildcardMatch(data[i][0], data[i][1], org.apache.commons.io.IOCase.INSENSITIVE);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,(((java.util.Locale.getDefault().toString()) + ": ") + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4931,match);
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleIndependence_literalMutation5691() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation5691");
        Locale orig = Locale.getDefault();
        Locale[] locales = Locale.getAvailableLocales();
        String[][] data = new String[][]{ new String[]{ "I" , "i" } , new String[]{ "i" , "I" } , new String[]{ "i" , "İ" } , new String[]{ "i" , "ı" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "bar" } , new String[]{ "ς" , "σ" } };
        try {
            for (int i = 0 ; i < (data.length) ; i++) {
                for (Locale locale : locales) {
                    Locale.setDefault(locale);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,("Test data corrupt: " + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4929,data[i][0],4928,data[i][0].equalsIgnoreCase(data[i][1]));
                    boolean match = org.apache.commons.io.FilenameUtils.wildcardMatch(data[i][0], data[i][1], org.apache.commons.io.IOCase.INSENSITIVE);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,(((java.util.Locale.getDefault().toString()) + ": ") + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4931,match);
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleIndependence_literalMutation5692() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation5692");
        Locale orig = Locale.getDefault();
        Locale[] locales = Locale.getAvailableLocales();
        String[][] data = new String[][]{ new String[]{ "I" , "i" } , new String[]{ "i" , "I" } , new String[]{ "i" , "İ" } , new String[]{ "i" , "ı" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "σ" } , new String[]{ "foo" , "σ" } };
        try {
            for (int i = 0 ; i < (data.length) ; i++) {
                for (Locale locale : locales) {
                    Locale.setDefault(locale);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,("Test data corrupt: " + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4929,data[i][0],4928,data[i][0].equalsIgnoreCase(data[i][1]));
                    boolean match = org.apache.commons.io.FilenameUtils.wildcardMatch(data[i][0], data[i][1], org.apache.commons.io.IOCase.INSENSITIVE);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,(((java.util.Locale.getDefault().toString()) + ": ") + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4931,match);
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleIndependence_literalMutation5693() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation5693");
        Locale orig = Locale.getDefault();
        Locale[] locales = Locale.getAvailableLocales();
        String[][] data = new String[][]{ new String[]{ "I" , "i" } , new String[]{ "i" , "I" } , new String[]{ "i" , "İ" } , new String[]{ "i" , "ı" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "σ" } , new String[]{ "ς" , "bar" } };
        try {
            for (int i = 0 ; i < (data.length) ; i++) {
                for (Locale locale : locales) {
                    Locale.setDefault(locale);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,("Test data corrupt: " + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4929,data[i][0],4928,data[i][0].equalsIgnoreCase(data[i][1]));
                    boolean match = org.apache.commons.io.FilenameUtils.wildcardMatch(data[i][0], data[i][1], org.apache.commons.io.IOCase.INSENSITIVE);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,(((java.util.Locale.getDefault().toString()) + ": ") + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4931,match);
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleIndependence_literalMutation5694() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation5694");
        Locale orig = Locale.getDefault();
        Locale[] locales = Locale.getAvailableLocales();
        String[][] data = new String[][]{ new String[]{ "I" , "i" } , new String[]{ "i" , "I" } , new String[]{ "i" , "İ" } , new String[]{ "i" , "ı" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "σ" } , new String[]{ "ς" , "σ" } };
        try {
            for (int i = 1 ; i < (data.length) ; i++) {
                for (Locale locale : locales) {
                    Locale.setDefault(locale);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,("Test data corrupt: " + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4929,data[i][0],4928,data[i][0].equalsIgnoreCase(data[i][1]));
                    boolean match = org.apache.commons.io.FilenameUtils.wildcardMatch(data[i][0], data[i][1], org.apache.commons.io.IOCase.INSENSITIVE);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,(((java.util.Locale.getDefault().toString()) + ": ") + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4931,match);
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleIndependence_literalMutation5695() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation5695");
        Locale orig = Locale.getDefault();
        Locale[] locales = Locale.getAvailableLocales();
        String[][] data = new String[][]{ new String[]{ "I" , "i" } , new String[]{ "i" , "I" } , new String[]{ "i" , "İ" } , new String[]{ "i" , "ı" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "σ" } , new String[]{ "ς" , "σ" } };
        try {
            for (int i = -1 ; i < (data.length) ; i++) {
                for (Locale locale : locales) {
                    Locale.setDefault(locale);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,("Test data corrupt: " + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4929,data[i][0],4928,data[i][0].equalsIgnoreCase(data[i][1]));
                    boolean match = org.apache.commons.io.FilenameUtils.wildcardMatch(data[i][0], data[i][1], org.apache.commons.io.IOCase.INSENSITIVE);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,(((java.util.Locale.getDefault().toString()) + ": ") + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4931,match);
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleIndependence_literalMutation5696() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation5696");
        Locale orig = Locale.getDefault();
        Locale[] locales = Locale.getAvailableLocales();
        String[][] data = new String[][]{ new String[]{ "I" , "i" } , new String[]{ "i" , "I" } , new String[]{ "i" , "İ" } , new String[]{ "i" , "ı" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "σ" } , new String[]{ "ς" , "σ" } };
        try {
            for (int i = 0 ; i < (data.length) ; i++) {
                for (Locale locale : locales) {
                    Locale.setDefault(locale);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,("Test data corrupt: " + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4929,data[i][0],4928,data[i][0].equalsIgnoreCase(data[i][1]));
                    boolean match = org.apache.commons.io.FilenameUtils.wildcardMatch(data[i][0], data[i][1], org.apache.commons.io.IOCase.INSENSITIVE);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,(((java.util.Locale.getDefault().toString()) + ": ") + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4931,match);
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleIndependence_literalMutation5697() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation5697");
        Locale orig = Locale.getDefault();
        Locale[] locales = Locale.getAvailableLocales();
        String[][] data = new String[][]{ new String[]{ "I" , "i" } , new String[]{ "i" , "I" } , new String[]{ "i" , "İ" } , new String[]{ "i" , "ı" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "σ" } , new String[]{ "ς" , "σ" } };
        try {
            for (int i = 0 ; i < (data.length) ; i++) {
                for (Locale locale : locales) {
                    Locale.setDefault(locale);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,("Test data corrupt: " + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4929,data[i][0],4928,data[i][0].equalsIgnoreCase(data[i][1]));
                    boolean match = org.apache.commons.io.FilenameUtils.wildcardMatch(data[i][1], data[i][1], org.apache.commons.io.IOCase.INSENSITIVE);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,(((java.util.Locale.getDefault().toString()) + ": ") + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4931,match);
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleIndependence_literalMutation5698() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation5698");
        Locale orig = Locale.getDefault();
        Locale[] locales = Locale.getAvailableLocales();
        String[][] data = new String[][]{ new String[]{ "I" , "i" } , new String[]{ "i" , "I" } , new String[]{ "i" , "İ" } , new String[]{ "i" , "ı" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "σ" } , new String[]{ "ς" , "σ" } };
        try {
            for (int i = 0 ; i < (data.length) ; i++) {
                for (Locale locale : locales) {
                    Locale.setDefault(locale);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,("Test data corrupt: " + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4929,data[i][0],4928,data[i][0].equalsIgnoreCase(data[i][1]));
                    boolean match = org.apache.commons.io.FilenameUtils.wildcardMatch(data[i][-1], data[i][1], org.apache.commons.io.IOCase.INSENSITIVE);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,(((java.util.Locale.getDefault().toString()) + ": ") + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4931,match);
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleIndependence_literalMutation5699() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation5699");
        Locale orig = Locale.getDefault();
        Locale[] locales = Locale.getAvailableLocales();
        String[][] data = new String[][]{ new String[]{ "I" , "i" } , new String[]{ "i" , "I" } , new String[]{ "i" , "İ" } , new String[]{ "i" , "ı" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "σ" } , new String[]{ "ς" , "σ" } };
        try {
            for (int i = 0 ; i < (data.length) ; i++) {
                for (Locale locale : locales) {
                    Locale.setDefault(locale);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,("Test data corrupt: " + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4929,data[i][0],4928,data[i][0].equalsIgnoreCase(data[i][1]));
                    boolean match = org.apache.commons.io.FilenameUtils.wildcardMatch(data[i][0], data[i][1], org.apache.commons.io.IOCase.INSENSITIVE);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,(((java.util.Locale.getDefault().toString()) + ": ") + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4931,match);
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleIndependence_literalMutation5700() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation5700");
        Locale orig = Locale.getDefault();
        Locale[] locales = Locale.getAvailableLocales();
        String[][] data = new String[][]{ new String[]{ "I" , "i" } , new String[]{ "i" , "I" } , new String[]{ "i" , "İ" } , new String[]{ "i" , "ı" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "σ" } , new String[]{ "ς" , "σ" } };
        try {
            for (int i = 0 ; i < (data.length) ; i++) {
                for (Locale locale : locales) {
                    Locale.setDefault(locale);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,("Test data corrupt: " + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4929,data[i][0],4928,data[i][0].equalsIgnoreCase(data[i][1]));
                    boolean match = org.apache.commons.io.FilenameUtils.wildcardMatch(data[i][0], data[i][2], org.apache.commons.io.IOCase.INSENSITIVE);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,(((java.util.Locale.getDefault().toString()) + ": ") + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4931,match);
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleIndependence_literalMutation5701() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation5701");
        Locale orig = Locale.getDefault();
        Locale[] locales = Locale.getAvailableLocales();
        String[][] data = new String[][]{ new String[]{ "I" , "i" } , new String[]{ "i" , "I" } , new String[]{ "i" , "İ" } , new String[]{ "i" , "ı" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "σ" } , new String[]{ "ς" , "σ" } };
        try {
            for (int i = 0 ; i < (data.length) ; i++) {
                for (Locale locale : locales) {
                    Locale.setDefault(locale);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,("Test data corrupt: " + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4929,data[i][0],4928,data[i][0].equalsIgnoreCase(data[i][1]));
                    boolean match = org.apache.commons.io.FilenameUtils.wildcardMatch(data[i][0], data[i][0], org.apache.commons.io.IOCase.INSENSITIVE);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,(((java.util.Locale.getDefault().toString()) + ": ") + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4931,match);
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleIndependence_literalMutation5702() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation5702");
        Locale orig = Locale.getDefault();
        Locale[] locales = Locale.getAvailableLocales();
        String[][] data = new String[][]{ new String[]{ "I" , "i" } , new String[]{ "i" , "I" } , new String[]{ "i" , "İ" } , new String[]{ "i" , "ı" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "σ" } , new String[]{ "ς" , "σ" } };
        try {
            for (int i = 0 ; i < (data.length) ; i++) {
                for (Locale locale : locales) {
                    Locale.setDefault(locale);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,("Test data corrupt: " + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4929,data[i][0],4928,data[i][0].equalsIgnoreCase(data[i][1]));
                    boolean match = org.apache.commons.io.FilenameUtils.wildcardMatch(data[i][0], data[i][0], org.apache.commons.io.IOCase.INSENSITIVE);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,(((java.util.Locale.getDefault().toString()) + ": ") + i));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4931,match);
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


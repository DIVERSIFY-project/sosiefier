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

    public void testSplitOnTokens_literalMutation3899() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation3899");
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

    public void testSplitOnTokens_literalMutation3900() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation3900");
        assertArrayEquals(new String[]{ "Ad" , "*" , "foo" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
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

    public void testSplitOnTokens_literalMutation3901() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation3901");
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

    public void testSplitOnTokens_literalMutation3902() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation3902");
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

    public void testSplitOnTokens_literalMutation3903() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation3903");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "foo" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation3904() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation3904");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "foo" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation3905() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation3905");
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

    public void testSplitOnTokens_literalMutation3906() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation3906");
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

    public void testSplitOnTokens_literalMutation3907() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation3907");
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

    public void testSplitOnTokens_literalMutation3908() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation3908");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "foo" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation3909() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation3909");
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

    public void testSplitOnTokens_literalMutation3910() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation3910");
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

    public void testSplitOnTokens_literalMutation3911() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation3911");
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

    public void testSplitOnTokens_literalMutation3912() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation3912");
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

    public void testSplitOnTokens_literalMutation3913() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation3913");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "foo" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation3914() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation3914");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "foo" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation3915() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation3915");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("foo"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation3916() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation3916");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "foo" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation3917() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation3917");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("foo"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation3918() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation3918");
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

    public void testSplitOnTokens_literalMutation3919() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation3919");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "foo" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation3920() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation3920");
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

    public void testSplitOnTokens_literalMutation3921() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation3921");
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

    public void testSplitOnTokens_literalMutation3922() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation3922");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("foo"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation3923() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation3923");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "foo" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation3924() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation3924");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "foo" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation3925() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation3925");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "foo" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation3926() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation3926");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "foo" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation3927() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation3927");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "foo" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation3928() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation3928");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("foo"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation3929() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation3929");
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

    public void testSplitOnTokens_literalMutation3930() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation3930");
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

    public void testSplitOnTokens_literalMutation3931() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation3931");
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

    public void testSplitOnTokens_literalMutation3932() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation3932");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "foo" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation3933() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation3933");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("foo"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSplitOnTokens_literalMutation3934() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation3934");
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

    public void testSplitOnTokens_literalMutation3935() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSplitOnTokens_literalMutation3935");
        assertArrayEquals(new String[]{ "Ad" , "*" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad*er"));
        assertArrayEquals(new String[]{ "Ad" , "?" , "er" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Ad?er"));
        assertArrayEquals(new String[]{ "Test" , "*" , "?" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test*?One"));
        assertArrayEquals(new String[]{ "Test" , "?" , "*" , "One" }, org.apache.commons.io.FilenameUtils.splitOnTokens("Test?*One"));
        assertArrayEquals(new String[]{ "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("****"));
        assertArrayEquals(new String[]{ "*" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*??*"));
        assertArrayEquals(new String[]{ "*" , "?" , "*" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("*?**?*"));
        assertArrayEquals(new String[]{ "h" , "?" , "?" , "*" }, org.apache.commons.io.FilenameUtils.splitOnTokens("h??*"));
        assertArrayEquals(new String[]{ "" }, org.apache.commons.io.FilenameUtils.splitOnTokens("foo"));
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
        assertMatch("foo", "log.txt", true);
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
        assertMatch("log.txt", "foo", true);
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

    public void testMatch2_literalMutation3804() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3804");
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

    public void testMatch2_literalMutation3805() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3805");
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

    public void testMatch2_literalMutation3806() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3806");
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

    public void testMatch2_literalMutation3807() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3807");
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

    public void testMatch2_literalMutation3808() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3808");
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

    public void testMatch2_literalMutation3809() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3809");
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

    public void testMatch2_literalMutation3810() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3810");
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

    public void testMatch2_literalMutation3811() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3811");
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

    public void testMatch2_literalMutation3812() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3812");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "foo", false);
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

    public void testMatch2_literalMutation3813() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3813");
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

    public void testMatch2_literalMutation3814() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3814");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("foo", "*log.txt*", true);
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

    public void testMatch2_literalMutation3815() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3815");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "foo", true);
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

    public void testMatch2_literalMutation3816() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3816");
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

    public void testMatch2_literalMutation3817() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3817");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("foo", "*.txt", true);
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

    public void testMatch2_literalMutation3818() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3818");
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

    public void testMatch2_literalMutation3819() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3819");
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

    public void testMatch2_literalMutation3820() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3820");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("foo", "*.txt", false);
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

    public void testMatch2_literalMutation3821() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3821");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "foo", false);
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

    public void testMatch2_literalMutation3822() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3822");
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

    public void testMatch2_literalMutation3823() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3823");
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

    public void testMatch2_literalMutation3824() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3824");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "foo", true);
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

    public void testMatch2_literalMutation3825() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3825");
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

    public void testMatch2_literalMutation3826() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3826");
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

    public void testMatch2_literalMutation3827() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3827");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "foo", false);
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

    public void testMatch2_literalMutation3828() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3828");
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

    public void testMatch2_literalMutation3829() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3829");
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

    public void testMatch2_literalMutation3830() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3830");
        assertMatch("log.txt", "log.txt", true);
        assertMatch("log.txt1", "log.txt", false);
        assertMatch("log.txt", "log.txt*", true);
        assertMatch("log.txt", "log.txt*1", false);
        assertMatch("log.txt", "*log.txt*", true);
        assertMatch("log.txt", "*.txt", true);
        assertMatch("txt.log", "*.txt", false);
        assertMatch("config.ini", "*.ini", true);
        assertMatch("config.txt.bak", "con*.txt", false);
        assertMatch("log.txt9", "foo", true);
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

    public void testMatch2_literalMutation3831() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3831");
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

    public void testMatch2_literalMutation3832() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3832");
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

    public void testMatch2_literalMutation3833() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3833");
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

    public void testMatch2_literalMutation3834() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3834");
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

    public void testMatch2_literalMutation3835() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3835");
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

    public void testMatch2_literalMutation3836() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3836");
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
        assertMatch("progtestcase.java~5~", "foo", true);
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

    public void testMatch2_literalMutation3837() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3837");
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

    public void testMatch2_literalMutation3838() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3838");
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

    public void testMatch2_literalMutation3839() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3839");
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
        assertMatch("progtestcase.java;5~", "foo", false);
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

    public void testMatch2_literalMutation3840() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3840");
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

    public void testMatch2_literalMutation3841() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3841");
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

    public void testMatch2_literalMutation3842() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3842");
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
        assertMatch("progtestcase.java~5", "foo", false);
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

    public void testMatch2_literalMutation3843() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3843");
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

    public void testMatch2_literalMutation3844() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3844");
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

    public void testMatch2_literalMutation3845() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3845");
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
        assertMatch("log.txt", "foo", true);
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

    public void testMatch2_literalMutation3846() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3846");
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

    public void testMatch2_literalMutation3847() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3847");
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

    public void testMatch2_literalMutation3848() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3848");
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

    public void testMatch2_literalMutation3849() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3849");
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

    public void testMatch2_literalMutation3850() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3850");
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
        assertMatch("foo", "log.txt??", true);
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

    public void testMatch2_literalMutation3851() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3851");
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
        assertMatch("log.txt12", "foo", true);
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

    public void testMatch2_literalMutation3852() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3852");
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

    public void testMatch2_literalMutation3853() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3853");
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

    public void testMatch2_literalMutation3854() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3854");
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
        assertMatch("log.log", "foo", true);
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

    public void testMatch2_literalMutation3855() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3855");
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

    public void testMatch2_literalMutation3856() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3856");
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
        assertMatch("foo", "log**", true);
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

    public void testMatch2_literalMutation3857() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3857");
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

    public void testMatch2_literalMutation3858() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3858");
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

    public void testMatch2_literalMutation3859() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3859");
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

    public void testMatch2_literalMutation3860() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3860");
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
        assertMatch("log.log", "foo", true);
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

    public void testMatch2_literalMutation3861() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3861");
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

    public void testMatch2_literalMutation3862() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3862");
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
        assertMatch("foo", "**.log", true);
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

    public void testMatch2_literalMutation3863() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3863");
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
        assertMatch("log.log", "foo", true);
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

    public void testMatch2_literalMutation3864() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3864");
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

    public void testMatch2_literalMutation3865() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3865");
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

    public void testMatch2_literalMutation3866() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3866");
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
        assertMatch("log.log", "foo", true);
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

    public void testMatch2_literalMutation3867() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3867");
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

    public void testMatch2_literalMutation3868() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3868");
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
        assertMatch("foo", "log*log", true);
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

    public void testMatch2_literalMutation3869() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3869");
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

    public void testMatch2_literalMutation3870() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3870");
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

    public void testMatch2_literalMutation3871() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3871");
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
        assertMatch("foo", "log*", true);
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

    public void testMatch2_literalMutation3872() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3872");
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
        assertMatch("log.log", "foo", true);
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

    public void testMatch2_literalMutation3873() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3873");
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

    public void testMatch2_literalMutation3874() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3874");
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

    public void testMatch2_literalMutation3875() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3875");
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
        assertMatch("log.log", "foo", true);
        assertMatch("log.log", "*.log", true);
        assertMatch("log.log", "*log", true);
        assertMatch("log.log", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation3876() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3876");
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

    public void testMatch2_literalMutation3877() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3877");
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

    public void testMatch2_literalMutation3878() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3878");
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

    public void testMatch2_literalMutation3879() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3879");
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

    public void testMatch2_literalMutation3880() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3880");
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

    public void testMatch2_literalMutation3881() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3881");
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

    public void testMatch2_literalMutation3882() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3882");
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

    public void testMatch2_literalMutation3883() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3883");
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
        assertMatch("foo", "*log?", false);
        assertMatch("log.log", "*log?*", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation3884() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3884");
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

    public void testMatch2_literalMutation3885() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3885");
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

    public void testMatch2_literalMutation3886() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3886");
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

    public void testMatch2_literalMutation3887() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3887");
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
        assertMatch("log.log", "foo", true);
        assertMatch("log.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation3888() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3888");
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

    public void testMatch2_literalMutation3889() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3889");
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
        assertMatch("foo", "*log?abc", true);
        assertMatch("log.log.abc.log.abc", "*log?abc", true);
        assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMatch2_literalMutation3890() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3890");
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

    public void testMatch2_literalMutation3891() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3891");
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

    public void testMatch2_literalMutation3892() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3892");
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

    public void testMatch2_literalMutation3893() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3893");
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

    public void testMatch2_literalMutation3894() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3894");
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

    public void testMatch2_literalMutation3895() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3895");
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

    public void testMatch2_literalMutation3896() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3896");
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

    public void testMatch2_literalMutation3897() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatch2_literalMutation3897");
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
public void test_IO_246_literalMutation3937() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation3937");
        assertMatch("aaa", "foo", true);
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
public void test_IO_246_literalMutation3938() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation3938");
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
public void test_IO_246_literalMutation3939() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation3939");
        assertMatch("aaa", "aa*?", true);
        assertMatch("foo", "?*", false);
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
public void test_IO_246_literalMutation3940() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation3940");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "foo", false);
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
public void test_IO_246_literalMutation3941() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation3941");
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
public void test_IO_246_literalMutation3942() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation3942");
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
public void test_IO_246_literalMutation3943() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation3943");
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
public void test_IO_246_literalMutation3944() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation3944");
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
public void test_IO_246_literalMutation3945() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation3945");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("foo", "aa?*", false);
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
public void test_IO_246_literalMutation3946() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation3946");
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
public void test_IO_246_literalMutation3947() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation3947");
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
public void test_IO_246_literalMutation3948() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation3948");
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
public void test_IO_246_literalMutation3949() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation3949");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "foo", true);
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
public void test_IO_246_literalMutation3950() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation3950");
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
public void test_IO_246_literalMutation3951() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation3951");
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
public void test_IO_246_literalMutation3952() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation3952");
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
public void test_IO_246_literalMutation3953() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation3953");
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
public void test_IO_246_literalMutation3954() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation3954");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("foo", "?*", true);
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
public void test_IO_246_literalMutation3955() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation3955");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "foo", true);
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
public void test_IO_246_literalMutation3956() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation3956");
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
public void test_IO_246_literalMutation3957() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation3957");
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
public void test_IO_246_literalMutation3958() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation3958");
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
public void test_IO_246_literalMutation3959() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation3959");
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
public void test_IO_246_literalMutation3960() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation3960");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("foo", "a?", false);
        assertMatch("aa", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation3961() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation3961");
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
public void test_IO_246_literalMutation3962() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation3962");
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
public void test_IO_246_literalMutation3963() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation3963");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("foo", "aa?", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation3964() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation3964");
        assertMatch("aaa", "aa*?", true);
        assertMatch("", "?*", false);
        assertMatch("a", "a?*", false);
        assertMatch("aa", "aa?*", false);
        assertMatch("a", "?*", true);
        assertMatch("aa", "?*", true);
        assertMatch("aaa", "?*", true);
        assertMatch("", "?", false);
        assertMatch("a", "a?", false);
        assertMatch("aa", "foo", false);
        assertMatch("aab", "aa?", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation3965() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation3965");
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
public void test_IO_246_literalMutation3966() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation3966");
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
public void test_IO_246_literalMutation3967() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation3967");
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
        assertMatch("aab", "foo", true);
        assertMatch("aaa", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation3968() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation3968");
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
public void test_IO_246_literalMutation3969() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation3969");
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
        assertMatch("foo", "*a", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation3970() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation3970");
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
        assertMatch("aaa", "foo", true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * See https://issues.apache.org/jira/browse/IO-246
     */
public void test_IO_246_literalMutation3971() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_IO_246_literalMutation3971");
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

    public void testLocaleIndependence_literalMutation3786() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation3786");
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

    public void testLocaleIndependence_literalMutation3787() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation3787");
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

    public void testLocaleIndependence_literalMutation3788() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation3788");
        Locale orig = Locale.getDefault();
        Locale[] locales = Locale.getAvailableLocales();
        String[][] data = new String[][]{ new String[]{ "I" , "i" } , new String[]{ "i" , "foo" } , new String[]{ "i" , "İ" } , new String[]{ "i" , "ı" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "σ" } , new String[]{ "ς" , "σ" } };
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

    public void testLocaleIndependence_literalMutation3789() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation3789");
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

    public void testLocaleIndependence_literalMutation3790() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation3790");
        Locale orig = Locale.getDefault();
        Locale[] locales = Locale.getAvailableLocales();
        String[][] data = new String[][]{ new String[]{ "I" , "i" } , new String[]{ "i" , "I" } , new String[]{ "i" , "foo" } , new String[]{ "i" , "ı" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "σ" } , new String[]{ "ς" , "σ" } };
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

    public void testLocaleIndependence_literalMutation3791() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation3791");
        Locale orig = Locale.getDefault();
        Locale[] locales = Locale.getAvailableLocales();
        String[][] data = new String[][]{ new String[]{ "I" , "i" } , new String[]{ "i" , "I" } , new String[]{ "i" , "İ" } , new String[]{ "foo" , "ı" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "σ" } , new String[]{ "ς" , "σ" } };
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

    public void testLocaleIndependence_literalMutation3792() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation3792");
        Locale orig = Locale.getDefault();
        Locale[] locales = Locale.getAvailableLocales();
        String[][] data = new String[][]{ new String[]{ "I" , "i" } , new String[]{ "i" , "I" } , new String[]{ "i" , "İ" } , new String[]{ "i" , "foo" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "σ" } , new String[]{ "ς" , "σ" } };
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

    public void testLocaleIndependence_literalMutation3793() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation3793");
        Locale orig = Locale.getDefault();
        Locale[] locales = Locale.getAvailableLocales();
        String[][] data = new String[][]{ new String[]{ "I" , "i" } , new String[]{ "i" , "I" } , new String[]{ "i" , "İ" } , new String[]{ "i" , "ı" } , new String[]{ "foo" , "ς" } , new String[]{ "Σ" , "σ" } , new String[]{ "ς" , "σ" } };
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

    public void testLocaleIndependence_literalMutation3794() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation3794");
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

    public void testLocaleIndependence_literalMutation3795() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation3795");
        Locale orig = Locale.getDefault();
        Locale[] locales = Locale.getAvailableLocales();
        String[][] data = new String[][]{ new String[]{ "I" , "i" } , new String[]{ "i" , "I" } , new String[]{ "i" , "İ" } , new String[]{ "i" , "ı" } , new String[]{ "Σ" , "ς" } , new String[]{ "foo" , "σ" } , new String[]{ "ς" , "σ" } };
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

    public void testLocaleIndependence_literalMutation3796() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation3796");
        Locale orig = Locale.getDefault();
        Locale[] locales = Locale.getAvailableLocales();
        String[][] data = new String[][]{ new String[]{ "I" , "i" } , new String[]{ "i" , "I" } , new String[]{ "i" , "İ" } , new String[]{ "i" , "ı" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "foo" } , new String[]{ "ς" , "σ" } };
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

    public void testLocaleIndependence_literalMutation3797() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation3797");
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

    public void testLocaleIndependence_literalMutation3798() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation3798");
        Locale orig = Locale.getDefault();
        Locale[] locales = Locale.getAvailableLocales();
        String[][] data = new String[][]{ new String[]{ "I" , "i" } , new String[]{ "i" , "I" } , new String[]{ "i" , "İ" } , new String[]{ "i" , "ı" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "σ" } , new String[]{ "ς" , "foo" } };
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

    public void testLocaleIndependence_literalMutation3799() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation3799");
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

    public void testLocaleIndependence_literalMutation3800() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation3800");
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

    public void testLocaleIndependence_literalMutation3801() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation3801");
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
}


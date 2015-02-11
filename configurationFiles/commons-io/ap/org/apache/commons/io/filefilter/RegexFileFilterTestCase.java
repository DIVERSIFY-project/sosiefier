package org.apache.commons.io.filefilter;

import java.io.File;
import org.apache.commons.io.testtools.FileBasedTestCase;
import org.apache.commons.io.IOCase;
import java.util.regex.Pattern;
import org.junit.Test;

/** 
 * Used to test RegexFileFilterUtils.
 */
public class RegexFileFilterTestCase extends FileBasedTestCase {
    public RegexFileFilterTestCase(String name) {
        super(name);
    }

    @Override
    public void setUp() {
        FileBasedTestCase.getTestDirectory().mkdirs();
    }

    @Override
    public void tearDown() throws Exception {
        org.apache.commons.io.FileUtils.deleteDirectory(FileBasedTestCase.getTestDirectory());
    }

    public void assertFiltering(IOFileFilter filter, File file, boolean expected) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1283,((((("Filter(File) " + (filter.getClass().getName())) + " not ") + expected) + " for ") + file));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1284,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1286,filter,1285,filter.accept(file));
        if ((file != null) && ((file.getParentFile()) != null)) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1287,((((("Filter(File, String) " + (filter.getClass().getName())) + " not ") + expected) + " for ") + file));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1288,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1290,filter,1289,filter.accept(file.getParentFile(), file.getName()));
        } else if (file == null) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1291,(((("Filter(File, String) " + (filter.getClass().getName())) + " not ") + expected) + " for null"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1292,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1294,filter,1293,filter.accept(file));
        } 
    }

    @Test(timeout = 1000)
    public void testRegex_add919() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_add919");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRegex_add920() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_add920");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRegex_add921() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_add921");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRegex_add922() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_add922");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRegex_add923() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_add923");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRegex_add924() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_add924");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRegex_add925() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_add925");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRegex_add926() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_add926");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRegex_add927() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_add927");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRegex_add928() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_add928");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRegex_add929() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_add929");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRegex_add930() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_add930");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRegex_add931() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_add931");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRegex_add932() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_add932");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRegex_add933() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_add933");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegex() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex");
        IOFileFilter filter = new RegexFileFilter("foo");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegex_literalMutation2218() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_literalMutation2218");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("foo"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegex_literalMutation2219() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_literalMutation2219");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), false);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegex_literalMutation2220() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_literalMutation2220");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("foo"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegex_literalMutation2221() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_literalMutation2221");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), false);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegex_literalMutation2222() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_literalMutation2222");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("foo"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegex_literalMutation2223() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_literalMutation2223");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), true);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegex_literalMutation2224() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_literalMutation2224");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("foo");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegex_literalMutation2225() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_literalMutation2225");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("foo"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegex_literalMutation2226() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_literalMutation2226");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), false);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegex_literalMutation2227() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_literalMutation2227");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("foo"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegex_literalMutation2228() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_literalMutation2228");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegex_literalMutation2229() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_literalMutation2229");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("foo"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegex_literalMutation2230() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_literalMutation2230");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegex_literalMutation2231() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_literalMutation2231");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("foo", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegex_literalMutation2232() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_literalMutation2232");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("foo"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegex_literalMutation2233() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_literalMutation2233");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), false);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegex_literalMutation2234() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_literalMutation2234");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("foo"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegex_literalMutation2235() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_literalMutation2235");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegex_literalMutation2236() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_literalMutation2236");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("foo"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegex_literalMutation2237() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_literalMutation2237");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegex_literalMutation2238() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_literalMutation2238");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("foo" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegex_literalMutation2239() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_literalMutation2239");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("foo"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegex_literalMutation2240() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_literalMutation2240");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegex_literalMutation2241() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_literalMutation2241");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("foo"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegex_literalMutation2242() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_literalMutation2242");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), false);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegex_literalMutation2243() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_literalMutation2243");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("foo"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegex_literalMutation2244() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_literalMutation2244");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegex_literalMutation2245() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_literalMutation2245");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("foo" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegex_literalMutation2246() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_literalMutation2246");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("foo"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegex_literalMutation2247() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_literalMutation2247");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegex_literalMutation2248() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_literalMutation2248");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("foo"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegex_literalMutation2249() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_literalMutation2249");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), false);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegex_literalMutation2250() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_literalMutation2250");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("foo"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegex_literalMutation2251() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_literalMutation2251");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRegex_remove755() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_remove755");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRegex_remove756() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_remove756");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRegex_remove757() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_remove757");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRegex_remove758() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_remove758");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRegex_remove759() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_remove759");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRegex_remove760() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_remove760");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRegex_remove761() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_remove761");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRegex_remove762() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_remove762");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRegex_remove763() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_remove763");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRegex_remove764() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_remove764");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRegex_remove765() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_remove765");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRegex_remove766() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_remove766");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRegex_remove767() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_remove767");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRegex_remove768() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_remove768");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRegex_remove769() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegex_remove769");
        IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        assertFiltering(filter, new File("test-10.java"), true);
        assertFiltering(filter, new File("test-.java"), false);
        filter = new RegexFileFilter("^[Tt]est.java$");
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), false);
        filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , Pattern.CASE_INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        filter = new RegexFileFilter("^test.java$" , IOCase.INSENSITIVE);
        assertFiltering(filter, new File("Test.java"), true);
        assertFiltering(filter, new File("test.java"), true);
        assertFiltering(filter, new File("tEST.java"), true);
        try {
            new RegexFileFilter(((String)(null)));
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , Pattern.CASE_INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((String)(null)) , IOCase.INSENSITIVE);
        } catch (IllegalArgumentException ex) {
        }
        try {
            new RegexFileFilter(((Pattern)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


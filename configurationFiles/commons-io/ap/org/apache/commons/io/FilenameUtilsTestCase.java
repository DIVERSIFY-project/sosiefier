package org.apache.commons.io;

import java.io.File;
import org.apache.commons.io.testtools.FileBasedTestCase;
import org.junit.Test;

/** 
 * This is used to test FilenameUtils for correctness.
 * 
 * @version $Id$
 * @see FilenameUtils
 */
public class FilenameUtilsTestCase extends FileBasedTestCase {
    private static final String SEP = "" + (File.separatorChar);

    private static final boolean WINDOWS = (File.separatorChar) == '\\';

    private File testFile1;

    private File testFile2;

    private int testFile1Size;

    private int testFile2Size;

    public FilenameUtilsTestCase(String name) {
        super(name);
        testFile1 = new File(FileBasedTestCase.getTestDirectory() , "file1-test.txt");
        testFile2 = new File(FileBasedTestCase.getTestDirectory() , "file1a-test.txt");
        testFile1Size = ((int)(testFile1.length()));
        testFile2Size = ((int)(testFile2.length()));
    }

    /** 
     * @see junit.framework.TestCase#setUp()
     */
@Override
    protected void setUp() throws Exception {
        FileBasedTestCase.getTestDirectory().mkdirs();
        createFile(testFile1, testFile1Size);
        createFile(testFile2, testFile2Size);
        org.apache.commons.io.FileUtils.deleteDirectory(FileBasedTestCase.getTestDirectory());
        FileBasedTestCase.getTestDirectory().mkdirs();
        createFile(testFile1, testFile1Size);
        createFile(testFile2, testFile2Size);
    }

    /** 
     * @see junit.framework.TestCase#tearDown()
     */
@Override
    protected void tearDown() throws Exception {
        org.apache.commons.io.FileUtils.deleteDirectory(FileBasedTestCase.getTestDirectory());
    }

    public void testNormalize() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNormalize");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4090,null,4089,org.apache.commons.io.FilenameUtils.normalize(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4092,null,4091,org.apache.commons.io.FilenameUtils.normalize(":"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4094,null,4093,org.apache.commons.io.FilenameUtils.normalize("1:\\a\\b\\c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4096,null,4095,org.apache.commons.io.FilenameUtils.normalize("1:"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4098,null,4097,org.apache.commons.io.FilenameUtils.normalize("1:a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4100,null,4099,org.apache.commons.io.FilenameUtils.normalize("\\\\\\a\\b\\c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4102,null,4101,org.apache.commons.io.FilenameUtils.normalize("\\\\a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4103,(((("a" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4105,null,4104,org.apache.commons.io.FilenameUtils.normalize("a\\b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4106,(((((("" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4108,null,4107,org.apache.commons.io.FilenameUtils.normalize("\\a\\b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4109,(((((("C:" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4111,null,4110,org.apache.commons.io.FilenameUtils.normalize("C:\\a\\b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4112,(((((((((("" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "server") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4114,null,4113,org.apache.commons.io.FilenameUtils.normalize("\\\\server\\a\\b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4115,(((((("~" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4117,null,4116,org.apache.commons.io.FilenameUtils.normalize("~\\a\\b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4118,(((((("~user" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4120,null,4119,org.apache.commons.io.FilenameUtils.normalize("~user\\a\\b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4121,(("a" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4123,null,4122,org.apache.commons.io.FilenameUtils.normalize("a/b/../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4125,null,4124,org.apache.commons.io.FilenameUtils.normalize("a/b/../../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4126,("c" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4128,null,4127,org.apache.commons.io.FilenameUtils.normalize("a/b/../../c/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4130,null,4129,org.apache.commons.io.FilenameUtils.normalize("a/b/../../../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4131,("a" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4133,null,4132,org.apache.commons.io.FilenameUtils.normalize("a/b/.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4134,("a" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4136,null,4135,org.apache.commons.io.FilenameUtils.normalize("a/b/../"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4138,null,4137,org.apache.commons.io.FilenameUtils.normalize("a/b/../.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4140,null,4139,org.apache.commons.io.FilenameUtils.normalize("a/b/../../"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4142,null,4141,org.apache.commons.io.FilenameUtils.normalize("a/b/../../.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4143,(("a" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4145,null,4144,org.apache.commons.io.FilenameUtils.normalize("a/b/../c/../d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4146,((("a" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "d") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4148,null,4147,org.apache.commons.io.FilenameUtils.normalize("a/b/../c/../d/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4149,(((("a" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4151,null,4150,org.apache.commons.io.FilenameUtils.normalize("a/b//d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4152,((("a" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4154,null,4153,org.apache.commons.io.FilenameUtils.normalize("a/b/././."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4155,((("a" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4157,null,4156,org.apache.commons.io.FilenameUtils.normalize("a/b/./././"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4158,("a" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4160,null,4159,org.apache.commons.io.FilenameUtils.normalize("./a/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4162,null,4161,org.apache.commons.io.FilenameUtils.normalize("./a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4164,null,4163,org.apache.commons.io.FilenameUtils.normalize("./"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4166,null,4165,org.apache.commons.io.FilenameUtils.normalize("."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4168,null,4167,org.apache.commons.io.FilenameUtils.normalize("../a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4170,null,4169,org.apache.commons.io.FilenameUtils.normalize(".."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4172,null,4171,org.apache.commons.io.FilenameUtils.normalize(""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4173,((org.apache.commons.io.FilenameUtilsTestCase.SEP) + "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4175,null,4174,org.apache.commons.io.FilenameUtils.normalize("/a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4176,(((org.apache.commons.io.FilenameUtilsTestCase.SEP) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4178,null,4177,org.apache.commons.io.FilenameUtils.normalize("/a/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4179,((((org.apache.commons.io.FilenameUtilsTestCase.SEP) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4181,null,4180,org.apache.commons.io.FilenameUtils.normalize("/a/b/../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4182,((org.apache.commons.io.FilenameUtilsTestCase.SEP) + "c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4184,null,4183,org.apache.commons.io.FilenameUtils.normalize("/a/b/../../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4186,null,4185,org.apache.commons.io.FilenameUtils.normalize("/a/b/../../../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4187,(((org.apache.commons.io.FilenameUtilsTestCase.SEP) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4189,null,4188,org.apache.commons.io.FilenameUtils.normalize("/a/b/.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4190,((org.apache.commons.io.FilenameUtilsTestCase.SEP) + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4192,null,4191,org.apache.commons.io.FilenameUtils.normalize("/a/b/../.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4194,null,4193,org.apache.commons.io.FilenameUtils.normalize("/a/b/../../.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4195,((((org.apache.commons.io.FilenameUtilsTestCase.SEP) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4197,null,4196,org.apache.commons.io.FilenameUtils.normalize("/a/b/../c/../d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4198,((((((org.apache.commons.io.FilenameUtilsTestCase.SEP) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4200,null,4199,org.apache.commons.io.FilenameUtils.normalize("/a/b//d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4201,(((((org.apache.commons.io.FilenameUtilsTestCase.SEP) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4203,null,4202,org.apache.commons.io.FilenameUtils.normalize("/a/b/././."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4204,((org.apache.commons.io.FilenameUtilsTestCase.SEP) + "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4206,null,4205,org.apache.commons.io.FilenameUtils.normalize("/./a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4207,((org.apache.commons.io.FilenameUtilsTestCase.SEP) + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4209,null,4208,org.apache.commons.io.FilenameUtils.normalize("/./"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4210,((org.apache.commons.io.FilenameUtilsTestCase.SEP) + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4212,null,4211,org.apache.commons.io.FilenameUtils.normalize("/."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4214,null,4213,org.apache.commons.io.FilenameUtils.normalize("/../a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4216,null,4215,org.apache.commons.io.FilenameUtils.normalize("/.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4217,((org.apache.commons.io.FilenameUtilsTestCase.SEP) + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4219,null,4218,org.apache.commons.io.FilenameUtils.normalize("/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4220,(("~" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4222,null,4221,org.apache.commons.io.FilenameUtils.normalize("~/a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4223,((("~" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4225,null,4224,org.apache.commons.io.FilenameUtils.normalize("~/a/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4226,(((("~" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4228,null,4227,org.apache.commons.io.FilenameUtils.normalize("~/a/b/../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4229,(("~" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4231,null,4230,org.apache.commons.io.FilenameUtils.normalize("~/a/b/../../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4233,null,4232,org.apache.commons.io.FilenameUtils.normalize("~/a/b/../../../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4234,((("~" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4236,null,4235,org.apache.commons.io.FilenameUtils.normalize("~/a/b/.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4237,(("~" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4239,null,4238,org.apache.commons.io.FilenameUtils.normalize("~/a/b/../.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4241,null,4240,org.apache.commons.io.FilenameUtils.normalize("~/a/b/../../.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4242,(((("~" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4244,null,4243,org.apache.commons.io.FilenameUtils.normalize("~/a/b/../c/../d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4245,(((((("~" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4247,null,4246,org.apache.commons.io.FilenameUtils.normalize("~/a/b//d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4248,((((("~" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4250,null,4249,org.apache.commons.io.FilenameUtils.normalize("~/a/b/././."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4251,(("~" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4253,null,4252,org.apache.commons.io.FilenameUtils.normalize("~/./a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4254,("~" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4256,null,4255,org.apache.commons.io.FilenameUtils.normalize("~/./"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4257,("~" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4259,null,4258,org.apache.commons.io.FilenameUtils.normalize("~/."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4261,null,4260,org.apache.commons.io.FilenameUtils.normalize("~/../a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4263,null,4262,org.apache.commons.io.FilenameUtils.normalize("~/.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4264,("~" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4266,null,4265,org.apache.commons.io.FilenameUtils.normalize("~/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4267,("~" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4269,null,4268,org.apache.commons.io.FilenameUtils.normalize("~"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4270,(("~user" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4272,null,4271,org.apache.commons.io.FilenameUtils.normalize("~user/a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4273,((("~user" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4275,null,4274,org.apache.commons.io.FilenameUtils.normalize("~user/a/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4276,(((("~user" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4278,null,4277,org.apache.commons.io.FilenameUtils.normalize("~user/a/b/../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4279,(("~user" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4281,null,4280,org.apache.commons.io.FilenameUtils.normalize("~user/a/b/../../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4283,null,4282,org.apache.commons.io.FilenameUtils.normalize("~user/a/b/../../../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4284,((("~user" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4286,null,4285,org.apache.commons.io.FilenameUtils.normalize("~user/a/b/.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4287,(("~user" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4289,null,4288,org.apache.commons.io.FilenameUtils.normalize("~user/a/b/../.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4291,null,4290,org.apache.commons.io.FilenameUtils.normalize("~user/a/b/../../.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4292,(((("~user" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4294,null,4293,org.apache.commons.io.FilenameUtils.normalize("~user/a/b/../c/../d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4295,(((((("~user" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4297,null,4296,org.apache.commons.io.FilenameUtils.normalize("~user/a/b//d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4298,((((("~user" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4300,null,4299,org.apache.commons.io.FilenameUtils.normalize("~user/a/b/././."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4301,(("~user" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4303,null,4302,org.apache.commons.io.FilenameUtils.normalize("~user/./a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4304,(("~user" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4306,null,4305,org.apache.commons.io.FilenameUtils.normalize("~user/./"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4307,(("~user" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4309,null,4308,org.apache.commons.io.FilenameUtils.normalize("~user/."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4311,null,4310,org.apache.commons.io.FilenameUtils.normalize("~user/../a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4313,null,4312,org.apache.commons.io.FilenameUtils.normalize("~user/.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4314,("~user" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4316,null,4315,org.apache.commons.io.FilenameUtils.normalize("~user/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4317,("~user" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4319,null,4318,org.apache.commons.io.FilenameUtils.normalize("~user"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4320,(("C:" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4322,null,4321,org.apache.commons.io.FilenameUtils.normalize("C:/a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4323,((("C:" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4325,null,4324,org.apache.commons.io.FilenameUtils.normalize("C:/a/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4326,(((("C:" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4328,null,4327,org.apache.commons.io.FilenameUtils.normalize("C:/a/b/../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4329,(("C:" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4331,null,4330,org.apache.commons.io.FilenameUtils.normalize("C:/a/b/../../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4333,null,4332,org.apache.commons.io.FilenameUtils.normalize("C:/a/b/../../../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4334,((("C:" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4336,null,4335,org.apache.commons.io.FilenameUtils.normalize("C:/a/b/.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4337,(("C:" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4339,null,4338,org.apache.commons.io.FilenameUtils.normalize("C:/a/b/../.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4341,null,4340,org.apache.commons.io.FilenameUtils.normalize("C:/a/b/../../.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4342,(((("C:" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4344,null,4343,org.apache.commons.io.FilenameUtils.normalize("C:/a/b/../c/../d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4345,(((((("C:" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4347,null,4346,org.apache.commons.io.FilenameUtils.normalize("C:/a/b//d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4348,((((("C:" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4350,null,4349,org.apache.commons.io.FilenameUtils.normalize("C:/a/b/././."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4351,(("C:" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4353,null,4352,org.apache.commons.io.FilenameUtils.normalize("C:/./a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4354,(("C:" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4356,null,4355,org.apache.commons.io.FilenameUtils.normalize("C:/./"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4357,(("C:" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4359,null,4358,org.apache.commons.io.FilenameUtils.normalize("C:/."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4361,null,4360,org.apache.commons.io.FilenameUtils.normalize("C:/../a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4363,null,4362,org.apache.commons.io.FilenameUtils.normalize("C:/.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4364,(("C:" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4366,null,4365,org.apache.commons.io.FilenameUtils.normalize("C:/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4367,("C:" + "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4369,null,4368,org.apache.commons.io.FilenameUtils.normalize("C:a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4370,(("C:" + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4372,null,4371,org.apache.commons.io.FilenameUtils.normalize("C:a/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4373,((("C:" + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4375,null,4374,org.apache.commons.io.FilenameUtils.normalize("C:a/b/../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4376,("C:" + "c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4378,null,4377,org.apache.commons.io.FilenameUtils.normalize("C:a/b/../../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4380,null,4379,org.apache.commons.io.FilenameUtils.normalize("C:a/b/../../../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4381,(("C:" + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4383,null,4382,org.apache.commons.io.FilenameUtils.normalize("C:a/b/.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4384,("C:" + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4386,null,4385,org.apache.commons.io.FilenameUtils.normalize("C:a/b/../.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4388,null,4387,org.apache.commons.io.FilenameUtils.normalize("C:a/b/../../.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4389,((("C:" + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4391,null,4390,org.apache.commons.io.FilenameUtils.normalize("C:a/b/../c/../d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4392,((((("C:" + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4394,null,4393,org.apache.commons.io.FilenameUtils.normalize("C:a/b//d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4395,(((("C:" + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4397,null,4396,org.apache.commons.io.FilenameUtils.normalize("C:a/b/././."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4398,("C:" + "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4400,null,4399,org.apache.commons.io.FilenameUtils.normalize("C:./a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4401,("C:" + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4403,null,4402,org.apache.commons.io.FilenameUtils.normalize("C:./"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4404,("C:" + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4406,null,4405,org.apache.commons.io.FilenameUtils.normalize("C:."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4408,null,4407,org.apache.commons.io.FilenameUtils.normalize("C:../a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4410,null,4409,org.apache.commons.io.FilenameUtils.normalize("C:.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4411,("C:" + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4413,null,4412,org.apache.commons.io.FilenameUtils.normalize("C:"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4414,(((((org.apache.commons.io.FilenameUtilsTestCase.SEP) + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "server") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4416,null,4415,org.apache.commons.io.FilenameUtils.normalize("//server/a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4417,((((((org.apache.commons.io.FilenameUtilsTestCase.SEP) + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "server") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4419,null,4418,org.apache.commons.io.FilenameUtils.normalize("//server/a/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4420,(((((((org.apache.commons.io.FilenameUtilsTestCase.SEP) + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "server") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4422,null,4421,org.apache.commons.io.FilenameUtils.normalize("//server/a/b/../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4423,(((((org.apache.commons.io.FilenameUtilsTestCase.SEP) + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "server") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4425,null,4424,org.apache.commons.io.FilenameUtils.normalize("//server/a/b/../../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4427,null,4426,org.apache.commons.io.FilenameUtils.normalize("//server/a/b/../../../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4428,((((((org.apache.commons.io.FilenameUtilsTestCase.SEP) + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "server") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4430,null,4429,org.apache.commons.io.FilenameUtils.normalize("//server/a/b/.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4431,(((((org.apache.commons.io.FilenameUtilsTestCase.SEP) + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "server") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4433,null,4432,org.apache.commons.io.FilenameUtils.normalize("//server/a/b/../.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4435,null,4434,org.apache.commons.io.FilenameUtils.normalize("//server/a/b/../../.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4436,(((((((org.apache.commons.io.FilenameUtilsTestCase.SEP) + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "server") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4438,null,4437,org.apache.commons.io.FilenameUtils.normalize("//server/a/b/../c/../d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4439,(((((((((org.apache.commons.io.FilenameUtilsTestCase.SEP) + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "server") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4441,null,4440,org.apache.commons.io.FilenameUtils.normalize("//server/a/b//d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4442,((((((((org.apache.commons.io.FilenameUtilsTestCase.SEP) + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "server") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4444,null,4443,org.apache.commons.io.FilenameUtils.normalize("//server/a/b/././."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4445,(((((org.apache.commons.io.FilenameUtilsTestCase.SEP) + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "server") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4447,null,4446,org.apache.commons.io.FilenameUtils.normalize("//server/./a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4448,(((((org.apache.commons.io.FilenameUtilsTestCase.SEP) + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "server") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4450,null,4449,org.apache.commons.io.FilenameUtils.normalize("//server/./"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4451,(((((org.apache.commons.io.FilenameUtilsTestCase.SEP) + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "server") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4453,null,4452,org.apache.commons.io.FilenameUtils.normalize("//server/."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4455,null,4454,org.apache.commons.io.FilenameUtils.normalize("//server/../a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4457,null,4456,org.apache.commons.io.FilenameUtils.normalize("//server/.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4458,(((((org.apache.commons.io.FilenameUtilsTestCase.SEP) + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "server") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4460,null,4459,org.apache.commons.io.FilenameUtils.normalize("//server/"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNormalizeUnixWin() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNormalizeUnixWin");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4838,null,4837,org.apache.commons.io.FilenameUtils.normalize("/a/b/../c/", true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4840,null,4839,org.apache.commons.io.FilenameUtils.normalize("\\a\\b\\..\\c\\", true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4842,null,4841,org.apache.commons.io.FilenameUtils.normalize("/a/b/../c/", false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4844,null,4843,org.apache.commons.io.FilenameUtils.normalize("\\a\\b\\..\\c\\", false));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNormalizeNoEndSeparator() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNormalizeNoEndSeparator");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4462,null,4461,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4464,null,4463,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator(":"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4466,null,4465,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("1:\\a\\b\\c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4468,null,4467,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("1:"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4470,null,4469,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("1:a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4472,null,4471,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("\\\\\\a\\b\\c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4474,null,4473,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("\\\\a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4475,(((("a" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4477,null,4476,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("a\\b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4478,(((((("" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4480,null,4479,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("\\a\\b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4481,(((((("C:" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4483,null,4482,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("C:\\a\\b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4484,(((((((((("" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "server") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4486,null,4485,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("\\\\server\\a\\b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4487,(((((("~" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4489,null,4488,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("~\\a\\b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4490,(((((("~user" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4492,null,4491,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("~user\\a\\b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4493,(("a" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4495,null,4494,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("a/b/../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4497,null,4496,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("a/b/../../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4499,null,4498,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("a/b/../../c/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4501,null,4500,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("a/b/../../../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4503,null,4502,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("a/b/.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4505,null,4504,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("a/b/../"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4507,null,4506,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("a/b/../.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4509,null,4508,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("a/b/../../"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4511,null,4510,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("a/b/../../.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4512,(("a" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4514,null,4513,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("a/b/../c/../d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4515,(("a" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4517,null,4516,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("a/b/../c/../d/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4518,(((("a" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4520,null,4519,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("a/b//d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4521,(("a" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4523,null,4522,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("a/b/././."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4524,(("a" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4526,null,4525,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("a/b/./././"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4528,null,4527,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("./a/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4530,null,4529,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("./a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4532,null,4531,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("./"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4534,null,4533,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4536,null,4535,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("../a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4538,null,4537,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator(".."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4540,null,4539,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator(""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4541,((org.apache.commons.io.FilenameUtilsTestCase.SEP) + "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4543,null,4542,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("/a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4544,((org.apache.commons.io.FilenameUtilsTestCase.SEP) + "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4546,null,4545,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("/a/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4547,((((org.apache.commons.io.FilenameUtilsTestCase.SEP) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4549,null,4548,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("/a/b/../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4550,((org.apache.commons.io.FilenameUtilsTestCase.SEP) + "c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4552,null,4551,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("/a/b/../../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4554,null,4553,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("/a/b/../../../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4555,((org.apache.commons.io.FilenameUtilsTestCase.SEP) + "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4557,null,4556,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("/a/b/.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4558,((org.apache.commons.io.FilenameUtilsTestCase.SEP) + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4560,null,4559,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("/a/b/../.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4562,null,4561,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("/a/b/../../.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4563,((((org.apache.commons.io.FilenameUtilsTestCase.SEP) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4565,null,4564,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("/a/b/../c/../d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4566,((((((org.apache.commons.io.FilenameUtilsTestCase.SEP) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4568,null,4567,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("/a/b//d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4569,((((org.apache.commons.io.FilenameUtilsTestCase.SEP) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4571,null,4570,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("/a/b/././."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4572,((org.apache.commons.io.FilenameUtilsTestCase.SEP) + "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4574,null,4573,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("/./a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4575,((org.apache.commons.io.FilenameUtilsTestCase.SEP) + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4577,null,4576,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("/./"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4578,((org.apache.commons.io.FilenameUtilsTestCase.SEP) + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4580,null,4579,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("/."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4582,null,4581,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("/../a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4584,null,4583,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("/.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4585,((org.apache.commons.io.FilenameUtilsTestCase.SEP) + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4587,null,4586,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4588,(("~" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4590,null,4589,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("~/a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4591,(("~" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4593,null,4592,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("~/a/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4594,(((("~" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4596,null,4595,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("~/a/b/../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4597,(("~" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4599,null,4598,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("~/a/b/../../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4601,null,4600,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("~/a/b/../../../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4602,(("~" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4604,null,4603,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("~/a/b/.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4605,(("~" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4607,null,4606,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("~/a/b/../.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4609,null,4608,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("~/a/b/../../.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4610,(((("~" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4612,null,4611,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("~/a/b/../c/../d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4613,(((((("~" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4615,null,4614,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("~/a/b//d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4616,(((("~" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4618,null,4617,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("~/a/b/././."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4619,(("~" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4621,null,4620,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("~/./a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,("~" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4624,null,4623,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("~/./"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,("~" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,null,4626,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("~/."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,null,4628,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("~/../a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,null,4630,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("~/.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4632,("~" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4634,null,4633,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("~/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,("~" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,null,4636,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("~"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,(("~user" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4640,null,4639,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("~user/a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,(("~user" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4643,null,4642,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("~user/a/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4644,(((("~user" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4646,null,4645,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("~user/a/b/../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4647,(("~user" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4649,null,4648,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("~user/a/b/../../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4651,null,4650,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("~user/a/b/../../../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4652,(("~user" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4654,null,4653,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("~user/a/b/.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4655,(("~user" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4657,null,4656,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("~user/a/b/../.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4659,null,4658,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("~user/a/b/../../.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4660,(((("~user" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4662,null,4661,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("~user/a/b/../c/../d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4663,(((((("~user" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4665,null,4664,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("~user/a/b//d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4666,(((("~user" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4668,null,4667,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("~user/a/b/././."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4669,(("~user" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4671,null,4670,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("~user/./a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4672,(("~user" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4674,null,4673,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("~user/./"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4675,(("~user" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4677,null,4676,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("~user/."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4679,null,4678,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("~user/../a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4681,null,4680,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("~user/.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4682,("~user" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4684,null,4683,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("~user/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4685,("~user" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4687,null,4686,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("~user"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4688,(("C:" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4690,null,4689,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("C:/a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4691,(("C:" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4693,null,4692,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("C:/a/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4694,(((("C:" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4696,null,4695,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("C:/a/b/../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4697,(("C:" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4699,null,4698,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("C:/a/b/../../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4701,null,4700,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("C:/a/b/../../../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4702,(("C:" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4704,null,4703,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("C:/a/b/.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4705,(("C:" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4707,null,4706,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("C:/a/b/../.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4709,null,4708,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("C:/a/b/../../.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4710,(((("C:" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4712,null,4711,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("C:/a/b/../c/../d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4713,(((((("C:" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4715,null,4714,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("C:/a/b//d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4716,(((("C:" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4718,null,4717,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("C:/a/b/././."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4719,(("C:" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4721,null,4720,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("C:/./a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4722,(("C:" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4724,null,4723,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("C:/./"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4725,(("C:" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4727,null,4726,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("C:/."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4729,null,4728,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("C:/../a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4731,null,4730,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("C:/.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4732,(("C:" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4734,null,4733,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("C:/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4735,("C:" + "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4737,null,4736,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("C:a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4738,("C:" + "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4740,null,4739,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("C:a/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4741,((("C:" + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4743,null,4742,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("C:a/b/../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4744,("C:" + "c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4746,null,4745,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("C:a/b/../../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4748,null,4747,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("C:a/b/../../../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4749,("C:" + "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4751,null,4750,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("C:a/b/.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4752,("C:" + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4754,null,4753,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("C:a/b/../.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4756,null,4755,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("C:a/b/../../.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4757,((("C:" + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4759,null,4758,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("C:a/b/../c/../d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4760,((((("C:" + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4762,null,4761,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("C:a/b//d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4763,((("C:" + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4765,null,4764,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("C:a/b/././."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4766,("C:" + "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4768,null,4767,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("C:./a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4769,("C:" + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4771,null,4770,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("C:./"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4772,("C:" + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4774,null,4773,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("C:."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4776,null,4775,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("C:../a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4778,null,4777,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("C:.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4779,("C:" + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4781,null,4780,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("C:"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4782,(((((org.apache.commons.io.FilenameUtilsTestCase.SEP) + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "server") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4784,null,4783,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("//server/a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4785,(((((org.apache.commons.io.FilenameUtilsTestCase.SEP) + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "server") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4787,null,4786,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("//server/a/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4788,(((((((org.apache.commons.io.FilenameUtilsTestCase.SEP) + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "server") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4790,null,4789,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("//server/a/b/../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4791,(((((org.apache.commons.io.FilenameUtilsTestCase.SEP) + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "server") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4793,null,4792,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("//server/a/b/../../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4795,null,4794,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("//server/a/b/../../../c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4796,(((((org.apache.commons.io.FilenameUtilsTestCase.SEP) + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "server") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4798,null,4797,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("//server/a/b/.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4799,(((((org.apache.commons.io.FilenameUtilsTestCase.SEP) + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "server") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4801,null,4800,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("//server/a/b/../.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4803,null,4802,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("//server/a/b/../../.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4804,(((((((org.apache.commons.io.FilenameUtilsTestCase.SEP) + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "server") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4806,null,4805,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("//server/a/b/../c/../d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4807,(((((((((org.apache.commons.io.FilenameUtilsTestCase.SEP) + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "server") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4809,null,4808,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("//server/a/b//d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4810,(((((((org.apache.commons.io.FilenameUtilsTestCase.SEP) + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "server") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4812,null,4811,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("//server/a/b/././."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4813,(((((org.apache.commons.io.FilenameUtilsTestCase.SEP) + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "server") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4815,null,4814,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("//server/./a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4816,(((((org.apache.commons.io.FilenameUtilsTestCase.SEP) + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "server") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4818,null,4817,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("//server/./"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4819,(((((org.apache.commons.io.FilenameUtilsTestCase.SEP) + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "server") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4821,null,4820,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("//server/."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4823,null,4822,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("//server/../a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4825,null,4824,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("//server/.."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4826,(((((org.apache.commons.io.FilenameUtilsTestCase.SEP) + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "server") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4828,null,4827,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("//server/"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNormalizeNoEndSeparatorUnixWin() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNormalizeNoEndSeparatorUnixWin");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4830,null,4829,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("/a/b/../c/", true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4832,null,4831,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("\\a\\b\\..\\c\\", true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4834,null,4833,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("/a/b/../c/", false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4836,null,4835,org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator("\\a\\b\\..\\c\\", false));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testConcat() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConcat");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3344,null,3343,org.apache.commons.io.FilenameUtils.concat("", null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3346,null,3345,org.apache.commons.io.FilenameUtils.concat(null, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3348,null,3347,org.apache.commons.io.FilenameUtils.concat(null, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3350,null,3349,org.apache.commons.io.FilenameUtils.concat(null, "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3351,((org.apache.commons.io.FilenameUtilsTestCase.SEP) + "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3353,null,3352,org.apache.commons.io.FilenameUtils.concat(null, "/a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3355,null,3354,org.apache.commons.io.FilenameUtils.concat("", ":"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3357,null,3356,org.apache.commons.io.FilenameUtils.concat(":", ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3358,("f" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3360,null,3359,org.apache.commons.io.FilenameUtils.concat("", "f/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3362,null,3361,org.apache.commons.io.FilenameUtils.concat("", "f"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3363,((("a" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "f") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3365,null,3364,org.apache.commons.io.FilenameUtils.concat("a/", "f/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3366,(("a" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "f"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3368,null,3367,org.apache.commons.io.FilenameUtils.concat("a", "f"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3369,((((("a" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "f") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3371,null,3370,org.apache.commons.io.FilenameUtils.concat("a/b/", "f/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3372,(((("a" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "b") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "f"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3374,null,3373,org.apache.commons.io.FilenameUtils.concat("a/b", "f"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3375,((("a" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "f") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3377,null,3376,org.apache.commons.io.FilenameUtils.concat("a/b/", "../f/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3378,(("a" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "f"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3380,null,3379,org.apache.commons.io.FilenameUtils.concat("a/b", "../f"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3381,((((("a" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "g") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3383,null,3382,org.apache.commons.io.FilenameUtils.concat("a/b/../c/", "f/../g/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3384,(((("a" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "g"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3386,null,3385,org.apache.commons.io.FilenameUtils.concat("a/b/../c", "f/../g"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3387,(((("a" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c.txt") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "f"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3389,null,3388,org.apache.commons.io.FilenameUtils.concat("a/c.txt", "f"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3390,(((org.apache.commons.io.FilenameUtilsTestCase.SEP) + "f") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3392,null,3391,org.apache.commons.io.FilenameUtils.concat("", "/f/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3393,((org.apache.commons.io.FilenameUtilsTestCase.SEP) + "f"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3395,null,3394,org.apache.commons.io.FilenameUtils.concat("", "/f"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3396,(((org.apache.commons.io.FilenameUtilsTestCase.SEP) + "f") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3398,null,3397,org.apache.commons.io.FilenameUtils.concat("a/", "/f/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3399,((org.apache.commons.io.FilenameUtilsTestCase.SEP) + "f"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3401,null,3400,org.apache.commons.io.FilenameUtils.concat("a", "/f"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3402,((((org.apache.commons.io.FilenameUtilsTestCase.SEP) + "c") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3404,null,3403,org.apache.commons.io.FilenameUtils.concat("a/b/", "/c/d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3405,(("C:c" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3407,null,3406,org.apache.commons.io.FilenameUtils.concat("a/b/", "C:c/d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3408,(((("C:" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3410,null,3409,org.apache.commons.io.FilenameUtils.concat("a/b/", "C:/c/d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3411,(((("~" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3413,null,3412,org.apache.commons.io.FilenameUtils.concat("a/b/", "~/c/d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3414,(((("~user" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "c") + (org.apache.commons.io.FilenameUtilsTestCase.SEP)) + "d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3416,null,3415,org.apache.commons.io.FilenameUtils.concat("a/b/", "~user/c/d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3417,("~" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3419,null,3418,org.apache.commons.io.FilenameUtils.concat("a/b/", "~"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3420,("~user" + (org.apache.commons.io.FilenameUtilsTestCase.SEP)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3422,null,3421,org.apache.commons.io.FilenameUtils.concat("a/b/", "~user"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSeparatorsToUnix() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSeparatorsToUnix");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4896,null,4895,org.apache.commons.io.FilenameUtils.separatorsToUnix(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4898,null,4897,org.apache.commons.io.FilenameUtils.separatorsToUnix("/a/b/c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4900,null,4899,org.apache.commons.io.FilenameUtils.separatorsToUnix("/a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4902,null,4901,org.apache.commons.io.FilenameUtils.separatorsToUnix("/a/b\\c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4904,null,4903,org.apache.commons.io.FilenameUtils.separatorsToUnix("\\a\\b\\c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4906,null,4905,org.apache.commons.io.FilenameUtils.separatorsToUnix("D:\\a\\b\\c"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSeparatorsToWindows() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSeparatorsToWindows");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4908,null,4907,org.apache.commons.io.FilenameUtils.separatorsToWindows(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4910,null,4909,org.apache.commons.io.FilenameUtils.separatorsToWindows("\\a\\b\\c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4912,null,4911,org.apache.commons.io.FilenameUtils.separatorsToWindows("\\a\\b\\c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4914,null,4913,org.apache.commons.io.FilenameUtils.separatorsToWindows("\\a\\b/c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4916,null,4915,org.apache.commons.io.FilenameUtils.separatorsToWindows("/a/b/c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4918,null,4917,org.apache.commons.io.FilenameUtils.separatorsToWindows("D:/a/b/c"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSeparatorsToSystem() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSeparatorsToSystem");
        if (WINDOWS) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4872,null,4871,org.apache.commons.io.FilenameUtils.separatorsToSystem(null));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4874,null,4873,org.apache.commons.io.FilenameUtils.separatorsToSystem("\\a\\b\\c"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4876,null,4875,org.apache.commons.io.FilenameUtils.separatorsToSystem("\\a\\b\\c.txt"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4878,null,4877,org.apache.commons.io.FilenameUtils.separatorsToSystem("\\a\\b/c"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4880,null,4879,org.apache.commons.io.FilenameUtils.separatorsToSystem("/a/b/c"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4882,null,4881,org.apache.commons.io.FilenameUtils.separatorsToSystem("D:/a/b/c"));
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4884,null,4883,org.apache.commons.io.FilenameUtils.separatorsToSystem(null));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4886,null,4885,org.apache.commons.io.FilenameUtils.separatorsToSystem("/a/b/c"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4888,null,4887,org.apache.commons.io.FilenameUtils.separatorsToSystem("/a/b/c.txt"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4890,null,4889,org.apache.commons.io.FilenameUtils.separatorsToSystem("/a/b\\c"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4892,null,4891,org.apache.commons.io.FilenameUtils.separatorsToSystem("\\a\\b\\c"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4894,null,4893,org.apache.commons.io.FilenameUtils.separatorsToSystem("D:\\a\\b\\c"));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetPrefixLength() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetPrefixLength");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3820,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3822,null,3821,org.apache.commons.io.FilenameUtils.getPrefixLength(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3823,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3825,null,3824,org.apache.commons.io.FilenameUtils.getPrefixLength(":"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3826,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3828,null,3827,org.apache.commons.io.FilenameUtils.getPrefixLength("1:\\a\\b\\c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3829,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3831,null,3830,org.apache.commons.io.FilenameUtils.getPrefixLength("1:"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3832,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3834,null,3833,org.apache.commons.io.FilenameUtils.getPrefixLength("1:a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3835,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3837,null,3836,org.apache.commons.io.FilenameUtils.getPrefixLength("\\\\\\a\\b\\c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3838,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3840,null,3839,org.apache.commons.io.FilenameUtils.getPrefixLength("\\\\a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3842,null,3841,org.apache.commons.io.FilenameUtils.getPrefixLength(""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3844,null,3843,org.apache.commons.io.FilenameUtils.getPrefixLength("\\"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3846,null,3845,org.apache.commons.io.FilenameUtils.getPrefixLength("C:"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3848,null,3847,org.apache.commons.io.FilenameUtils.getPrefixLength("C:\\"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3850,null,3849,org.apache.commons.io.FilenameUtils.getPrefixLength("//server/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3852,null,3851,org.apache.commons.io.FilenameUtils.getPrefixLength("~"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3854,null,3853,org.apache.commons.io.FilenameUtils.getPrefixLength("~/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3856,null,3855,org.apache.commons.io.FilenameUtils.getPrefixLength("~user"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3858,null,3857,org.apache.commons.io.FilenameUtils.getPrefixLength("~user/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3860,null,3859,org.apache.commons.io.FilenameUtils.getPrefixLength("a\\b\\c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3862,null,3861,org.apache.commons.io.FilenameUtils.getPrefixLength("\\a\\b\\c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3864,null,3863,org.apache.commons.io.FilenameUtils.getPrefixLength("C:a\\b\\c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3866,null,3865,org.apache.commons.io.FilenameUtils.getPrefixLength("C:\\a\\b\\c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3868,null,3867,org.apache.commons.io.FilenameUtils.getPrefixLength("\\\\server\\a\\b\\c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3870,null,3869,org.apache.commons.io.FilenameUtils.getPrefixLength("a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3872,null,3871,org.apache.commons.io.FilenameUtils.getPrefixLength("/a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3874,null,3873,org.apache.commons.io.FilenameUtils.getPrefixLength("C:/a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3876,null,3875,org.apache.commons.io.FilenameUtils.getPrefixLength("//server/a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3878,null,3877,org.apache.commons.io.FilenameUtils.getPrefixLength("~/a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3880,null,3879,org.apache.commons.io.FilenameUtils.getPrefixLength("~user/a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3882,null,3881,org.apache.commons.io.FilenameUtils.getPrefixLength("a\\b\\c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3884,null,3883,org.apache.commons.io.FilenameUtils.getPrefixLength("\\a\\b\\c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3886,null,3885,org.apache.commons.io.FilenameUtils.getPrefixLength("~\\a\\b\\c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3888,null,3887,org.apache.commons.io.FilenameUtils.getPrefixLength("~user\\a\\b\\c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIndexOfLastSeparator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIndexOfLastSeparator");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3911,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3913,null,3912,org.apache.commons.io.FilenameUtils.indexOfLastSeparator(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3914,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3916,null,3915,org.apache.commons.io.FilenameUtils.indexOfLastSeparator("noseperator.inthispath"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3918,null,3917,org.apache.commons.io.FilenameUtils.indexOfLastSeparator("a/b/c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3920,null,3919,org.apache.commons.io.FilenameUtils.indexOfLastSeparator("a\\b\\c"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIndexOfExtension() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIndexOfExtension");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3889,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3891,null,3890,org.apache.commons.io.FilenameUtils.indexOfExtension(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3892,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3894,null,3893,org.apache.commons.io.FilenameUtils.indexOfExtension("file"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3896,null,3895,org.apache.commons.io.FilenameUtils.indexOfExtension("file.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3898,null,3897,org.apache.commons.io.FilenameUtils.indexOfExtension("a.txt/b.txt/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3899,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3901,null,3900,org.apache.commons.io.FilenameUtils.indexOfExtension("a/b/c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3902,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3904,null,3903,org.apache.commons.io.FilenameUtils.indexOfExtension("a\\b\\c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3905,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3907,null,3906,org.apache.commons.io.FilenameUtils.indexOfExtension("a/b.notextension/c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3908,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3910,null,3909,org.apache.commons.io.FilenameUtils.indexOfExtension("a\\b.notextension\\c"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetPrefix() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetPrefix");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3761,null,3760,org.apache.commons.io.FilenameUtils.getPrefix(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3763,null,3762,org.apache.commons.io.FilenameUtils.getPrefix(":"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3765,null,3764,org.apache.commons.io.FilenameUtils.getPrefix("1:\\a\\b\\c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3767,null,3766,org.apache.commons.io.FilenameUtils.getPrefix("1:"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3769,null,3768,org.apache.commons.io.FilenameUtils.getPrefix("1:a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3771,null,3770,org.apache.commons.io.FilenameUtils.getPrefix("\\\\\\a\\b\\c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3773,null,3772,org.apache.commons.io.FilenameUtils.getPrefix("\\\\a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3775,null,3774,org.apache.commons.io.FilenameUtils.getPrefix(""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3777,null,3776,org.apache.commons.io.FilenameUtils.getPrefix("\\"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3779,null,3778,org.apache.commons.io.FilenameUtils.getPrefix("C:"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3781,null,3780,org.apache.commons.io.FilenameUtils.getPrefix("C:\\"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3783,null,3782,org.apache.commons.io.FilenameUtils.getPrefix("//server/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3785,null,3784,org.apache.commons.io.FilenameUtils.getPrefix("~"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3787,null,3786,org.apache.commons.io.FilenameUtils.getPrefix("~/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3789,null,3788,org.apache.commons.io.FilenameUtils.getPrefix("~user"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3791,null,3790,org.apache.commons.io.FilenameUtils.getPrefix("~user/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3793,null,3792,org.apache.commons.io.FilenameUtils.getPrefix("a\\b\\c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3795,null,3794,org.apache.commons.io.FilenameUtils.getPrefix("\\a\\b\\c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3797,null,3796,org.apache.commons.io.FilenameUtils.getPrefix("C:\\a\\b\\c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3799,null,3798,org.apache.commons.io.FilenameUtils.getPrefix("\\\\server\\a\\b\\c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3801,null,3800,org.apache.commons.io.FilenameUtils.getPrefix("a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3803,null,3802,org.apache.commons.io.FilenameUtils.getPrefix("/a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3805,null,3804,org.apache.commons.io.FilenameUtils.getPrefix("C:/a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3807,null,3806,org.apache.commons.io.FilenameUtils.getPrefix("//server/a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3809,null,3808,org.apache.commons.io.FilenameUtils.getPrefix("~/a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3811,null,3810,org.apache.commons.io.FilenameUtils.getPrefix("~user/a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3813,null,3812,org.apache.commons.io.FilenameUtils.getPrefix("a\\b\\c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3815,null,3814,org.apache.commons.io.FilenameUtils.getPrefix("\\a\\b\\c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3817,null,3816,org.apache.commons.io.FilenameUtils.getPrefix("~\\a\\b\\c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3819,null,3818,org.apache.commons.io.FilenameUtils.getPrefix("~user\\a\\b\\c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetPath() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetPath");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3641,null,3640,org.apache.commons.io.FilenameUtils.getPath(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3643,null,3642,org.apache.commons.io.FilenameUtils.getPath("noseperator.inthispath"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3645,null,3644,org.apache.commons.io.FilenameUtils.getPath("/noseperator.inthispath"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3647,null,3646,org.apache.commons.io.FilenameUtils.getPath("\\noseperator.inthispath"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3649,null,3648,org.apache.commons.io.FilenameUtils.getPath("a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3651,null,3650,org.apache.commons.io.FilenameUtils.getPath("a/b/c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3653,null,3652,org.apache.commons.io.FilenameUtils.getPath("a/b/c/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3655,null,3654,org.apache.commons.io.FilenameUtils.getPath("a\\b\\c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3657,null,3656,org.apache.commons.io.FilenameUtils.getPath(":"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3659,null,3658,org.apache.commons.io.FilenameUtils.getPath("1:/a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3661,null,3660,org.apache.commons.io.FilenameUtils.getPath("1:"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3663,null,3662,org.apache.commons.io.FilenameUtils.getPath("1:a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3665,null,3664,org.apache.commons.io.FilenameUtils.getPath("///a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3667,null,3666,org.apache.commons.io.FilenameUtils.getPath("//a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3669,null,3668,org.apache.commons.io.FilenameUtils.getPath(""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3671,null,3670,org.apache.commons.io.FilenameUtils.getPath("C:"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3673,null,3672,org.apache.commons.io.FilenameUtils.getPath("C:/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3675,null,3674,org.apache.commons.io.FilenameUtils.getPath("//server/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3677,null,3676,org.apache.commons.io.FilenameUtils.getPath("~"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3679,null,3678,org.apache.commons.io.FilenameUtils.getPath("~/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3681,null,3680,org.apache.commons.io.FilenameUtils.getPath("~user"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3683,null,3682,org.apache.commons.io.FilenameUtils.getPath("~user/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3685,null,3684,org.apache.commons.io.FilenameUtils.getPath("a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3687,null,3686,org.apache.commons.io.FilenameUtils.getPath("/a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3689,null,3688,org.apache.commons.io.FilenameUtils.getPath("C:a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3691,null,3690,org.apache.commons.io.FilenameUtils.getPath("C:a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3693,null,3692,org.apache.commons.io.FilenameUtils.getPath("C:/a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3695,null,3694,org.apache.commons.io.FilenameUtils.getPath("//server/a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3697,null,3696,org.apache.commons.io.FilenameUtils.getPath("~/a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3699,null,3698,org.apache.commons.io.FilenameUtils.getPath("~user/a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetPathNoEndSeparator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetPathNoEndSeparator");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3701,null,3700,org.apache.commons.io.FilenameUtils.getPath(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3703,null,3702,org.apache.commons.io.FilenameUtils.getPath("noseperator.inthispath"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3705,null,3704,org.apache.commons.io.FilenameUtils.getPathNoEndSeparator("/noseperator.inthispath"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3707,null,3706,org.apache.commons.io.FilenameUtils.getPathNoEndSeparator("\\noseperator.inthispath"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3709,null,3708,org.apache.commons.io.FilenameUtils.getPathNoEndSeparator("a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3711,null,3710,org.apache.commons.io.FilenameUtils.getPathNoEndSeparator("a/b/c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3713,null,3712,org.apache.commons.io.FilenameUtils.getPathNoEndSeparator("a/b/c/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3715,null,3714,org.apache.commons.io.FilenameUtils.getPathNoEndSeparator("a\\b\\c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3717,null,3716,org.apache.commons.io.FilenameUtils.getPathNoEndSeparator(":"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3719,null,3718,org.apache.commons.io.FilenameUtils.getPathNoEndSeparator("1:/a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3721,null,3720,org.apache.commons.io.FilenameUtils.getPathNoEndSeparator("1:"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3723,null,3722,org.apache.commons.io.FilenameUtils.getPathNoEndSeparator("1:a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3725,null,3724,org.apache.commons.io.FilenameUtils.getPathNoEndSeparator("///a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3727,null,3726,org.apache.commons.io.FilenameUtils.getPathNoEndSeparator("//a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3729,null,3728,org.apache.commons.io.FilenameUtils.getPathNoEndSeparator(""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3731,null,3730,org.apache.commons.io.FilenameUtils.getPathNoEndSeparator("C:"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3733,null,3732,org.apache.commons.io.FilenameUtils.getPathNoEndSeparator("C:/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3735,null,3734,org.apache.commons.io.FilenameUtils.getPathNoEndSeparator("//server/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3737,null,3736,org.apache.commons.io.FilenameUtils.getPathNoEndSeparator("~"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3739,null,3738,org.apache.commons.io.FilenameUtils.getPathNoEndSeparator("~/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3741,null,3740,org.apache.commons.io.FilenameUtils.getPathNoEndSeparator("~user"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3743,null,3742,org.apache.commons.io.FilenameUtils.getPathNoEndSeparator("~user/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3745,null,3744,org.apache.commons.io.FilenameUtils.getPathNoEndSeparator("a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3747,null,3746,org.apache.commons.io.FilenameUtils.getPathNoEndSeparator("/a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3749,null,3748,org.apache.commons.io.FilenameUtils.getPathNoEndSeparator("C:a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3751,null,3750,org.apache.commons.io.FilenameUtils.getPathNoEndSeparator("C:a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3753,null,3752,org.apache.commons.io.FilenameUtils.getPathNoEndSeparator("C:/a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3755,null,3754,org.apache.commons.io.FilenameUtils.getPathNoEndSeparator("//server/a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3757,null,3756,org.apache.commons.io.FilenameUtils.getPathNoEndSeparator("~/a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3759,null,3758,org.apache.commons.io.FilenameUtils.getPathNoEndSeparator("~user/a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFullPath() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFullPath");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3505,null,3504,org.apache.commons.io.FilenameUtils.getFullPath(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3507,null,3506,org.apache.commons.io.FilenameUtils.getFullPath("noseperator.inthispath"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3509,null,3508,org.apache.commons.io.FilenameUtils.getFullPath("a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3511,null,3510,org.apache.commons.io.FilenameUtils.getFullPath("a/b/c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3513,null,3512,org.apache.commons.io.FilenameUtils.getFullPath("a/b/c/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3515,null,3514,org.apache.commons.io.FilenameUtils.getFullPath("a\\b\\c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3517,null,3516,org.apache.commons.io.FilenameUtils.getFullPath(":"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3519,null,3518,org.apache.commons.io.FilenameUtils.getFullPath("1:/a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3521,null,3520,org.apache.commons.io.FilenameUtils.getFullPath("1:"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3523,null,3522,org.apache.commons.io.FilenameUtils.getFullPath("1:a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3525,null,3524,org.apache.commons.io.FilenameUtils.getFullPath("///a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3527,null,3526,org.apache.commons.io.FilenameUtils.getFullPath("//a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3529,null,3528,org.apache.commons.io.FilenameUtils.getFullPath(""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3531,null,3530,org.apache.commons.io.FilenameUtils.getFullPath("C:"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3533,null,3532,org.apache.commons.io.FilenameUtils.getFullPath("C:/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3535,null,3534,org.apache.commons.io.FilenameUtils.getFullPath("//server/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3537,null,3536,org.apache.commons.io.FilenameUtils.getFullPath("~"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3539,null,3538,org.apache.commons.io.FilenameUtils.getFullPath("~/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3541,null,3540,org.apache.commons.io.FilenameUtils.getFullPath("~user"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3543,null,3542,org.apache.commons.io.FilenameUtils.getFullPath("~user/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3545,null,3544,org.apache.commons.io.FilenameUtils.getFullPath("a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3547,null,3546,org.apache.commons.io.FilenameUtils.getFullPath("/a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3549,null,3548,org.apache.commons.io.FilenameUtils.getFullPath("C:a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3551,null,3550,org.apache.commons.io.FilenameUtils.getFullPath("C:a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3553,null,3552,org.apache.commons.io.FilenameUtils.getFullPath("C:/a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3555,null,3554,org.apache.commons.io.FilenameUtils.getFullPath("//server/a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3557,null,3556,org.apache.commons.io.FilenameUtils.getFullPath("~/a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3559,null,3558,org.apache.commons.io.FilenameUtils.getFullPath("~user/a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFullPathNoEndSeparator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFullPathNoEndSeparator");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3561,null,3560,org.apache.commons.io.FilenameUtils.getFullPathNoEndSeparator(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3563,null,3562,org.apache.commons.io.FilenameUtils.getFullPathNoEndSeparator("noseperator.inthispath"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3565,null,3564,org.apache.commons.io.FilenameUtils.getFullPathNoEndSeparator("a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3567,null,3566,org.apache.commons.io.FilenameUtils.getFullPathNoEndSeparator("a/b/c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3569,null,3568,org.apache.commons.io.FilenameUtils.getFullPathNoEndSeparator("a/b/c/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3571,null,3570,org.apache.commons.io.FilenameUtils.getFullPathNoEndSeparator("a\\b\\c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3573,null,3572,org.apache.commons.io.FilenameUtils.getFullPathNoEndSeparator(":"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3575,null,3574,org.apache.commons.io.FilenameUtils.getFullPathNoEndSeparator("1:/a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3577,null,3576,org.apache.commons.io.FilenameUtils.getFullPathNoEndSeparator("1:"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3579,null,3578,org.apache.commons.io.FilenameUtils.getFullPathNoEndSeparator("1:a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3581,null,3580,org.apache.commons.io.FilenameUtils.getFullPathNoEndSeparator("///a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3583,null,3582,org.apache.commons.io.FilenameUtils.getFullPathNoEndSeparator("//a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3585,null,3584,org.apache.commons.io.FilenameUtils.getFullPathNoEndSeparator(""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3587,null,3586,org.apache.commons.io.FilenameUtils.getFullPathNoEndSeparator("C:"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3589,null,3588,org.apache.commons.io.FilenameUtils.getFullPathNoEndSeparator("C:/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3591,null,3590,org.apache.commons.io.FilenameUtils.getFullPathNoEndSeparator("//server/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3593,null,3592,org.apache.commons.io.FilenameUtils.getFullPathNoEndSeparator("~"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3595,null,3594,org.apache.commons.io.FilenameUtils.getFullPathNoEndSeparator("~/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3597,null,3596,org.apache.commons.io.FilenameUtils.getFullPathNoEndSeparator("~user"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3599,null,3598,org.apache.commons.io.FilenameUtils.getFullPathNoEndSeparator("~user/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3601,null,3600,org.apache.commons.io.FilenameUtils.getFullPathNoEndSeparator("a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3603,null,3602,org.apache.commons.io.FilenameUtils.getFullPathNoEndSeparator("/a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3605,null,3604,org.apache.commons.io.FilenameUtils.getFullPathNoEndSeparator("C:a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3607,null,3606,org.apache.commons.io.FilenameUtils.getFullPathNoEndSeparator("C:a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3609,null,3608,org.apache.commons.io.FilenameUtils.getFullPathNoEndSeparator("C:/a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3611,null,3610,org.apache.commons.io.FilenameUtils.getFullPathNoEndSeparator("//server/a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3613,null,3612,org.apache.commons.io.FilenameUtils.getFullPathNoEndSeparator("~/a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3615,null,3614,org.apache.commons.io.FilenameUtils.getFullPathNoEndSeparator("~user/a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for https://issues.apache.org/jira/browse/IO-248
     */
public void testGetFullPathNoEndSeparator_IO_248() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFullPathNoEndSeparator_IO_248");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3617,null,3616,org.apache.commons.io.FilenameUtils.getFullPathNoEndSeparator("/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3619,null,3618,org.apache.commons.io.FilenameUtils.getFullPathNoEndSeparator("\\"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3621,null,3620,org.apache.commons.io.FilenameUtils.getFullPathNoEndSeparator("/abc"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3623,null,3622,org.apache.commons.io.FilenameUtils.getFullPathNoEndSeparator("\\abc"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3625,null,3624,org.apache.commons.io.FilenameUtils.getFullPathNoEndSeparator("/abc/xyz"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3627,null,3626,org.apache.commons.io.FilenameUtils.getFullPathNoEndSeparator("\\abc\\xyz"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetName() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetName");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3629,null,3628,org.apache.commons.io.FilenameUtils.getName(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3631,null,3630,org.apache.commons.io.FilenameUtils.getName("noseperator.inthispath"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3633,null,3632,org.apache.commons.io.FilenameUtils.getName("a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3635,null,3634,org.apache.commons.io.FilenameUtils.getName("a/b/c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3637,null,3636,org.apache.commons.io.FilenameUtils.getName("a/b/c/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3639,null,3638,org.apache.commons.io.FilenameUtils.getName("a\\b\\c"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetBaseName() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetBaseName");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3465,null,3464,org.apache.commons.io.FilenameUtils.getBaseName(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3467,null,3466,org.apache.commons.io.FilenameUtils.getBaseName("noseperator.inthispath"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3469,null,3468,org.apache.commons.io.FilenameUtils.getBaseName("a/b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3471,null,3470,org.apache.commons.io.FilenameUtils.getBaseName("a/b/c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3473,null,3472,org.apache.commons.io.FilenameUtils.getBaseName("a/b/c/"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3475,null,3474,org.apache.commons.io.FilenameUtils.getBaseName("a\\b\\c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3477,null,3476,org.apache.commons.io.FilenameUtils.getBaseName("file.txt.bak"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetExtension() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetExtension");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3479,null,3478,org.apache.commons.io.FilenameUtils.getExtension(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3481,null,3480,org.apache.commons.io.FilenameUtils.getExtension("file.ext"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3483,null,3482,org.apache.commons.io.FilenameUtils.getExtension("README"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3485,null,3484,org.apache.commons.io.FilenameUtils.getExtension("domain.dot.com"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3487,null,3486,org.apache.commons.io.FilenameUtils.getExtension("image.jpeg"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3489,null,3488,org.apache.commons.io.FilenameUtils.getExtension("a.b/c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3491,null,3490,org.apache.commons.io.FilenameUtils.getExtension("a.b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3493,null,3492,org.apache.commons.io.FilenameUtils.getExtension("a/b/c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3495,null,3494,org.apache.commons.io.FilenameUtils.getExtension("a.b\\c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3497,null,3496,org.apache.commons.io.FilenameUtils.getExtension("a.b\\c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3499,null,3498,org.apache.commons.io.FilenameUtils.getExtension("a\\b\\c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3501,null,3500,org.apache.commons.io.FilenameUtils.getExtension("C:\\temp\\foo.bar\\README"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3503,null,3502,org.apache.commons.io.FilenameUtils.getExtension("../filename.ext"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveExtension() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveExtension");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4846,null,4845,org.apache.commons.io.FilenameUtils.removeExtension(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4848,null,4847,org.apache.commons.io.FilenameUtils.removeExtension("file.ext"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4850,null,4849,org.apache.commons.io.FilenameUtils.removeExtension("README"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4852,null,4851,org.apache.commons.io.FilenameUtils.removeExtension("domain.dot.com"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4854,null,4853,org.apache.commons.io.FilenameUtils.removeExtension("image.jpeg"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4856,null,4855,org.apache.commons.io.FilenameUtils.removeExtension("a.b/c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4858,null,4857,org.apache.commons.io.FilenameUtils.removeExtension("a.b/c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4860,null,4859,org.apache.commons.io.FilenameUtils.removeExtension("a/b/c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4862,null,4861,org.apache.commons.io.FilenameUtils.removeExtension("a.b\\c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4864,null,4863,org.apache.commons.io.FilenameUtils.removeExtension("a.b\\c.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4866,null,4865,org.apache.commons.io.FilenameUtils.removeExtension("a\\b\\c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4868,null,4867,org.apache.commons.io.FilenameUtils.removeExtension("C:\\temp\\foo.bar\\README"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4870,null,4869,org.apache.commons.io.FilenameUtils.removeExtension("../filename.ext"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsOnSystem() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsOnSystem");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3441,null,3440,org.apache.commons.io.FilenameUtils.equalsOnSystem(null, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3443,null,3442,org.apache.commons.io.FilenameUtils.equalsOnSystem(null, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3445,null,3444,org.apache.commons.io.FilenameUtils.equalsOnSystem("", null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3447,null,3446,org.apache.commons.io.FilenameUtils.equalsOnSystem("", ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3449,null,3448,org.apache.commons.io.FilenameUtils.equalsOnSystem("file.txt", "file.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3450,org.apache.commons.io.FilenameUtilsTestCase.WINDOWS);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3452,null,3451,org.apache.commons.io.FilenameUtils.equalsOnSystem("file.txt", "FILE.TXT"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3454,null,3453,org.apache.commons.io.FilenameUtils.equalsOnSystem("a\\b\\file.txt", "a/b/file.txt"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsNormalizedOnSystem() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsNormalizedOnSystem");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3424,null,3423,org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem(null, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3426,null,3425,org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem(null, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3428,null,3427,org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("", null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3430,null,3429,org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("", ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3432,null,3431,org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("file.txt", "file.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3433,org.apache.commons.io.FilenameUtilsTestCase.WINDOWS);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3435,null,3434,org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("file.txt", "FILE.TXT"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3437,null,3436,org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("a\\b\\file.txt", "a/b/file.txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3439,null,3438,org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("a/b/", "a/b"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for https://issues.apache.org/jira/browse/IO-128
     */
public void testEqualsNormalizedError_IO_128() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsNormalizedError_IO_128");
        try {
            org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("//file.txt", "file.txt");
        } catch (NullPointerException e) {
        }
        try {
            org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("file.txt", "//file.txt");
        } catch (NullPointerException e) {
        }
        try {
            org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("//file.txt", "//file.txt");
        } catch (NullPointerException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for https://issues.apache.org/jira/browse/IO-128
     */
@Test(timeout = 1000)
    public void testEqualsNormalizedError_IO_128_add1681() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsNormalizedError_IO_128_add1681");
        try {
            org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("//file.txt", "file.txt");
            org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("//file.txt", "file.txt");
        } catch (NullPointerException e) {
        }
        try {
            org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("file.txt", "//file.txt");
        } catch (NullPointerException e) {
        }
        try {
            org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("//file.txt", "//file.txt");
        } catch (NullPointerException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for https://issues.apache.org/jira/browse/IO-128
     */
@Test(timeout = 1000)
    public void testEqualsNormalizedError_IO_128_add1682() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsNormalizedError_IO_128_add1682");
        try {
            org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("//file.txt", "file.txt");
        } catch (NullPointerException e) {
        }
        try {
            org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("file.txt", "//file.txt");
            org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("file.txt", "//file.txt");
        } catch (NullPointerException e) {
        }
        try {
            org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("//file.txt", "//file.txt");
        } catch (NullPointerException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for https://issues.apache.org/jira/browse/IO-128
     */
@Test(timeout = 1000)
    public void testEqualsNormalizedError_IO_128_add1683() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsNormalizedError_IO_128_add1683");
        try {
            org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("//file.txt", "file.txt");
        } catch (NullPointerException e) {
        }
        try {
            org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("file.txt", "//file.txt");
        } catch (NullPointerException e) {
        }
        try {
            org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("//file.txt", "//file.txt");
            org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("//file.txt", "//file.txt");
        } catch (NullPointerException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for https://issues.apache.org/jira/browse/IO-128
     */
public void testEquals() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals");
        try {
            org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("foo", "file.txt");
        } catch (NullPointerException e) {
        }
        try {
            org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("file.txt", "//file.txt");
        } catch (NullPointerException e) {
        }
        try {
            org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("//file.txt", "//file.txt");
        } catch (NullPointerException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for https://issues.apache.org/jira/browse/IO-128
     */
public void testEqualsNormalized() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsNormalized");
        try {
            org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("//file.txt", "foo");
        } catch (NullPointerException e) {
        }
        try {
            org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("file.txt", "//file.txt");
        } catch (NullPointerException e) {
        }
        try {
            org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("//file.txt", "//file.txt");
        } catch (NullPointerException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for https://issues.apache.org/jira/browse/IO-128
     */
public void testEqualsNormalizedError_IO_128_literalMutation5676() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsNormalizedError_IO_128_literalMutation5676");
        try {
            org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("//file.txt", "file.txt");
        } catch (NullPointerException e) {
        }
        try {
            org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("foo", "//file.txt");
        } catch (NullPointerException e) {
        }
        try {
            org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("//file.txt", "//file.txt");
        } catch (NullPointerException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for https://issues.apache.org/jira/browse/IO-128
     */
public void testEqualsNormalizedError_IO_128_literalMutation5677() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsNormalizedError_IO_128_literalMutation5677");
        try {
            org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("//file.txt", "file.txt");
        } catch (NullPointerException e) {
        }
        try {
            org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("file.txt", "bar");
        } catch (NullPointerException e) {
        }
        try {
            org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("//file.txt", "//file.txt");
        } catch (NullPointerException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for https://issues.apache.org/jira/browse/IO-128
     */
public void testEqualsNormalizedError_IO_128_literalMutation5678() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsNormalizedError_IO_128_literalMutation5678");
        try {
            org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("//file.txt", "file.txt");
        } catch (NullPointerException e) {
        }
        try {
            org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("file.txt", "//file.txt");
        } catch (NullPointerException e) {
        }
        try {
            org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("foo", "//file.txt");
        } catch (NullPointerException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for https://issues.apache.org/jira/browse/IO-128
     */
public void testEqualsNormalizedError_IO_128_literalMutation5679() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsNormalizedError_IO_128_literalMutation5679");
        try {
            org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("//file.txt", "file.txt");
        } catch (NullPointerException e) {
        }
        try {
            org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("file.txt", "//file.txt");
        } catch (NullPointerException e) {
        }
        try {
            org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem("//file.txt", "foo");
        } catch (NullPointerException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEquals_fullControl() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_fullControl");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3456,null,3455,org.apache.commons.io.FilenameUtils.equals("file.txt", "FILE.TXT", true, org.apache.commons.io.IOCase.SENSITIVE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3458,null,3457,org.apache.commons.io.FilenameUtils.equals("file.txt", "FILE.TXT", true, org.apache.commons.io.IOCase.INSENSITIVE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3459,org.apache.commons.io.FilenameUtilsTestCase.WINDOWS);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3461,null,3460,org.apache.commons.io.FilenameUtils.equals("file.txt", "FILE.TXT", true, org.apache.commons.io.IOCase.SYSTEM));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3463,null,3462,org.apache.commons.io.FilenameUtils.equals("file.txt", "FILE.TXT", true, null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIsExtension() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsExtension");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3922,null,3921,org.apache.commons.io.FilenameUtils.isExtension(null, ((java.lang.String)(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3924,null,3923,org.apache.commons.io.FilenameUtils.isExtension("file.txt", ((java.lang.String)(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3926,null,3925,org.apache.commons.io.FilenameUtils.isExtension("file", ((java.lang.String)(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3928,null,3927,org.apache.commons.io.FilenameUtils.isExtension("file.txt", ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3930,null,3929,org.apache.commons.io.FilenameUtils.isExtension("file", ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3932,null,3931,org.apache.commons.io.FilenameUtils.isExtension("file.txt", "txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3934,null,3933,org.apache.commons.io.FilenameUtils.isExtension("file.txt", "rtf"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3936,null,3935,org.apache.commons.io.FilenameUtils.isExtension("a/b/file.txt", ((java.lang.String)(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3938,null,3937,org.apache.commons.io.FilenameUtils.isExtension("a/b/file.txt", ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3940,null,3939,org.apache.commons.io.FilenameUtils.isExtension("a/b/file.txt", "txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3942,null,3941,org.apache.commons.io.FilenameUtils.isExtension("a/b/file.txt", "rtf"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3944,null,3943,org.apache.commons.io.FilenameUtils.isExtension("a.b/file.txt", ((java.lang.String)(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3946,null,3945,org.apache.commons.io.FilenameUtils.isExtension("a.b/file.txt", ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3948,null,3947,org.apache.commons.io.FilenameUtils.isExtension("a.b/file.txt", "txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3950,null,3949,org.apache.commons.io.FilenameUtils.isExtension("a.b/file.txt", "rtf"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3952,null,3951,org.apache.commons.io.FilenameUtils.isExtension("a\\b\\file.txt", ((java.lang.String)(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3954,null,3953,org.apache.commons.io.FilenameUtils.isExtension("a\\b\\file.txt", ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3956,null,3955,org.apache.commons.io.FilenameUtils.isExtension("a\\b\\file.txt", "txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3958,null,3957,org.apache.commons.io.FilenameUtils.isExtension("a\\b\\file.txt", "rtf"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3960,null,3959,org.apache.commons.io.FilenameUtils.isExtension("a.b\\file.txt", ((java.lang.String)(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3962,null,3961,org.apache.commons.io.FilenameUtils.isExtension("a.b\\file.txt", ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3964,null,3963,org.apache.commons.io.FilenameUtils.isExtension("a.b\\file.txt", "txt"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3966,null,3965,org.apache.commons.io.FilenameUtils.isExtension("a.b\\file.txt", "rtf"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3968,null,3967,org.apache.commons.io.FilenameUtils.isExtension("a.b\\file.txt", "TXT"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIsExtensionArray() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsExtensionArray");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3970,null,3969,org.apache.commons.io.FilenameUtils.isExtension(null, ((java.lang.String[])(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3972,null,3971,org.apache.commons.io.FilenameUtils.isExtension("file.txt", ((java.lang.String[])(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3974,null,3973,org.apache.commons.io.FilenameUtils.isExtension("file", ((java.lang.String[])(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3976,null,3975,org.apache.commons.io.FilenameUtils.isExtension("file.txt", new java.lang.String[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3978,null,3977,org.apache.commons.io.FilenameUtils.isExtension("file.txt", new java.lang.String[]{ "txt" }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3980,null,3979,org.apache.commons.io.FilenameUtils.isExtension("file.txt", new java.lang.String[]{ "rtf" }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3982,null,3981,org.apache.commons.io.FilenameUtils.isExtension("file", new java.lang.String[]{ "rtf" , "" }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3984,null,3983,org.apache.commons.io.FilenameUtils.isExtension("file.txt", new java.lang.String[]{ "rtf" , "txt" }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3986,null,3985,org.apache.commons.io.FilenameUtils.isExtension("a/b/file.txt", ((java.lang.String[])(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3988,null,3987,org.apache.commons.io.FilenameUtils.isExtension("a/b/file.txt", new java.lang.String[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3990,null,3989,org.apache.commons.io.FilenameUtils.isExtension("a/b/file.txt", new java.lang.String[]{ "txt" }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3992,null,3991,org.apache.commons.io.FilenameUtils.isExtension("a/b/file.txt", new java.lang.String[]{ "rtf" }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3994,null,3993,org.apache.commons.io.FilenameUtils.isExtension("a/b/file.txt", new java.lang.String[]{ "rtf" , "txt" }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3996,null,3995,org.apache.commons.io.FilenameUtils.isExtension("a.b/file.txt", ((java.lang.String[])(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3998,null,3997,org.apache.commons.io.FilenameUtils.isExtension("a.b/file.txt", new java.lang.String[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4000,null,3999,org.apache.commons.io.FilenameUtils.isExtension("a.b/file.txt", new java.lang.String[]{ "txt" }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4002,null,4001,org.apache.commons.io.FilenameUtils.isExtension("a.b/file.txt", new java.lang.String[]{ "rtf" }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4004,null,4003,org.apache.commons.io.FilenameUtils.isExtension("a.b/file.txt", new java.lang.String[]{ "rtf" , "txt" }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4006,null,4005,org.apache.commons.io.FilenameUtils.isExtension("a\\b\\file.txt", ((java.lang.String[])(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4008,null,4007,org.apache.commons.io.FilenameUtils.isExtension("a\\b\\file.txt", new java.lang.String[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4010,null,4009,org.apache.commons.io.FilenameUtils.isExtension("a\\b\\file.txt", new java.lang.String[]{ "txt" }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4012,null,4011,org.apache.commons.io.FilenameUtils.isExtension("a\\b\\file.txt", new java.lang.String[]{ "rtf" }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4014,null,4013,org.apache.commons.io.FilenameUtils.isExtension("a\\b\\file.txt", new java.lang.String[]{ "rtf" , "txt" }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4016,null,4015,org.apache.commons.io.FilenameUtils.isExtension("a.b\\file.txt", ((java.lang.String[])(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4018,null,4017,org.apache.commons.io.FilenameUtils.isExtension("a.b\\file.txt", new java.lang.String[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4020,null,4019,org.apache.commons.io.FilenameUtils.isExtension("a.b\\file.txt", new java.lang.String[]{ "txt" }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4022,null,4021,org.apache.commons.io.FilenameUtils.isExtension("a.b\\file.txt", new java.lang.String[]{ "rtf" }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4024,null,4023,org.apache.commons.io.FilenameUtils.isExtension("a.b\\file.txt", new java.lang.String[]{ "rtf" , "txt" }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4026,null,4025,org.apache.commons.io.FilenameUtils.isExtension("a.b\\file.txt", new java.lang.String[]{ "TXT" }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4028,null,4027,org.apache.commons.io.FilenameUtils.isExtension("a.b\\file.txt", new java.lang.String[]{ "TXT" , "RTF" }));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIsExtensionCollection() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsExtensionCollection");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4030,null,4029,org.apache.commons.io.FilenameUtils.isExtension(null, ((java.util.Collection<java.lang.String>)(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4032,null,4031,org.apache.commons.io.FilenameUtils.isExtension("file.txt", ((java.util.Collection<java.lang.String>)(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4034,null,4033,org.apache.commons.io.FilenameUtils.isExtension("file", ((java.util.Collection<java.lang.String>)(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4036,null,4035,org.apache.commons.io.FilenameUtils.isExtension("file.txt", new java.util.ArrayList<java.lang.String>()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4038,null,4037,org.apache.commons.io.FilenameUtils.isExtension("file.txt", new java.util.ArrayList<java.lang.String>(java.util.Arrays.asList(new java.lang.String[]{ "txt" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4040,null,4039,org.apache.commons.io.FilenameUtils.isExtension("file.txt", new java.util.ArrayList<java.lang.String>(java.util.Arrays.asList(new java.lang.String[]{ "rtf" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4042,null,4041,org.apache.commons.io.FilenameUtils.isExtension("file", new java.util.ArrayList<java.lang.String>(java.util.Arrays.asList(new java.lang.String[]{ "rtf" , "" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4044,null,4043,org.apache.commons.io.FilenameUtils.isExtension("file.txt", new java.util.ArrayList<java.lang.String>(java.util.Arrays.asList(new java.lang.String[]{ "rtf" , "txt" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4046,null,4045,org.apache.commons.io.FilenameUtils.isExtension("a/b/file.txt", ((java.util.Collection<java.lang.String>)(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4048,null,4047,org.apache.commons.io.FilenameUtils.isExtension("a/b/file.txt", new java.util.ArrayList<java.lang.String>()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4050,null,4049,org.apache.commons.io.FilenameUtils.isExtension("a/b/file.txt", new java.util.ArrayList<java.lang.String>(java.util.Arrays.asList(new java.lang.String[]{ "txt" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4052,null,4051,org.apache.commons.io.FilenameUtils.isExtension("a/b/file.txt", new java.util.ArrayList<java.lang.String>(java.util.Arrays.asList(new java.lang.String[]{ "rtf" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4054,null,4053,org.apache.commons.io.FilenameUtils.isExtension("a/b/file.txt", new java.util.ArrayList<java.lang.String>(java.util.Arrays.asList(new java.lang.String[]{ "rtf" , "txt" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4056,null,4055,org.apache.commons.io.FilenameUtils.isExtension("a.b/file.txt", ((java.util.Collection<java.lang.String>)(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4058,null,4057,org.apache.commons.io.FilenameUtils.isExtension("a.b/file.txt", new java.util.ArrayList<java.lang.String>()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4060,null,4059,org.apache.commons.io.FilenameUtils.isExtension("a.b/file.txt", new java.util.ArrayList<java.lang.String>(java.util.Arrays.asList(new java.lang.String[]{ "txt" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4062,null,4061,org.apache.commons.io.FilenameUtils.isExtension("a.b/file.txt", new java.util.ArrayList<java.lang.String>(java.util.Arrays.asList(new java.lang.String[]{ "rtf" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4064,null,4063,org.apache.commons.io.FilenameUtils.isExtension("a.b/file.txt", new java.util.ArrayList<java.lang.String>(java.util.Arrays.asList(new java.lang.String[]{ "rtf" , "txt" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4066,null,4065,org.apache.commons.io.FilenameUtils.isExtension("a\\b\\file.txt", ((java.util.Collection<java.lang.String>)(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4068,null,4067,org.apache.commons.io.FilenameUtils.isExtension("a\\b\\file.txt", new java.util.ArrayList<java.lang.String>()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4070,null,4069,org.apache.commons.io.FilenameUtils.isExtension("a\\b\\file.txt", new java.util.ArrayList<java.lang.String>(java.util.Arrays.asList(new java.lang.String[]{ "txt" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4072,null,4071,org.apache.commons.io.FilenameUtils.isExtension("a\\b\\file.txt", new java.util.ArrayList<java.lang.String>(java.util.Arrays.asList(new java.lang.String[]{ "rtf" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4074,null,4073,org.apache.commons.io.FilenameUtils.isExtension("a\\b\\file.txt", new java.util.ArrayList<java.lang.String>(java.util.Arrays.asList(new java.lang.String[]{ "rtf" , "txt" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4076,null,4075,org.apache.commons.io.FilenameUtils.isExtension("a.b\\file.txt", ((java.util.Collection<java.lang.String>)(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4078,null,4077,org.apache.commons.io.FilenameUtils.isExtension("a.b\\file.txt", new java.util.ArrayList<java.lang.String>()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4080,null,4079,org.apache.commons.io.FilenameUtils.isExtension("a.b\\file.txt", new java.util.ArrayList<java.lang.String>(java.util.Arrays.asList(new java.lang.String[]{ "txt" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4082,null,4081,org.apache.commons.io.FilenameUtils.isExtension("a.b\\file.txt", new java.util.ArrayList<java.lang.String>(java.util.Arrays.asList(new java.lang.String[]{ "rtf" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4084,null,4083,org.apache.commons.io.FilenameUtils.isExtension("a.b\\file.txt", new java.util.ArrayList<java.lang.String>(java.util.Arrays.asList(new java.lang.String[]{ "rtf" , "txt" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4086,null,4085,org.apache.commons.io.FilenameUtils.isExtension("a.b\\file.txt", new java.util.ArrayList<java.lang.String>(java.util.Arrays.asList(new java.lang.String[]{ "TXT" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4088,null,4087,org.apache.commons.io.FilenameUtils.isExtension("a.b\\file.txt", new java.util.ArrayList<java.lang.String>(java.util.Arrays.asList(new java.lang.String[]{ "TXT" , "RTF" }))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


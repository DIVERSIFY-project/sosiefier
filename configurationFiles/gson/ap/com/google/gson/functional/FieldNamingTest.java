package com.google.gson.functional;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import junit.framework.TestCase;

public final class FieldNamingTest extends TestCase {
    public void testIdentity() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIdentity");
        Gson gson = new GsonBuilder().setFieldNamingPolicy(com.google.gson.FieldNamingPolicy.IDENTITY).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1571,("{\'lowerCamel\':1,\'UpperCamel\':2,\'_lowerCamelLeadingUnderscore\':3," + ("\'_UpperCamelLeadingUnderscore\':4,\'lower_words\':5,\'UPPER_WORDS\':6," + "\'annotatedName\':7}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1573,gson.toJson(new com.google.gson.functional.FieldNamingTest.TestNames()),1572,gson.toJson(new com.google.gson.functional.FieldNamingTest.TestNames()).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUpperCamelCase() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUpperCamelCase");
        Gson gson = new GsonBuilder().setFieldNamingPolicy(com.google.gson.FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1580,("{\'LowerCamel\':1,\'UpperCamel\':2,\'_LowerCamelLeadingUnderscore\':3," + ("\'_UpperCamelLeadingUnderscore\':4,\'Lower_words\':5,\'UPPER_WORDS\':6," + "\'annotatedName\':7}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1582,gson.toJson(new com.google.gson.functional.FieldNamingTest.TestNames()),1581,gson.toJson(new com.google.gson.functional.FieldNamingTest.TestNames()).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUpperCamelCaseWithSpaces() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUpperCamelCaseWithSpaces");
        Gson gson = new GsonBuilder().setFieldNamingPolicy(com.google.gson.FieldNamingPolicy.UPPER_CAMEL_CASE_WITH_SPACES).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1583,("{\'Lower Camel\':1,\'Upper Camel\':2,\'_Lower Camel Leading Underscore\':3," + ("\'_ Upper Camel Leading Underscore\':4,\'Lower_words\':5,\'U P P E R_ W O R D S\':6," + "\'annotatedName\':7}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1585,gson.toJson(new com.google.gson.functional.FieldNamingTest.TestNames()),1584,gson.toJson(new com.google.gson.functional.FieldNamingTest.TestNames()).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLowerCaseWithUnderscores() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLowerCaseWithUnderscores");
        Gson gson = new GsonBuilder().setFieldNamingPolicy(com.google.gson.FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1577,("{\'lower_camel\':1,\'upper_camel\':2,\'_lower_camel_leading_underscore\':3," + ("\'__upper_camel_leading_underscore\':4,\'lower_words\':5,\'u_p_p_e_r__w_o_r_d_s\':6," + "\'annotatedName\':7}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1579,gson.toJson(new com.google.gson.functional.FieldNamingTest.TestNames()),1578,gson.toJson(new com.google.gson.functional.FieldNamingTest.TestNames()).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLowerCaseWithDashes() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLowerCaseWithDashes");
        Gson gson = new GsonBuilder().setFieldNamingPolicy(com.google.gson.FieldNamingPolicy.LOWER_CASE_WITH_DASHES).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1574,("{\'lower-camel\':1,\'upper-camel\':2,\'_lower-camel-leading-underscore\':3," + ("\'_-upper-camel-leading-underscore\':4,\'lower_words\':5,\'u-p-p-e-r_-w-o-r-d-s\':6," + "\'annotatedName\':7}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1576,gson.toJson(new com.google.gson.functional.FieldNamingTest.TestNames()),1575,gson.toJson(new com.google.gson.functional.FieldNamingTest.TestNames()).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unused")
    private static class TestNames {
        int lowerCamel = 1;

        int UpperCamel = 2;

        int _lowerCamelLeadingUnderscore = 3;

        int _UpperCamelLeadingUnderscore = 4;

        int lower_words = 5;

        int UPPER_WORDS = 6;

        @SerializedName(value = "annotatedName")
        int annotated = 7;
    }
}


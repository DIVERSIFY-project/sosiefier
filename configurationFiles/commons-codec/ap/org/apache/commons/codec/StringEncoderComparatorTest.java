package org.apache.commons.codec;

import org.apache.commons.codec.language.DoubleMetaphone;
import java.util.List;
import org.apache.commons.codec.language.Soundex;
import org.junit.Test;

/** 
 * Test cases for the StingEncoderComparator.
 * 
 * @version $Id$
 */
public class StringEncoderComparatorTest {
    @Test
    public void testComparatorWithSoundex() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorWithSoundex");
        final StringEncoderComparator sCompare = new StringEncoderComparator(new Soundex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2745,("O\'Brien and O\'Brian didn\'t come out with " + "the same Soundex, something must be wrong here"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2746,(0 == (sCompare.compare("O\'Brien", "O\'Brian"))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testComparatorWithDoubleMetaphone_add545() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorWithDoubleMetaphone_add545");
        final StringEncoderComparator sCompare = new StringEncoderComparator(new DoubleMetaphone());
        final String[] testArray = new String[]{ "Jordan" , "Sosa" , "Prior" , "Pryor" };
        final List<java.lang.String> testList = java.util.Arrays.asList(testArray);
        final String[] controlArray = new String[]{ "Jordan" , "Prior" , "Pryor" , "Sosa" };
        java.util.Collections.sort(testList, sCompare);
        java.util.Collections.sort(testList, sCompare);
        final String[] resultArray = testList.toArray(new String[0]);
        for (int i = 0 ; i < (resultArray.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2742,("Result Array not Equal to Control Array at index: " + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2743,controlArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2744,resultArray[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testComparatorWithDoubleMetaphone() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorWithDoubleMetaphone");
        final StringEncoderComparator sCompare = new StringEncoderComparator(new DoubleMetaphone());
        final String[] testArray = new String[]{ "foo" , "Sosa" , "Prior" , "Pryor" };
        final List<java.lang.String> testList = java.util.Arrays.asList(testArray);
        final String[] controlArray = new String[]{ "Jordan" , "Prior" , "Pryor" , "Sosa" };
        java.util.Collections.sort(testList, sCompare);
        final String[] resultArray = testList.toArray(new String[0]);
        for (int i = 0 ; i < (resultArray.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2742,("Result Array not Equal to Control Array at index: " + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2743,controlArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2744,resultArray[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testComparatorWithDoubleMetaphone_literalMutation4494() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorWithDoubleMetaphone_literalMutation4494");
        final StringEncoderComparator sCompare = new StringEncoderComparator(new DoubleMetaphone());
        final String[] testArray = new String[]{ "Jordan" , "bar" , "Prior" , "Pryor" };
        final List<java.lang.String> testList = java.util.Arrays.asList(testArray);
        final String[] controlArray = new String[]{ "Jordan" , "Prior" , "Pryor" , "Sosa" };
        java.util.Collections.sort(testList, sCompare);
        final String[] resultArray = testList.toArray(new String[0]);
        for (int i = 0 ; i < (resultArray.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2742,("Result Array not Equal to Control Array at index: " + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2743,controlArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2744,resultArray[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testComparatorWithDoubleMetaphone_literalMutation4495() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorWithDoubleMetaphone_literalMutation4495");
        final StringEncoderComparator sCompare = new StringEncoderComparator(new DoubleMetaphone());
        final String[] testArray = new String[]{ "Jordan" , "Sosa" , "foo" , "Pryor" };
        final List<java.lang.String> testList = java.util.Arrays.asList(testArray);
        final String[] controlArray = new String[]{ "Jordan" , "Prior" , "Pryor" , "Sosa" };
        java.util.Collections.sort(testList, sCompare);
        final String[] resultArray = testList.toArray(new String[0]);
        for (int i = 0 ; i < (resultArray.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2742,("Result Array not Equal to Control Array at index: " + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2743,controlArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2744,resultArray[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testComparatorWithDoubleMetaphone_literalMutation4496() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorWithDoubleMetaphone_literalMutation4496");
        final StringEncoderComparator sCompare = new StringEncoderComparator(new DoubleMetaphone());
        final String[] testArray = new String[]{ "Jordan" , "Sosa" , "Prior" , "bar" };
        final List<java.lang.String> testList = java.util.Arrays.asList(testArray);
        final String[] controlArray = new String[]{ "Jordan" , "Prior" , "Pryor" , "Sosa" };
        java.util.Collections.sort(testList, sCompare);
        final String[] resultArray = testList.toArray(new String[0]);
        for (int i = 0 ; i < (resultArray.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2742,("Result Array not Equal to Control Array at index: " + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2743,controlArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2744,resultArray[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testComparatorWithDoubleMetaphone_literalMutation4497() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorWithDoubleMetaphone_literalMutation4497");
        final StringEncoderComparator sCompare = new StringEncoderComparator(new DoubleMetaphone());
        final String[] testArray = new String[]{ "Jordan" , "Sosa" , "Prior" , "Pryor" };
        final List<java.lang.String> testList = java.util.Arrays.asList(testArray);
        final String[] controlArray = new String[]{ "foo" , "Prior" , "Pryor" , "Sosa" };
        java.util.Collections.sort(testList, sCompare);
        final String[] resultArray = testList.toArray(new String[0]);
        for (int i = 0 ; i < (resultArray.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2742,("Result Array not Equal to Control Array at index: " + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2743,controlArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2744,resultArray[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testComparatorWithDoubleMetaphone_literalMutation4498() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorWithDoubleMetaphone_literalMutation4498");
        final StringEncoderComparator sCompare = new StringEncoderComparator(new DoubleMetaphone());
        final String[] testArray = new String[]{ "Jordan" , "Sosa" , "Prior" , "Pryor" };
        final List<java.lang.String> testList = java.util.Arrays.asList(testArray);
        final String[] controlArray = new String[]{ "Jordan" , "bar" , "Pryor" , "Sosa" };
        java.util.Collections.sort(testList, sCompare);
        final String[] resultArray = testList.toArray(new String[0]);
        for (int i = 0 ; i < (resultArray.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2742,("Result Array not Equal to Control Array at index: " + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2743,controlArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2744,resultArray[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testComparatorWithDoubleMetaphone_literalMutation4499() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorWithDoubleMetaphone_literalMutation4499");
        final StringEncoderComparator sCompare = new StringEncoderComparator(new DoubleMetaphone());
        final String[] testArray = new String[]{ "Jordan" , "Sosa" , "Prior" , "Pryor" };
        final List<java.lang.String> testList = java.util.Arrays.asList(testArray);
        final String[] controlArray = new String[]{ "Jordan" , "Prior" , "bar" , "Sosa" };
        java.util.Collections.sort(testList, sCompare);
        final String[] resultArray = testList.toArray(new String[0]);
        for (int i = 0 ; i < (resultArray.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2742,("Result Array not Equal to Control Array at index: " + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2743,controlArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2744,resultArray[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testComparatorWithDoubleMetaphone_literalMutation4500() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorWithDoubleMetaphone_literalMutation4500");
        final StringEncoderComparator sCompare = new StringEncoderComparator(new DoubleMetaphone());
        final String[] testArray = new String[]{ "Jordan" , "Sosa" , "Prior" , "Pryor" };
        final List<java.lang.String> testList = java.util.Arrays.asList(testArray);
        final String[] controlArray = new String[]{ "Jordan" , "Prior" , "Pryor" , "bar" };
        java.util.Collections.sort(testList, sCompare);
        final String[] resultArray = testList.toArray(new String[0]);
        for (int i = 0 ; i < (resultArray.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2742,("Result Array not Equal to Control Array at index: " + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2743,controlArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2744,resultArray[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testComparatorWithDoubleMetaphone_literalMutation4501() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorWithDoubleMetaphone_literalMutation4501");
        final StringEncoderComparator sCompare = new StringEncoderComparator(new DoubleMetaphone());
        final String[] testArray = new String[]{ "Jordan" , "Sosa" , "Prior" , "Pryor" };
        final List<java.lang.String> testList = java.util.Arrays.asList(testArray);
        final String[] controlArray = new String[]{ "Jordan" , "Prior" , "Pryor" , "Sosa" };
        java.util.Collections.sort(testList, sCompare);
        final String[] resultArray = testList.toArray(new String[1]);
        for (int i = 0 ; i < (resultArray.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2742,("Result Array not Equal to Control Array at index: " + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2743,controlArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2744,resultArray[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testComparatorWithDoubleMetaphone_literalMutation4502() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorWithDoubleMetaphone_literalMutation4502");
        final StringEncoderComparator sCompare = new StringEncoderComparator(new DoubleMetaphone());
        final String[] testArray = new String[]{ "Jordan" , "Sosa" , "Prior" , "Pryor" };
        final List<java.lang.String> testList = java.util.Arrays.asList(testArray);
        final String[] controlArray = new String[]{ "Jordan" , "Prior" , "Pryor" , "Sosa" };
        java.util.Collections.sort(testList, sCompare);
        final String[] resultArray = testList.toArray(new String[-1]);
        for (int i = 0 ; i < (resultArray.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2742,("Result Array not Equal to Control Array at index: " + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2743,controlArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2744,resultArray[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testComparatorWithDoubleMetaphone_literalMutation4503() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorWithDoubleMetaphone_literalMutation4503");
        final StringEncoderComparator sCompare = new StringEncoderComparator(new DoubleMetaphone());
        final String[] testArray = new String[]{ "Jordan" , "Sosa" , "Prior" , "Pryor" };
        final List<java.lang.String> testList = java.util.Arrays.asList(testArray);
        final String[] controlArray = new String[]{ "Jordan" , "Prior" , "Pryor" , "Sosa" };
        java.util.Collections.sort(testList, sCompare);
        final String[] resultArray = testList.toArray(new String[0]);
        for (int i = 0 ; i < (resultArray.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2742,("Result Array not Equal to Control Array at index: " + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2743,controlArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2744,resultArray[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testComparatorWithDoubleMetaphone_literalMutation4504() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorWithDoubleMetaphone_literalMutation4504");
        final StringEncoderComparator sCompare = new StringEncoderComparator(new DoubleMetaphone());
        final String[] testArray = new String[]{ "Jordan" , "Sosa" , "Prior" , "Pryor" };
        final List<java.lang.String> testList = java.util.Arrays.asList(testArray);
        final String[] controlArray = new String[]{ "Jordan" , "Prior" , "Pryor" , "Sosa" };
        java.util.Collections.sort(testList, sCompare);
        final String[] resultArray = testList.toArray(new String[0]);
        for (int i = 1 ; i < (resultArray.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2742,("Result Array not Equal to Control Array at index: " + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2743,controlArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2744,resultArray[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testComparatorWithDoubleMetaphone_literalMutation4505() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorWithDoubleMetaphone_literalMutation4505");
        final StringEncoderComparator sCompare = new StringEncoderComparator(new DoubleMetaphone());
        final String[] testArray = new String[]{ "Jordan" , "Sosa" , "Prior" , "Pryor" };
        final List<java.lang.String> testList = java.util.Arrays.asList(testArray);
        final String[] controlArray = new String[]{ "Jordan" , "Prior" , "Pryor" , "Sosa" };
        java.util.Collections.sort(testList, sCompare);
        final String[] resultArray = testList.toArray(new String[0]);
        for (int i = -1 ; i < (resultArray.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2742,("Result Array not Equal to Control Array at index: " + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2743,controlArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2744,resultArray[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testComparatorWithDoubleMetaphone_literalMutation4506() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorWithDoubleMetaphone_literalMutation4506");
        final StringEncoderComparator sCompare = new StringEncoderComparator(new DoubleMetaphone());
        final String[] testArray = new String[]{ "Jordan" , "Sosa" , "Prior" , "Pryor" };
        final List<java.lang.String> testList = java.util.Arrays.asList(testArray);
        final String[] controlArray = new String[]{ "Jordan" , "Prior" , "Pryor" , "Sosa" };
        java.util.Collections.sort(testList, sCompare);
        final String[] resultArray = testList.toArray(new String[0]);
        for (int i = 0 ; i < (resultArray.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2742,("Result Array not Equal to Control Array at index: " + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2743,controlArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2744,resultArray[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testComparatorWithDoubleMetaphone_remove483() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorWithDoubleMetaphone_remove483");
        final StringEncoderComparator sCompare = new StringEncoderComparator(new DoubleMetaphone());
        final String[] testArray = new String[]{ "Jordan" , "Sosa" , "Prior" , "Pryor" };
        final List<java.lang.String> testList = java.util.Arrays.asList(testArray);
        final String[] controlArray = new String[]{ "Jordan" , "Prior" , "Pryor" , "Sosa" };
        final String[] resultArray = testList.toArray(new String[0]);
        for (int i = 0 ; i < (resultArray.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2742,("Result Array not Equal to Control Array at index: " + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2743,controlArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2744,resultArray[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testComparatorWithDoubleMetaphoneAndInvalidInput() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorWithDoubleMetaphoneAndInvalidInput");
        final StringEncoderComparator sCompare = new StringEncoderComparator(new DoubleMetaphone());
        final int compare = sCompare.compare(new java.lang.Double(4.0), java.lang.Long.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2741,compare);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testComparatorWithDoubleMetaphoneAndInvalidInput_literalMutation4508() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorWithDoubleMetaphoneAndInvalidInput_literalMutation4508");
        final StringEncoderComparator sCompare = new StringEncoderComparator(new DoubleMetaphone());
        final int compare = sCompare.compare(new java.lang.Double(2.0), java.lang.Long.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2741,compare);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testComparatorWithDoubleMetaphoneAndInvalidInput_literalMutation4509() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorWithDoubleMetaphoneAndInvalidInput_literalMutation4509");
        final StringEncoderComparator sCompare = new StringEncoderComparator(new DoubleMetaphone());
        final int compare = sCompare.compare(new java.lang.Double(1.5), java.lang.Long.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2741,compare);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testComparatorWithDoubleMetaphoneAndInvalidInput_literalMutation4510() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorWithDoubleMetaphoneAndInvalidInput_literalMutation4510");
        final StringEncoderComparator sCompare = new StringEncoderComparator(new DoubleMetaphone());
        final int compare = sCompare.compare(new java.lang.Double(6.0), java.lang.Long.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2741,compare);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testComparatorWithDoubleMetaphoneAndInvalidInput_literalMutation4511() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorWithDoubleMetaphoneAndInvalidInput_literalMutation4511");
        final StringEncoderComparator sCompare = new StringEncoderComparator(new DoubleMetaphone());
        final int compare = sCompare.compare(new java.lang.Double(3.0), java.lang.Long.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2741,compare);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testComparatorWithDoubleMetaphoneAndInvalidInput_literalMutation4512() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorWithDoubleMetaphoneAndInvalidInput_literalMutation4512");
        final StringEncoderComparator sCompare = new StringEncoderComparator(new DoubleMetaphone());
        final int compare = sCompare.compare(new java.lang.Double(3.0), java.lang.Long.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2741,compare);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testComparatorWithDoubleMetaphoneAndInvalidInput_literalMutation4513() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorWithDoubleMetaphoneAndInvalidInput_literalMutation4513");
        final StringEncoderComparator sCompare = new StringEncoderComparator(new DoubleMetaphone());
        final int compare = sCompare.compare(new java.lang.Double(3.0), java.lang.Long.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2741,compare);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testComparatorWithDoubleMetaphoneAndInvalidInput_literalMutation4514() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorWithDoubleMetaphoneAndInvalidInput_literalMutation4514");
        final StringEncoderComparator sCompare = new StringEncoderComparator(new DoubleMetaphone());
        final int compare = sCompare.compare(new java.lang.Double(3.0), java.lang.Long.valueOf(6));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2741,compare);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


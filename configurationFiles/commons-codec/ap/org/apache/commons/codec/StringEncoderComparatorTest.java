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
    public void testComparatorWithDoubleMetaphone_literalMutation2631() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorWithDoubleMetaphone_literalMutation2631");
        final StringEncoderComparator sCompare = new StringEncoderComparator(new DoubleMetaphone());
        final String[] testArray = new String[]{ "Jordan" , "foo" , "Prior" , "Pryor" };
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
    public void testComparatorWithDoubleMetaphone_literalMutation2632() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorWithDoubleMetaphone_literalMutation2632");
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
    public void testComparatorWithDoubleMetaphone_literalMutation2633() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorWithDoubleMetaphone_literalMutation2633");
        final StringEncoderComparator sCompare = new StringEncoderComparator(new DoubleMetaphone());
        final String[] testArray = new String[]{ "Jordan" , "Sosa" , "Prior" , "foo" };
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
    public void testComparatorWithDoubleMetaphone_literalMutation2634() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorWithDoubleMetaphone_literalMutation2634");
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
    public void testComparatorWithDoubleMetaphone_literalMutation2635() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorWithDoubleMetaphone_literalMutation2635");
        final StringEncoderComparator sCompare = new StringEncoderComparator(new DoubleMetaphone());
        final String[] testArray = new String[]{ "Jordan" , "Sosa" , "Prior" , "Pryor" };
        final List<java.lang.String> testList = java.util.Arrays.asList(testArray);
        final String[] controlArray = new String[]{ "Jordan" , "foo" , "Pryor" , "Sosa" };
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
    public void testComparatorWithDoubleMetaphone_literalMutation2636() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorWithDoubleMetaphone_literalMutation2636");
        final StringEncoderComparator sCompare = new StringEncoderComparator(new DoubleMetaphone());
        final String[] testArray = new String[]{ "Jordan" , "Sosa" , "Prior" , "Pryor" };
        final List<java.lang.String> testList = java.util.Arrays.asList(testArray);
        final String[] controlArray = new String[]{ "Jordan" , "Prior" , "foo" , "Sosa" };
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
    public void testComparatorWithDoubleMetaphone_literalMutation2637() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorWithDoubleMetaphone_literalMutation2637");
        final StringEncoderComparator sCompare = new StringEncoderComparator(new DoubleMetaphone());
        final String[] testArray = new String[]{ "Jordan" , "Sosa" , "Prior" , "Pryor" };
        final List<java.lang.String> testList = java.util.Arrays.asList(testArray);
        final String[] controlArray = new String[]{ "Jordan" , "Prior" , "Pryor" , "foo" };
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
    public void testComparatorWithDoubleMetaphone_literalMutation2638() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorWithDoubleMetaphone_literalMutation2638");
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
    public void testComparatorWithDoubleMetaphone_literalMutation2639() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorWithDoubleMetaphone_literalMutation2639");
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
        final int compare = sCompare.compare(new java.lang.Double(2.0), java.lang.Long.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2741,compare);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testComparatorWithDoubleMetaphoneAndInvalidInput_literalMutation2641() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorWithDoubleMetaphoneAndInvalidInput_literalMutation2641");
        final StringEncoderComparator sCompare = new StringEncoderComparator(new DoubleMetaphone());
        final int compare = sCompare.compare(new java.lang.Double(3.0), java.lang.Long.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2741,compare);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}


/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.iterators;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.collections4.OrderedIterator;
import org.apache.commons.collections4.iterators.EmptyOrderedIterator;
import org.junit.BeforeClass;

public class EmptyOrderedIteratorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.iterators.EmptyOrderedIterator.emptyOrderedIterator()Lorg/apache/commons/collections4/OrderedIterator;: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(496,"org.apache.commons.collections4.iterators.EmptyOrderedIteratorEvoSuiteTest.test0");
      OrderedIterator<Integer> orderedIterator0 = EmptyOrderedIterator.emptyOrderedIterator();
      assertEquals(false, orderedIterator0.hasNext());
  }
}
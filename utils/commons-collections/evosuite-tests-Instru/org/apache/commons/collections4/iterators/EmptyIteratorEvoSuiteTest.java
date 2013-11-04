/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.iterators;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Iterator;
import org.apache.commons.collections4.ResettableIterator;
import org.apache.commons.collections4.iterators.EmptyIterator;
import org.junit.BeforeClass;

public class EmptyIteratorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.iterators.EmptyIterator.resettableEmptyIterator()Lorg/apache/commons/collections4/ResettableIterator;: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(491,"org.apache.commons.collections4.iterators.EmptyIteratorEvoSuiteTest.test0");
      ResettableIterator<Object> resettableIterator0 = EmptyIterator.resettableEmptyIterator();
      assertEquals(false, resettableIterator0.hasNext());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator()Ljava/util/Iterator;: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(492,"org.apache.commons.collections4.iterators.EmptyIteratorEvoSuiteTest.test1");
      Iterator<Integer> iterator0 = EmptyIterator.emptyIterator();
      assertEquals(false, iterator0.hasNext());
  }
}
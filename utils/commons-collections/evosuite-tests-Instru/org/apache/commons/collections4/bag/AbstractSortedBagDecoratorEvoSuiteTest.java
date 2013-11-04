/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.bag;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collection;
import org.apache.commons.collections4.SortedBag;
import org.apache.commons.collections4.bag.TreeBag;
import org.apache.commons.collections4.bag.UnmodifiableSortedBag;
import org.junit.BeforeClass;

public class AbstractSortedBagDecoratorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.bag.AbstractSortedBagDecorator.decorated()Lorg/apache/commons/collections4/SortedBag;: root-Branch
   * 2 org.apache.commons.collections4.bag.AbstractSortedBagDecorator.<init>(Lorg/apache/commons/collections4/SortedBag;)V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1075,"org.apache.commons.collections4.bag.AbstractSortedBagDecoratorEvoSuiteTest.test0");
      TreeBag<Object> treeBag0 = new TreeBag<Object>();
      SortedBag<Object> sortedBag0 = UnmodifiableSortedBag.unmodifiableSortedBag((SortedBag<Object>) treeBag0);
      boolean boolean0 = treeBag0.addAll((Collection<?>) sortedBag0);
      assertEquals(false, boolean0);
  }
}
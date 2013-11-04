/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.iterators;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.iterators.IteratorChain;
import org.junit.BeforeClass;

public class IteratorChainEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 16 covered goals:
   * 1 org.apache.commons.collections4.iterators.IteratorChain.hasNext()Z: root-Branch
   * 2 org.apache.commons.collections4.iterators.IteratorChain.<init>(Ljava/util/Iterator;Ljava/util/Iterator;)V: root-Branch
   * 3 org.apache.commons.collections4.iterators.IteratorChain.<init>()V: root-Branch
   * 4 org.apache.commons.collections4.iterators.IteratorChain.addIterator(Ljava/util/Iterator;)V: I7 Branch 3 IFNONNULL L161 - true
   * 5 org.apache.commons.collections4.iterators.IteratorChain.checkLocked()V: I5 Branch 4 IF_ICMPNE L191 - true
   * 6 org.apache.commons.collections4.iterators.IteratorChain.lockChain()V: I4 Branch 5 IFNE L202 - true
   * 7 org.apache.commons.collections4.iterators.IteratorChain.lockChain()V: I4 Branch 5 IFNE L202 - false
   * 8 org.apache.commons.collections4.iterators.IteratorChain.updateCurrentIterator()V: I4 Branch 6 IFNONNULL L212 - true
   * 9 org.apache.commons.collections4.iterators.IteratorChain.updateCurrentIterator()V: I4 Branch 6 IFNONNULL L212 - false
   * 10 org.apache.commons.collections4.iterators.IteratorChain.updateCurrentIterator()V: I10 Branch 7 IFLE L213 - true
   * 11 org.apache.commons.collections4.iterators.IteratorChain.updateCurrentIterator()V: I10 Branch 7 IFLE L213 - false
   * 12 org.apache.commons.collections4.iterators.IteratorChain.updateCurrentIterator()V: I36 Branch 8 IFNE L223 - false
   * 13 org.apache.commons.collections4.iterators.IteratorChain.updateCurrentIterator()V: I40 Branch 9 IFGT L223 - true
   * 14 org.apache.commons.collections4.iterators.IteratorChain.updateCurrentIterator()V: I40 Branch 9 IFGT L223 - false
   * 15 org.apache.commons.collections4.iterators.IteratorChain.remove()V: I8 Branch 10 IFNONNULL L272 - true
   * 16 org.apache.commons.collections4.iterators.IteratorChain.remove()V: I8 Branch 10 IFNONNULL L272 - false
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(532,"org.apache.commons.collections4.iterators.IteratorChainEvoSuiteTest.test0");
      IteratorChain<Integer> iteratorChain0 = new IteratorChain<Integer>();
      IteratorChain<Object> iteratorChain1 = new IteratorChain<Object>((Iterator<?>) iteratorChain0, (Iterator<?>) iteratorChain0);
      assertEquals(2, iteratorChain1.size());
      
      // Undeclared exception!
      try {
        iteratorChain1.remove();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Iterator contains no elements
         //
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.iterators.IteratorChain.<init>(Ljava/util/Iterator;)V: root-Branch
   * 2 org.apache.commons.collections4.iterators.IteratorChain.addIterator(Ljava/util/Iterator;)V: I7 Branch 3 IFNONNULL L161 - false
   */

  @Test
  public void test1()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(533,"org.apache.commons.collections4.iterators.IteratorChainEvoSuiteTest.test1");
      IteratorChain<Object> iteratorChain0 = null;
      try {
        iteratorChain0 = new IteratorChain<Object>((Iterator<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Iterator must not be null
         //
      }
  }

 

  //Test case number: 3
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.iterators.IteratorChain.next()Ljava/lang/Object;: root-Branch
   * 2 org.apache.commons.collections4.iterators.IteratorChain.updateCurrentIterator()V: I10 Branch 7 IFLE L213 - false
   */

  @Test
  public void test3()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(535,"org.apache.commons.collections4.iterators.IteratorChainEvoSuiteTest.test3");
      IteratorChain<Object> iteratorChain0 = new IteratorChain<Object>();
      // Undeclared exception!
      try {
        iteratorChain0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // Iterator contains no elements
         //
      }
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.iterators.IteratorChain.size()I: root-Branch
   * 2 org.apache.commons.collections4.iterators.IteratorChain.<init>()V: root-Branch
   */

  @Test
  public void test4()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(536,"org.apache.commons.collections4.iterators.IteratorChainEvoSuiteTest.test4");
      IteratorChain<Object> iteratorChain0 = new IteratorChain<Object>();
      int int0 = iteratorChain0.size();
      assertEquals(0, int0);
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.iterators.IteratorChain.<init>([Ljava/util/Iterator;)V: I40 Branch 1 IF_ICMPGE L127 - true
   * 2 org.apache.commons.collections4.iterators.IteratorChain.<init>([Ljava/util/Iterator;)V: I40 Branch 1 IF_ICMPGE L127 - false
   */

  @Test
  public void test5()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(537,"org.apache.commons.collections4.iterators.IteratorChainEvoSuiteTest.test5");
      Iterator<Object>[] iteratorArray0 = (Iterator<Object>[]) Array.newInstance(Iterator.class, 3);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ListIterator<Object> listIterator0 = linkedList0.listIterator(0);
      iteratorArray0[0] = (Iterator<Object>) listIterator0;
      IteratorChain<Object> iteratorChain0 = new IteratorChain<Object>((Iterator<?>) listIterator0, (Iterator<?>) listIterator0);
      assertEquals(2, iteratorChain0.size());
      
      iteratorArray0[1] = (Iterator<Object>) iteratorChain0;
      iteratorArray0[2] = iteratorArray0[0];
      IteratorChain<Object> iteratorChain1 = new IteratorChain<Object>(iteratorArray0);
      assertEquals(3, iteratorChain1.size());
  }

  //Test case number: 6
  /*
   * 4 covered goals:
   * 1 org.apache.commons.collections4.iterators.IteratorChain.checkLocked()V: I5 Branch 4 IF_ICMPNE L191 - false
   * 2 org.apache.commons.collections4.iterators.IteratorChain.updateCurrentIterator()V: I36 Branch 8 IFNE L223 - false
   * 3 org.apache.commons.collections4.iterators.IteratorChain.updateCurrentIterator()V: I40 Branch 9 IFGT L223 - true
   * 4 org.apache.commons.collections4.iterators.IteratorChain.updateCurrentIterator()V: I40 Branch 9 IFGT L223 - false
   */

  @Test
  public void test6()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(538,"org.apache.commons.collections4.iterators.IteratorChainEvoSuiteTest.test6");
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ListIterator<Object> listIterator0 = linkedList0.listIterator();
      IteratorChain<Object> iteratorChain0 = new IteratorChain<Object>((Iterator<?>) listIterator0, (Iterator<?>) listIterator0);
      assertEquals(2, iteratorChain0.size());
      
      iteratorChain0.hasNext();
      // Undeclared exception!
      try {
        iteratorChain0.addIterator((Iterator<?>) listIterator0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // IteratorChain cannot be changed after the first use of a method from the Iterator interface
         //
      }
  }

  //Test case number: 7
  /*
   * 8 covered goals:
   * 1 org.apache.commons.collections4.iterators.IteratorChain.updateCurrentIterator()V: I36 Branch 8 IFNE L223 - true
   * 2 org.apache.commons.collections4.iterators.IteratorChain.hasNext()Z: root-Branch
   * 3 org.apache.commons.collections4.iterators.IteratorChain.<init>(Ljava/util/Iterator;Ljava/util/Iterator;)V: root-Branch
   * 4 org.apache.commons.collections4.iterators.IteratorChain.checkLocked()V: I5 Branch 4 IF_ICMPNE L191 - true
   * 5 org.apache.commons.collections4.iterators.IteratorChain.lockChain()V: I4 Branch 5 IFNE L202 - false
   * 6 org.apache.commons.collections4.iterators.IteratorChain.addIterator(Ljava/util/Iterator;)V: I7 Branch 3 IFNONNULL L161 - true
   * 7 org.apache.commons.collections4.iterators.IteratorChain.updateCurrentIterator()V: I4 Branch 6 IFNONNULL L212 - false
   * 8 org.apache.commons.collections4.iterators.IteratorChain.updateCurrentIterator()V: I10 Branch 7 IFLE L213 - true
   */

  @Test
  public void test7()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(539,"org.apache.commons.collections4.iterators.IteratorChainEvoSuiteTest.test7");
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.toString();
      linkedList0.add((Object) "[]");
      ListIterator<Object> listIterator0 = linkedList0.listIterator();
      IteratorChain<Object> iteratorChain0 = new IteratorChain<Object>((Iterator<?>) listIterator0, (Iterator<?>) listIterator0);
      boolean boolean0 = iteratorChain0.hasNext();
      assertEquals(1, iteratorChain0.size());
      assertEquals(true, boolean0);
  }
}
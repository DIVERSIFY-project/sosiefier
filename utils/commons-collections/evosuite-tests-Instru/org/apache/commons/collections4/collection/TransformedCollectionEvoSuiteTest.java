/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.collection;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.LinkedList;
import org.apache.commons.collections4.FunctorException;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.collection.TransformedCollection;
import org.apache.commons.collections4.functors.ConstantTransformer;
import org.apache.commons.collections4.functors.InvokerTransformer;
import org.junit.BeforeClass;

public class TransformedCollectionEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 6 covered goals:
   * 1 org.apache.commons.collections4.collection.TransformedCollection.transform(Ljava/lang/Object;)Ljava/lang/Object;: root-Branch
   * 2 org.apache.commons.collections4.collection.TransformedCollection.addAll(Ljava/util/Collection;)Z: root-Branch
   * 3 org.apache.commons.collections4.collection.TransformedCollection.transformingCollection(Ljava/util/Collection;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/collection/TransformedCollection;: root-Branch
   * 4 org.apache.commons.collections4.collection.TransformedCollection.<init>(Ljava/util/Collection;Lorg/apache/commons/collections4/Transformer;)V: I8 Branch 3 IFNONNULL L110 - true
   * 5 org.apache.commons.collections4.collection.TransformedCollection.transform(Ljava/util/Collection;)Ljava/util/Collection;: I16 Branch 4 IFEQ L138 - true
   * 6 org.apache.commons.collections4.collection.TransformedCollection.transform(Ljava/util/Collection;)Ljava/util/Collection;: I16 Branch 4 IFEQ L138 - false
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(999,"org.apache.commons.collections4.collection.TransformedCollectionEvoSuiteTest.test0");
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 9);
      linkedList0.add((Integer) null);
      InvokerTransformer<Integer, Integer> invokerTransformer0 = new InvokerTransformer<Integer, Integer>("A=?$t+", (Class<?>[]) classArray0, (Object[]) classArray0);
      TransformedCollection<Integer> transformedCollection0 = TransformedCollection.transformingCollection((Collection<Integer>) linkedList0, (Transformer<? super Integer, ? extends Integer>) invokerTransformer0);
      boolean boolean0 = transformedCollection0.addAll((Collection<? extends Integer>) linkedList0);
      assertEquals(2, linkedList0.size());
      assertEquals(true, boolean0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.collection.TransformedCollection.add(Ljava/lang/Object;)Z: root-Branch
   * 2 org.apache.commons.collections4.collection.TransformedCollection.transformedCollection(Ljava/util/Collection;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/collection/TransformedCollection;: I12 Branch 1 IFLE L86 - true
   */

  @Test
  public void test1()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1000,"org.apache.commons.collections4.collection.TransformedCollectionEvoSuiteTest.test1");
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 6);
      InvokerTransformer<Object, Integer> invokerTransformer0 = new InvokerTransformer<Object, Integer>("2ADE4rX", (Class<?>[]) classArray0, (Object[]) classArray0);
      TransformedCollection<Object> transformedCollection0 = TransformedCollection.transformingCollection((Collection<Object>) linkedList0, (Transformer<? super Object, ?>) invokerTransformer0);
      assertNotNull(transformedCollection0);
      
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      TransformedCollection<Integer> transformedCollection1 = TransformedCollection.transformedCollection((Collection<Integer>) linkedList1, (Transformer<? super Integer, ? extends Integer>) invokerTransformer0);
      transformedCollection1.toString();
      // Undeclared exception!
      try {
        transformedCollection0.add((Object) "[]");
        fail("Expecting exception: FunctorException");
      
      } catch(FunctorException e) {
         //
         // InvokerTransformer: The method '2ADE4rX' on 'class java.lang.String' does not exist
         //
      }
  }

  //Test case number: 2
  /*
   * 7 covered goals:
   * 1 org.apache.commons.collections4.collection.TransformedCollection.transformedCollection(Ljava/util/Collection;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/collection/TransformedCollection;: I12 Branch 1 IFLE L86 - false
   * 2 org.apache.commons.collections4.collection.TransformedCollection.transformedCollection(Ljava/util/Collection;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/collection/TransformedCollection;: I37 Branch 2 IF_ICMPGE L90 - true
   * 3 org.apache.commons.collections4.collection.TransformedCollection.transformedCollection(Ljava/util/Collection;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/collection/TransformedCollection;: I37 Branch 2 IF_ICMPGE L90 - false
   * 4 org.apache.commons.collections4.collection.TransformedCollection.transform(Ljava/lang/Object;)Ljava/lang/Object;: root-Branch
   * 5 org.apache.commons.collections4.collection.TransformedCollection.add(Ljava/lang/Object;)Z: root-Branch
   * 6 org.apache.commons.collections4.collection.TransformedCollection.transformingCollection(Ljava/util/Collection;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/collection/TransformedCollection;: root-Branch
   * 7 org.apache.commons.collections4.collection.TransformedCollection.<init>(Ljava/util/Collection;Lorg/apache/commons/collections4/Transformer;)V: I8 Branch 3 IFNONNULL L110 - true
   */

  @Test
  public void test2()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1001,"org.apache.commons.collections4.collection.TransformedCollectionEvoSuiteTest.test2");
      Transformer<Object, Object> transformer0 = ConstantTransformer.NULL_INSTANCE;
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      TransformedCollection<Object> transformedCollection0 = TransformedCollection.transformingCollection((Collection<Object>) linkedList0, (Transformer<? super Object, ?>) transformer0);
      linkedList0.retainAll((Collection<?>) transformedCollection0);
      transformedCollection0.add((Object) false);
      TransformedCollection.transformedCollection((Collection<Object>) transformedCollection0, (Transformer<? super Object, ?>) transformer0);
      assertEquals(1, linkedList0.size());
      assertEquals(false, linkedList0.isEmpty());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.collection.TransformedCollection.<init>(Ljava/util/Collection;Lorg/apache/commons/collections4/Transformer;)V: I8 Branch 3 IFNONNULL L110 - false
   */

  @Test
  public void test3()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1002,"org.apache.commons.collections4.collection.TransformedCollectionEvoSuiteTest.test3");
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      // Undeclared exception!
      try {
        TransformedCollection.transformedCollection((Collection<Object>) linkedList0, (Transformer<? super Object, ?>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Transformer must not be null
         //
      }
  }
}
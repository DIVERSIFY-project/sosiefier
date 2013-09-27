/*
 * This file was automatically generated by EvoSuite
 */

package org.jbehave.core.io;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.jbehave.core.io.RelativePathCalculator;


public class RelativePathCalculatorEvoSuiteTest {


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 org.jbehave.core.io.RelativePathCalculator.<init>()V: root-Branch
   * 2 org.jbehave.core.io.RelativePathCalculator.calculate(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   * 3 org.jbehave.core.io.RelativePathCalculator.split(Ljava/lang/String;)Ljava/util/List;: I5 Branch 1 IFNE L13 - false
   */
  @Test
  public void test0()  throws Throwable  {
      RelativePathCalculator relativePathCalculator0 = new RelativePathCalculator();
      // Undeclared exception!
      try {
        relativePathCalculator0.calculate("", "");
      }catch(IndexOutOfBoundsException e) {
        /*
         * Index: 0, Size: 0
         */
        /*
      %%%<ex><className val="IndexOutOfBoundsException"/><stackDepth val="17"/><causeDepth val="0"/><source val="java.util.LinkedList.entry(LinkedList.java:382)"/></ex>%%%
         */
      }
  }

  //Test case number: 1
  /*
   * 6 covered goals:
   * 1 org.jbehave.core.io.RelativePathCalculator.<init>()V: root-Branch
   * 2 org.jbehave.core.io.RelativePathCalculator.calculate(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   * 3 org.jbehave.core.io.RelativePathCalculator.split(Ljava/lang/String;)Ljava/util/List;: I5 Branch 1 IFNE L13 - true
   * 4 org.jbehave.core.io.RelativePathCalculator.join(Ljava/lang/Iterable;)Ljava/lang/String;: I29 Branch 4 IFNE L33 - true
   * 5 org.jbehave.core.io.RelativePathCalculator.calculatePath(Ljava/util/List;Ljava/util/List;)Ljava/lang/Iterable;: I7 Branch 2 IFNE L20 - false
   * 6 org.jbehave.core.io.RelativePathCalculator.join(Ljava/lang/Iterable;)Ljava/lang/String;: I29 Branch 4 IFNE L33 - false
   */
  @Test
  public void test1()  throws Throwable  {
      RelativePathCalculator relativePathCalculator0 = new RelativePathCalculator();
      RelativePathCalculator relativePathCalculator1 = new RelativePathCalculator();
      RelativePathCalculator relativePathCalculator2 = new RelativePathCalculator();
      RelativePathCalculator relativePathCalculator3 = new RelativePathCalculator();
      String string0 = relativePathCalculator3.calculate("/GC$=P-t9|9O/5|H", "/GC$=P-t9|9O/5|H");
      String string1 = relativePathCalculator3.calculate("/GC$=P-t9|9O/5|H", "/GC$=P-t9|9O/5|H");
      // Undeclared exception!
      try {
        relativePathCalculator3.calculate("/GC$=P-t9|9O/5|H", (String) null);
      }catch(NullPointerException e) {
        /*
         * no message in exception (getMessage() returned null)
         */
        /*
      %%%<ex><className val="NullPointerException"/><stackDepth val="15"/><causeDepth val="0"/><source val="org.jbehave.core.io.RelativePathCalculator.split(RelativePathCalculator.java:13)"/></ex>%%%
         */
      }
  }

  //Test case number: 2
  /*
   * 3 covered goals:
   * 1 org.jbehave.core.io.RelativePathCalculator.<init>()V: root-Branch
   * 2 org.jbehave.core.io.RelativePathCalculator.calculate(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   * 3 org.jbehave.core.io.RelativePathCalculator.split(Ljava/lang/String;)Ljava/util/List;: I5 Branch 1 IFNE L13 - false
   */
  @Test
  public void test2()  throws Throwable  {
      RelativePathCalculator relativePathCalculator0 = new RelativePathCalculator();
      RelativePathCalculator relativePathCalculator1 = new RelativePathCalculator();
      RelativePathCalculator relativePathCalculator2 = new RelativePathCalculator();
      String string0 = "";
      // Undeclared exception!
      try {
        relativePathCalculator0.calculate("", "");
      }catch(IndexOutOfBoundsException e) {
        /*
         * Index: 0, Size: 0
         */
        /*
      %%%<ex><className val="IndexOutOfBoundsException"/><stackDepth val="17"/><causeDepth val="0"/><source val="java.util.LinkedList.entry(LinkedList.java:382)"/></ex>%%%
         */
      }
  }

  //Test case number: 4
  /*
   * 3 covered goals:
   * 1 org.jbehave.core.io.RelativePathCalculator.<init>()V: root-Branch
   * 2 org.jbehave.core.io.RelativePathCalculator.calculate(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   * 3 org.jbehave.core.io.RelativePathCalculator.split(Ljava/lang/String;)Ljava/util/List;: I5 Branch 1 IFNE L13 - false
   */
  @Test
  public void test4()  throws Throwable  {
      RelativePathCalculator relativePathCalculator0 = new RelativePathCalculator();
      String string0 = "";
      // Undeclared exception!
      try {
        relativePathCalculator0.calculate("", "");
      }catch(IndexOutOfBoundsException e) {
        /*
         * Index: 0, Size: 0
         */
        /*
      %%%<ex><className val="IndexOutOfBoundsException"/><stackDepth val="17"/><causeDepth val="0"/><source val="java.util.LinkedList.entry(LinkedList.java:382)"/></ex>%%%
         */
      }
  }

  //Test case number: 5
  /*
   * 8 covered goals:
   * 1 org.jbehave.core.io.RelativePathCalculator.<init>()V: root-Branch
   * 2 org.jbehave.core.io.RelativePathCalculator.calculate(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   * 3 org.jbehave.core.io.RelativePathCalculator.split(Ljava/lang/String;)Ljava/util/List;: I5 Branch 1 IFNE L13 - true
   * 4 org.jbehave.core.io.RelativePathCalculator.calculatePath(Ljava/util/List;Ljava/util/List;)Ljava/lang/Iterable;: I7 Branch 2 IFNE L20 - true
   * 5 org.jbehave.core.io.RelativePathCalculator.join(Ljava/lang/Iterable;)Ljava/lang/String;: I29 Branch 4 IFNE L33 - true
   * 6 org.jbehave.core.io.RelativePathCalculator.split(Ljava/lang/String;)Ljava/util/List;: I5 Branch 1 IFNE L13 - false
   * 7 org.jbehave.core.io.RelativePathCalculator.calculatePath(Ljava/util/List;Ljava/util/List;)Ljava/lang/Iterable;: I26 Branch 3 IFLE L24 - false
   * 8 org.jbehave.core.io.RelativePathCalculator.join(Ljava/lang/Iterable;)Ljava/lang/String;: I29 Branch 4 IFNE L33 - false
   */
  @Test
  public void test5()  throws Throwable  {
      RelativePathCalculator relativePathCalculator0 = new RelativePathCalculator();
      String string0 = relativePathCalculator0.calculate("N#\"ErnG7u6o*t", "N#\"ErnG7u6o*t");
      String string1 = "4";
      String string2 = relativePathCalculator0.calculate("4", "4");
      String string3 = relativePathCalculator0.calculate("4", "4");
      String string4 = "";
      // Undeclared exception!
      try {
        relativePathCalculator0.calculate("", "");
      }catch(IndexOutOfBoundsException e) {
        /*
         * Index: 0, Size: 0
         */
        /*
      %%%<ex><className val="IndexOutOfBoundsException"/><stackDepth val="17"/><causeDepth val="0"/><source val="java.util.LinkedList.entry(LinkedList.java:382)"/></ex>%%%
         */
      }
  }
}

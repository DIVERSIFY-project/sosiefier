/*
 * This file was automatically generated by EvoSuite
 */

package org.jbehave.core.steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;
import javax.swing.text.Segment;
import org.jbehave.core.model.StepPattern;
import org.jbehave.core.steps.PrintStreamStepMonitor;
import org.jbehave.core.steps.StepType;


public class PrintStreamStepMonitorEvoSuiteTest {


  //Test case number: 1
  /*
   * 8 covered goals:
   * 1 org.jbehave.core.steps.PrintStreamStepMonitor.print(Ljava/io/PrintStream;Ljava/lang/String;)V: root-Branch
   * 2 org.jbehave.core.steps.PrintStreamStepMonitor.<init>()V: root-Branch
   * 3 org.jbehave.core.steps.PrintStreamStepMonitor.<init>(Ljava/io/PrintStream;)V: root-Branch
   * 4 org.jbehave.core.steps.PrintStreamStepMonitor.usingTableAnnotatedNameForParameter(Ljava/lang/String;I)V: root-Branch
   * 5 org.jbehave.core.steps.PrintStreamStepMonitor.usingTableParameterNameForParameter(Ljava/lang/String;I)V: root-Branch
   * 6 org.jbehave.core.steps.PrintStreamStepMonitor.stepMatchesType(Ljava/lang/String;Ljava/lang/String;ZLorg/jbehave/core/steps/StepType;Ljava/lang/reflect/Method;Ljava/lang/Object;)V: I16 Branch 1 IFEQ L48 - true
   * 7 org.jbehave.core.steps.PrintStreamStepMonitor.performing(Ljava/lang/String;Z)V: I15 Branch 3 IFEQ L62 - true
   * 8 org.jbehave.core.steps.PrintStreamStepMonitor.stepMatchesType(Ljava/lang/String;Ljava/lang/String;ZLorg/jbehave/core/steps/StepType;Ljava/lang/reflect/Method;Ljava/lang/Object;)V: I16 Branch 1 IFEQ L48 - false
   */
  @Test
  public void test1()  throws Throwable  {
      PrintStreamStepMonitor printStreamStepMonitor0 = new PrintStreamStepMonitor();
      printStreamStepMonitor0.performing("", false);
      printStreamStepMonitor0.usingTableParameterNameForParameter("", 0);
      printStreamStepMonitor0.usingTableAnnotatedNameForParameter("", 0);
      printStreamStepMonitor0.usingTableAnnotatedNameForParameter("", 0);
      StepType stepType0 = StepType.WHEN;
      URI uRI0 = new URI("");
      String string0 = uRI0.getRawUserInfo();
      // Undeclared exception!
      try {
        printStreamStepMonitor0.stepMatchesType("", "", true, stepType0, (Method) null, (Object) null);
      }catch(NullPointerException e) {
        /*
         * no message in exception (getMessage() returned null)
         */
        /*
      %%%<ex><className val="NullPointerException"/><stackDepth val="14"/><causeDepth val="0"/><source val="org.jbehave.core.steps.PrintStreamStepMonitor.stepMatchesType(PrintStreamStepMonitor.java:48)"/></ex>%%%
         */
      }
  }

  //Test case number: 2
  /*
   * 7 covered goals:
   * 1 org.jbehave.core.steps.PrintStreamStepMonitor.print(Ljava/io/PrintStream;Ljava/lang/String;)V: root-Branch
   * 2 org.jbehave.core.steps.PrintStreamStepMonitor.<init>()V: root-Branch
   * 3 org.jbehave.core.steps.PrintStreamStepMonitor.<init>(Ljava/io/PrintStream;)V: root-Branch
   * 4 org.jbehave.core.steps.PrintStreamStepMonitor.usingTableAnnotatedNameForParameter(Ljava/lang/String;I)V: root-Branch
   * 5 org.jbehave.core.steps.PrintStreamStepMonitor.usingTableParameterNameForParameter(Ljava/lang/String;I)V: root-Branch
   * 6 org.jbehave.core.steps.PrintStreamStepMonitor.stepMatchesType(Ljava/lang/String;Ljava/lang/String;ZLorg/jbehave/core/steps/StepType;Ljava/lang/reflect/Method;Ljava/lang/Object;)V: I16 Branch 1 IFEQ L48 - true
   * 7 org.jbehave.core.steps.PrintStreamStepMonitor.performing(Ljava/lang/String;Z)V: I15 Branch 3 IFEQ L62 - true
   */
  @Test
  public void test2()  throws Throwable  {
      PrintStreamStepMonitor printStreamStepMonitor0 = new PrintStreamStepMonitor();
      printStreamStepMonitor0.performing("", false);
      printStreamStepMonitor0.usingTableParameterNameForParameter("", 0);
      printStreamStepMonitor0.usingTableAnnotatedNameForParameter("", 0);
      printStreamStepMonitor0.usingTableAnnotatedNameForParameter("", 0);
      StepType stepType0 = StepType.WHEN;
      URI uRI0 = new URI("");
      String string0 = uRI0.getRawUserInfo();
      // Undeclared exception!
      try {
        printStreamStepMonitor0.stepMatchesType("", "", false, stepType0, (Method) null, (Object) null);
      }catch(NullPointerException e) {
        /*
         * no message in exception (getMessage() returned null)
         */
        /*
      %%%<ex><className val="NullPointerException"/><stackDepth val="14"/><causeDepth val="0"/><source val="org.jbehave.core.steps.PrintStreamStepMonitor.stepMatchesType(PrintStreamStepMonitor.java:48)"/></ex>%%%
         */
      }
  }

  //Test case number: 4
  /*
   * 5 covered goals:
   * 1 org.jbehave.core.steps.PrintStreamStepMonitor.print(Ljava/io/PrintStream;Ljava/lang/String;)V: root-Branch
   * 2 org.jbehave.core.steps.PrintStreamStepMonitor.usingParameterNameForParameter(Ljava/lang/String;I)V: root-Branch
   * 3 org.jbehave.core.steps.PrintStreamStepMonitor.<init>()V: root-Branch
   * 4 org.jbehave.core.steps.PrintStreamStepMonitor.<init>(Ljava/io/PrintStream;)V: root-Branch
   * 5 org.jbehave.core.steps.PrintStreamStepMonitor.stepMatchesPattern(Ljava/lang/String;ZLorg/jbehave/core/model/StepPattern;Ljava/lang/reflect/Method;Ljava/lang/Object;)V: I12 Branch 2 IFEQ L53 - true
   */
  @Test
  public void test4()  throws Throwable  {
      PrintStreamStepMonitor printStreamStepMonitor0 = new PrintStreamStepMonitor();
      String string0 = null;
      int int0 = 1482;
      printStreamStepMonitor0.usingParameterNameForParameter((String) null, 1482);
      boolean boolean0 = false;
      StepType stepType0 = StepType.GIVEN;
      StepPattern stepPattern0 = new StepPattern(stepType0, (String) null, (String) null);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(1482);
      String string1 = byteArrayOutputStream0.toString();
      // Undeclared exception!
      try {
        printStreamStepMonitor0.stepMatchesPattern((String) null, false, stepPattern0, (Method) null, (Object) "");
      }catch(NullPointerException e) {
        /*
         * no message in exception (getMessage() returned null)
         */
        /*
      %%%<ex><className val="NullPointerException"/><stackDepth val="14"/><causeDepth val="0"/><source val="org.jbehave.core.steps.PrintStreamStepMonitor.stepMatchesPattern(PrintStreamStepMonitor.java:53)"/></ex>%%%
         */
      }
  }

  //Test case number: 5
  /*
   * 4 covered goals:
   * 1 org.jbehave.core.steps.PrintStreamStepMonitor.<init>()V: root-Branch
   * 2 org.jbehave.core.steps.PrintStreamStepMonitor.<init>(Ljava/io/PrintStream;)V: root-Branch
   * 3 org.jbehave.core.steps.PrintStreamStepMonitor.stepMatchesPattern(Ljava/lang/String;ZLorg/jbehave/core/model/StepPattern;Ljava/lang/reflect/Method;Ljava/lang/Object;)V: I12 Branch 2 IFEQ L53 - true
   * 4 org.jbehave.core.steps.PrintStreamStepMonitor.stepMatchesPattern(Ljava/lang/String;ZLorg/jbehave/core/model/StepPattern;Ljava/lang/reflect/Method;Ljava/lang/Object;)V: I12 Branch 2 IFEQ L53 - false
   */
  @Test
  public void test5()  throws Throwable  {
      PrintStreamStepMonitor printStreamStepMonitor0 = new PrintStreamStepMonitor();
      StepType stepType0 = StepType.THEN;
      StepPattern stepPattern0 = new StepPattern(stepType0, (String) null, (String) null);
      Segment segment0 = new Segment();
      String string0 = segment0.toString();
      // Undeclared exception!
      try {
        printStreamStepMonitor0.stepMatchesPattern((String) null, true, stepPattern0, (Method) null, (Object) "");
      }catch(NullPointerException e) {
        /*
         * no message in exception (getMessage() returned null)
         */
        /*
      %%%<ex><className val="NullPointerException"/><stackDepth val="14"/><causeDepth val="0"/><source val="org.jbehave.core.steps.PrintStreamStepMonitor.stepMatchesPattern(PrintStreamStepMonitor.java:53)"/></ex>%%%
         */
      }
  }
}

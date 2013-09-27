/*
 * This file was automatically generated by EvoSuite
 */

package org.jbehave.core.reporters;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.Keywords;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.configuration.ParanamerConfiguration;
import org.jbehave.core.configuration.PropertyBasedConfiguration;
import org.jbehave.core.configuration.UnmodifiableConfiguration;
import org.jbehave.core.failures.KnownFailure;
import org.jbehave.core.model.ExamplesTable;
import org.jbehave.core.model.ExamplesTableFactory;
import org.jbehave.core.model.Meta;
import org.jbehave.core.model.OutcomesTable;
import org.jbehave.core.model.Story;
import org.jbehave.core.reporters.ANSIConsoleOutput;
import org.jbehave.core.reporters.HtmlOutput;
import org.jbehave.core.reporters.IdeOnlyConsoleOutput;
import org.jbehave.core.reporters.TxtOutput;
import org.jbehave.core.reporters.XmlOutput;
import org.jbehave.core.steps.ParameterConverters;
import org.jbehave.core.steps.StepMonitor;
import org.jbehave.core.steps.StepType;


public class PrintStreamOutputEvoSuiteTest {


  //Test case number: 0
  /*
   * 18 covered goals:
   * 1 org.jbehave.core.reporters.PrintStreamOutput.restarted(Ljava/lang/String;Ljava/lang/Throwable;)V: root-Branch
   * 2 org.jbehave.core.reporters.PrintStreamOutput.notPerformed(Ljava/lang/String;)V: root-Branch
   * 3 org.jbehave.core.reporters.PrintStreamOutput$1.<init>(Lorg/jbehave/core/reporters/PrintStreamOutput;Lorg/jbehave/core/reporters/PrintStreamOutput$Format;)V: root-Branch
   * 4 org.jbehave.core.reporters.PrintStreamOutput.doCompressFailureTrace(Z)Lorg/jbehave/core/reporters/PrintStreamOutput;: root-Branch
   * 5 org.jbehave.core.reporters.PrintStreamOutput.doReportFailureTrace(Z)Lorg/jbehave/core/reporters/PrintStreamOutput;: root-Branch
   * 6 org.jbehave.core.reporters.PrintStreamOutput.format(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;: root-Branch
   * 7 org.jbehave.core.reporters.PrintStreamOutput.escape(Lorg/jbehave/core/reporters/PrintStreamOutput$Format;[Ljava/lang/Object;)[Ljava/lang/Object;: root-Branch
   * 8 org.jbehave.core.reporters.PrintStreamOutput.escapeAll([Ljava/lang/Object;)[Ljava/lang/Object;: root-Branch
   * 9 org.jbehave.core.reporters.PrintStreamOutput.escape(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   * 10 org.jbehave.core.reporters.PrintStreamOutput.<init>(Lorg/jbehave/core/reporters/PrintStreamOutput$Format;Ljava/io/PrintStream;Ljava/util/Properties;Lorg/jbehave/core/configuration/Keywords;ZZ)V: root-Branch
   * 11 org.jbehave.core.reporters.PrintStreamOutput$1.transform(Ljava/lang/Object;)Ljava/lang/Object;: I7 Branch 3 TABLESWITCH L299 Default-Case - true
   * 12 org.jbehave.core.reporters.PrintStreamOutput.lookupPattern(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I6 Branch 27 IFEQ L332 - true
   * 13 org.jbehave.core.reporters.PrintStreamOutput.containsTable(Ljava/lang/String;)Z: I23 Branch 29 IFEQ L380 - true
   * 14 org.jbehave.core.reporters.PrintStreamOutput.print(Ljava/lang/String;)V: I5 Branch 28 IFEQ L367 - true
   * 15 org.jbehave.core.reporters.PrintStreamOutput$1.transform(Ljava/lang/Object;)Ljava/lang/Object;: I7 Branch 1 TABLESWITCH L299 Case 2 - false
   * 16 org.jbehave.core.reporters.PrintStreamOutput$1.transform(Ljava/lang/Object;)Ljava/lang/Object;: I7 Branch 2 TABLESWITCH L299 Case 3 - false
   * 17 org.jbehave.core.reporters.PrintStreamOutput.lookupPattern(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I6 Branch 27 IFEQ L332 - false
   * 18 org.jbehave.core.reporters.PrintStreamOutput.compressFailureTrace()Z: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      Keywords keywords0 = null;
      Properties properties0 = new Properties();
      ANSIConsoleOutput aNSIConsoleOutput0 = new ANSIConsoleOutput(properties0, (Keywords) null, true);
      boolean boolean0 = aNSIConsoleOutput0.compressFailureTrace();
      boolean boolean1 = false;
      ANSIConsoleOutput aNSIConsoleOutput1 = new ANSIConsoleOutput(properties0, (Keywords) null, false);
      String string0 = "AP$uy]";
      KnownFailure knownFailure0 = new KnownFailure();
      aNSIConsoleOutput1.restarted("AP$uy]", (Throwable) knownFailure0);
      // Undeclared exception!
      try {
        aNSIConsoleOutput1.notPerformed("AP$uy]");
      }catch(NullPointerException e) {
        /*
         * no message in exception (getMessage() returned null)
         */
        /*
      %%%<ex><className val="NullPointerException"/><stackDepth val="15"/><causeDepth val="0"/><source val="org.jbehave.core.reporters.PrintStreamOutput.notPerformed(PrintStreamOutput.java:93)"/></ex>%%%
         */
      }
  }

  //Test case number: 1  @Test
  public void test1()  throws Throwable  {
      Properties properties0 = new Properties();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      FilterOutputStream filterOutputStream0 = new FilterOutputStream((OutputStream) pipedOutputStream0);
      boolean boolean0 = true;
      String string0 = null;
      PrintStream printStream0 = null;
      try {
        printStream0 = new PrintStream((OutputStream) pipedOutputStream0, true, (String) null);
      }catch(NullPointerException e) {
        /*
         * charsetName
         */
        /*
      %%%<ex><className val="NullPointerException"/><stackDepth val="16"/><causeDepth val="0"/><source val="java.io.OutputStreamWriter.&lt;init&gt;(OutputStreamWriter.java:99)"/></ex>%%%
         */
      }
  }

  //Test case number: 2  @Test
  public void test2()  throws Throwable  {
      Keywords keywords0 = new Keywords();
      String string0 = "(86E%so*/]";
      File file0 = new File("(86E%so*/]", "(86E%so*/]");
      File file1 = file0.getAbsoluteFile();
      PrintStream printStream0 = null;
      try {
        printStream0 = new PrintStream(file1);
      }catch(SecurityException e) {
        /*
         * Security manager blocks (java.io.FilePermission /home/martin/workspace/jbehave-core-spooned/(86E%so*_/]/(86E%so*_/] write)
         * java.lang.Thread.getStackTrace(Thread.java:1495)
         * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
         * java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
         * java.io.FileOutputStream.<init>(FileOutputStream.java:198)
         * java.io.FileOutputStream.<init>(FileOutputStream.java:160)
         * java.io.PrintStream.<init>(PrintStream.java:245)
         * sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
         * sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:57)
         * sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
         * java.lang.reflect.Constructor.newInstance(Constructor.java:532)
         * org.evosuite.testcase.ConstructorStatement$1.execute(ConstructorStatement.java:226)
         * org.evosuite.testcase.AbstractStatement.exceptionHandler(AbstractStatement.java:142)
         * org.evosuite.testcase.ConstructorStatement.execute(ConstructorStatement.java:188)
         * org.evosuite.testcase.TestRunnable.call(TestRunnable.java:291)
         * org.evosuite.testcase.TestRunnable.call(TestRunnable.java:1)
         * java.util.concurrent.FutureTask$Sync.innerRun(FutureTask.java:334)
         * java.util.concurrent.FutureTask.run(FutureTask.java:166)
         * java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1146)
         * java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:615)
         * java.lang.Thread.run(Thread.java:679)
         */
        /*
      %%%<ex><className val="SecurityException"/><stackDepth val="19"/><causeDepth val="0"/><source val="org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:307)"/></ex>%%%
         */
      }
  }

  //Test case number: 3  @Test
  public void test3()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      PrintStream printStream0 = new PrintStream((OutputStream) byteArrayOutputStream0);
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) printStream0;
      objectArray0[1] = (Object) printStream0;
      objectArray0[3] = (Object) printStream0;
      objectArray0[4] = (Object) "";
      objectArray0[5] = (Object) printStream0;
      objectArray0[6] = (Object) "";
      objectArray0[7] = (Object) printStream0;
      PrintStream printStream1 = printStream0.printf("", objectArray0);
      ExamplesTable examplesTable0 = null;
      try {
        examplesTable0 = new ExamplesTable("", "", "");
      }catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class org.jbehave.core.model.ExamplesTable
         */
        /*
      %%%<ex><className val="NoClassDefFoundError"/><stackDepth val="14"/><causeDepth val="0"/><source val="sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)"/></ex>%%%
         */
      }
  }
}

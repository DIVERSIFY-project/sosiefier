/*
 * This file was automatically generated by EvoSuite
 */

package org.jbehave.core.reporters;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.Keywords;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.configuration.ParanamerConfiguration;
import org.jbehave.core.configuration.PropertyBasedConfiguration;
import org.jbehave.core.configuration.UnmodifiableConfiguration;
import org.jbehave.core.i18n.LocalizedKeywords;
import org.jbehave.core.model.ExamplesTable;
import org.jbehave.core.model.GivenStories;
import org.jbehave.core.model.Meta;
import org.jbehave.core.model.OutcomesTable;
import org.jbehave.core.model.Scenario;
import org.jbehave.core.model.Story;
import org.jbehave.core.model.StoryDuration;
import org.jbehave.core.model.TableTransformers;
import org.jbehave.core.reporters.IdeOnlyConsoleOutput;
import org.jbehave.core.reporters.PrintStreamOutput;
import org.jbehave.core.reporters.XmlOutput;
import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.CompositeStepsFactory;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.jbehave.core.steps.ParameterConverters;
import org.jbehave.core.steps.Parameters;
import org.jbehave.core.steps.ProvidedStepsFactory;
import org.jbehave.core.steps.StepType;


public class XmlOutputEvoSuiteTest {


  //Test case number: 0  @Test
  public void test0()  throws Throwable  {
      String string0 = "uxc'rb|h*J`OB|Gpc>x";
      PrintStream printStream0 = null;
      try {
        printStream0 = new PrintStream("uxc'rb|h*J`OB|Gpc>x");
      }catch(SecurityException e) {
        /*
         * Security manager blocks (java.io.FilePermission uxc'rb|h*J`OB|Gpc>x write)
         * java.lang.Thread.getStackTrace(Thread.java:1495)
         * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
         * java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
         * java.io.FileOutputStream.<init>(FileOutputStream.java:198)
         * java.io.FileOutputStream.<init>(FileOutputStream.java:99)
         * java.io.PrintStream.<init>(PrintStream.java:173)
         * sun.reflect.GeneratedConstructorAccessor5.newInstance(Unknown Source)
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
      %%%<ex><className val="SecurityException"/><stackDepth val="18"/><causeDepth val="0"/><source val="org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:307)"/></ex>%%%
         */
      }
  }

  //Test case number: 1  @Test
  public void test1()  throws Throwable  {
      PrintStream printStream0 = IdeOnlyConsoleOutput.output();
      XmlOutput xmlOutput0 = null;
      try {
        xmlOutput0 = new XmlOutput(printStream0);
      }catch(LocalizedKeywords.ResourceBundleNotFound e) {
        /*
         * Resource bundle i18n/keywords not found for locale en in classLoader org.evosuite.instrumentation.InstrumentingClassLoader@e6f711
         */
        /*
      %%%<ex><className val="ResourceBundleNotFound"/><stackDepth val="23"/><causeDepth val="1"/><source val="java.util.ResourceBundle.throwMissingResourceException(ResourceBundle.java:1539)"/></ex>%%%
         */
      }
  }

  //Test case number: 2  @Test
  public void test2()  throws Throwable  {
      PrintStream printStream0 = IdeOnlyConsoleOutput.output();
      char[] charArray0 = new char[3];
      charArray0[0] = '8';
      charArray0[1] = ';';
      charArray0[2] = '8';
      printStream0.println(charArray0);
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "Shift_JIS";
      PrintStream printStream1 = printStream0.format("Shift_JIS", objectArray0);
      objectArray0[0] = (Object) '3';
      Properties properties0 = new Properties();
      PropertyBasedConfiguration propertyBasedConfiguration0 = null;
      try {
        propertyBasedConfiguration0 = new PropertyBasedConfiguration();
      }catch(LocalizedKeywords.ResourceBundleNotFound e) {
        /*
         * Resource bundle i18n/keywords not found for locale en in classLoader org.evosuite.instrumentation.InstrumentingClassLoader@e6f711
         */
        /*
      %%%<ex><className val="ResourceBundleNotFound"/><stackDepth val="24"/><causeDepth val="1"/><source val="java.util.ResourceBundle.throwMissingResourceException(ResourceBundle.java:1539)"/></ex>%%%
         */
      }
  }

  //Test case number: 3  @Test
  public void test3()  throws Throwable  {
      String string0 = "";
      File file0 = new File("", "");
      File file1 = file0.getCanonicalFile();
      File file2 = file1.getAbsoluteFile();
      PrintStream printStream0 = null;
      try {
        printStream0 = new PrintStream(file2);
      }catch(SecurityException e) {
        /*
         * Security manager blocks (java.io.FilePermission / write)
         * java.lang.Thread.getStackTrace(Thread.java:1495)
         * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
         * java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
         * java.io.FileOutputStream.<init>(FileOutputStream.java:198)
         * java.io.FileOutputStream.<init>(FileOutputStream.java:160)
         * java.io.PrintStream.<init>(PrintStream.java:245)
         * sun.reflect.GeneratedConstructorAccessor17.newInstance(Unknown Source)
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
      %%%<ex><className val="SecurityException"/><stackDepth val="18"/><causeDepth val="0"/><source val="org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:307)"/></ex>%%%
         */
      }
  }

  //Test case number: 4  @Test
  public void test4()  throws Throwable  {
      PrintStream printStream0 = IdeOnlyConsoleOutput.output();
      String string0 = "u>9WXvV1%KDv]\".8";
      Properties properties0 = new Properties();
      XmlOutput xmlOutput0 = null;
      try {
        xmlOutput0 = new XmlOutput(printStream0, properties0);
      }catch(LocalizedKeywords.ResourceBundleNotFound e) {
        /*
         * Resource bundle i18n/keywords not found for locale en in classLoader org.evosuite.instrumentation.InstrumentingClassLoader@e6f711
         */
        /*
      %%%<ex><className val="ResourceBundleNotFound"/><stackDepth val="23"/><causeDepth val="1"/><source val="java.util.ResourceBundle.throwMissingResourceException(ResourceBundle.java:1539)"/></ex>%%%
         */
      }
  }

  //Test case number: 5  @Test
  public void test5()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream((OutputStream) pipedOutputStream0);
      boolean boolean0 = false;
      String string0 = "n)ta";
      PrintStream printStream0 = null;
      try {
        printStream0 = new PrintStream((OutputStream) filterOutputStream0, false, "n)ta");
      }catch(UnsupportedEncodingException e) {
        /*
         * n)ta
         */
        /*
      %%%<ex><className val="UnsupportedEncodingException"/><stackDepth val="17"/><causeDepth val="0"/><source val="sun.nio.cs.StreamEncoder.forOutputStreamWriter(StreamEncoder.java:60)"/></ex>%%%
         */
      }
  }

  //Test case number: 6  @Test
  public void test6()  throws Throwable  {
      String string0 = "4>)oFzm:U\"";
      PrintStream printStream0 = IdeOnlyConsoleOutput.output();
      Properties properties0 = new Properties();
      ParanamerConfiguration paranamerConfiguration0 = null;
      try {
        paranamerConfiguration0 = new ParanamerConfiguration();
      }catch(LocalizedKeywords.ResourceBundleNotFound e) {
        /*
         * Resource bundle i18n/keywords not found for locale en in classLoader org.evosuite.instrumentation.InstrumentingClassLoader@e6f711
         */
        /*
      %%%<ex><className val="ResourceBundleNotFound"/><stackDepth val="24"/><causeDepth val="1"/><source val="java.util.ResourceBundle.throwMissingResourceException(ResourceBundle.java:1539)"/></ex>%%%
         */
      }
  }

  //Test case number: 7  @Test
  public void test7()  throws Throwable  {
      String string0 = "";
      URI uRI0 = new URI("");
      File file0 = null;
      try {
        file0 = new File(uRI0);
      }catch(IllegalArgumentException e) {
        /*
         * URI is not absolute
         */
        /*
      %%%<ex><className val="IllegalArgumentException"/><stackDepth val="15"/><causeDepth val="0"/><source val="java.io.File.&lt;init&gt;(File.java:378)"/></ex>%%%
         */
      }
  }

  //Test case number: 8  @Test
  public void test8()  throws Throwable  {
      String string0 = "";
      PrintStream printStream0 = null;
      try {
        printStream0 = new PrintStream("");
      }catch(SecurityException e) {
        /*
         * Security manager blocks (java.io.FilePermission  write)
         * java.lang.Thread.getStackTrace(Thread.java:1495)
         * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
         * java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
         * java.io.FileOutputStream.<init>(FileOutputStream.java:198)
         * java.io.FileOutputStream.<init>(FileOutputStream.java:99)
         * java.io.PrintStream.<init>(PrintStream.java:173)
         * sun.reflect.GeneratedConstructorAccessor5.newInstance(Unknown Source)
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
      %%%<ex><className val="SecurityException"/><stackDepth val="18"/><causeDepth val="0"/><source val="org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:307)"/></ex>%%%
         */
      }
  }

  //Test case number: 9
  /*
   * 6 covered goals:
   * 1 org.jbehave.core.reporters.XmlOutput.<init>(Ljava/io/PrintStream;Ljava/util/Properties;Lorg/jbehave/core/configuration/Keywords;ZZ)V: root-Branch
   * 2 org.jbehave.core.reporters.XmlOutput.<init>(Ljava/io/PrintStream;Lorg/jbehave/core/configuration/Keywords;)V: root-Branch
   * 3 org.jbehave.core.reporters.XmlOutput.mergeWithDefault(Ljava/util/Properties;)Ljava/util/Properties;: root-Branch
   * 4 org.jbehave.core.reporters.XmlOutput.defaultHtmlPatterns()Ljava/util/Properties;: root-Branch
   * 5 org.jbehave.core.reporters.XmlOutput.<init>(Ljava/io/PrintStream;Ljava/util/Properties;Lorg/jbehave/core/configuration/Keywords;)V: root-Branch
   * 6 org.jbehave.core.reporters.XmlOutput.<init>(Ljava/io/PrintStream;Ljava/util/Properties;Lorg/jbehave/core/configuration/Keywords;Z)V: root-Branch
   */
  @Test
  public void test9()  throws Throwable  {
      PrintStream printStream0 = IdeOnlyConsoleOutput.output();
      Keywords keywords0 = new Keywords();
      XmlOutput xmlOutput0 = new XmlOutput(printStream0, keywords0);
      xmlOutput0.beforeScenario("");
      PrintStream printStream1 = null;
      Keywords keywords1 = new Keywords();
      XmlOutput xmlOutput1 = new XmlOutput((PrintStream) null, keywords1);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      // Undeclared exception!
      try {
        xmlOutput1.givenStories((GivenStories) null);
      }catch(NullPointerException e) {
        /*
         * no message in exception (getMessage() returned null)
         */
        /*
      %%%<ex><className val="NullPointerException"/><stackDepth val="16"/><causeDepth val="0"/><source val="org.jbehave.core.reporters.PrintStreamOutput.print(PrintStreamOutput.java:373)"/></ex>%%%
         */
      }
  }

  //Test case number: 10  @Test
  public void test10()  throws Throwable  {
      String string0 = null;
      PrintStream printStream0 = null;
      try {
        printStream0 = new PrintStream((String) null, (String) null);
      }catch(NullPointerException e) {
        /*
         * name can't be null
         */
        /*
      %%%<ex><className val="NullPointerException"/><stackDepth val="19"/><causeDepth val="0"/><source val="java.io.FilePermission.init(FilePermission.java:188)"/></ex>%%%
         */
      }
  }
}

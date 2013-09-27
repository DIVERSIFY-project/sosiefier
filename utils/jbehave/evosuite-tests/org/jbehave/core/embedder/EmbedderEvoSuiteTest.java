/*
 * This file was automatically generated by EvoSuite
 */

package org.jbehave.core.embedder;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.embedder.EmbedderControls;
import org.jbehave.core.embedder.StoryMapper;
import org.jbehave.core.embedder.StoryRunner;
import org.jbehave.core.failures.BatchFailures;
import org.jbehave.core.i18n.LocalizedKeywords;
import org.jbehave.core.junit.AnnotatedEmbedderRunner;
import org.jbehave.core.model.ExamplesTable;
import org.jbehave.core.model.StoryMaps;
import org.jbehave.core.reporters.ReportsCount;


public class EmbedderEvoSuiteTest {


  //Test case number: 0
  /*
   * 5 covered goals:
   * 1 org.jbehave.core.embedder.Embedder$ViewGenerationFailed.<init>(Ljava/io/File;Lorg/jbehave/core/model/StoryMaps;Ljava/util/Properties;Ljava/lang/RuntimeException;)V: root-Branch
   * 2 org.jbehave.core.embedder.Embedder$RunningEmbeddablesFailed.<init>(Ljava/lang/String;Ljava/lang/Throwable;)V: root-Branch
   * 3 org.jbehave.core.embedder.Embedder$RunningEmbeddablesFailed.<init>(Lorg/jbehave/core/failures/BatchFailures;)V: root-Branch
   * 4 org.jbehave.core.embedder.Embedder$ThrowingRunningStoriesFailed.<init>()V: root-Branch
   * 5 org.jbehave.core.embedder.Embedder.<init>(Lorg/jbehave/core/embedder/StoryMapper;Lorg/jbehave/core/embedder/StoryRunner;Lorg/jbehave/core/embedder/EmbedderMonitor;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      StoryMapper storyMapper0 = new StoryMapper();
      StoryMaps storyMaps0 = storyMapper0.getStoryMaps();
      Properties properties0 = new Properties();
      String string0 = storyMapper0.toString();
      BatchFailures batchFailures0 = new BatchFailures();
      Embedder.RunningEmbeddablesFailed embedder_RunningEmbeddablesFailed0 = new Embedder.RunningEmbeddablesFailed(batchFailures0);
      Throwable throwable0 = embedder_RunningEmbeddablesFailed0.getCause();
      Embedder.RunningEmbeddablesFailed embedder_RunningEmbeddablesFailed1 = new Embedder.RunningEmbeddablesFailed("", (Throwable) null);
      Embedder.ViewGenerationFailed embedder_ViewGenerationFailed0 = new Embedder.ViewGenerationFailed((File) null, storyMaps0, properties0, (RuntimeException) embedder_RunningEmbeddablesFailed1);
      Embedder embedder0 = null;
      try {
        embedder0 = new Embedder();
      }catch(LocalizedKeywords.ResourceBundleNotFound e) {
        /*
         * Resource bundle i18n/keywords not found for locale en in classLoader org.evosuite.instrumentation.InstrumentingClassLoader@1bdb02e
         */
        /*
      %%%<ex><className val="ResourceBundleNotFound"/><stackDepth val="25"/><causeDepth val="1"/><source val="java.util.ResourceBundle.throwMissingResourceException(ResourceBundle.java:1539)"/></ex>%%%
         */
      }
  }

  //Test case number: 1
  /*
   * 4 covered goals:
   * 1 org.jbehave.core.embedder.Embedder$ThrowingRunningStoriesFailed.<init>()V: root-Branch
   * 2 org.jbehave.core.embedder.Embedder$RunningStoriesFailed.<init>(Lorg/jbehave/core/failures/BatchFailures;)V: root-Branch
   * 3 org.jbehave.core.embedder.Embedder$ThrowingRunningStoriesFailed.handleFailures(Lorg/jbehave/core/reporters/ReportsCount;)V: root-Branch
   * 4 org.jbehave.core.embedder.Embedder$RunningStoriesFailed.<init>(Lorg/jbehave/core/reporters/ReportsCount;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      Embedder.ThrowingRunningStoriesFailed embedder_ThrowingRunningStoriesFailed0 = new Embedder.ThrowingRunningStoriesFailed();
      ReportsCount reportsCount0 = new ReportsCount(3, 3, 3, (-77), (-77), 1562, 1562, 1562);
      // Undeclared exception!
      try {
        embedder_ThrowingRunningStoriesFailed0.handleFailures(reportsCount0);
      }catch(Embedder.RunningStoriesFailed e) {
        /*
         * Failures in running stories: ReportsCount[stories=3,storiesNotAllowed=3,storiesPending=3,scenarios=-77,scenariosFailed=-77,scenariosNotAllowed=1562,scenariosPending=1562,stepsFailed=1562]
         */
        /*
      %%%<ex><className val="RunningStoriesFailed"/><stackDepth val="14"/><causeDepth val="0"/><source val="org.jbehave.core.embedder.Embedder$ThrowingRunningStoriesFailed.handleFailures(Embedder.java:447)"/></ex>%%%
         */
      }
  }

  //Test case number: 2
  /*
   * 3 covered goals:
   * 1 org.jbehave.core.embedder.Embedder$ThrowingRunningStoriesFailed.<init>()V: root-Branch
   * 2 org.jbehave.core.embedder.Embedder$RunningStoriesFailed.<init>(Lorg/jbehave/core/failures/BatchFailures;)V: root-Branch
   * 3 org.jbehave.core.embedder.Embedder$ThrowingRunningStoriesFailed.handleFailures(Lorg/jbehave/core/failures/BatchFailures;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      Embedder.ThrowingRunningStoriesFailed embedder_ThrowingRunningStoriesFailed0 = new Embedder.ThrowingRunningStoriesFailed();
      BatchFailures batchFailures0 = new BatchFailures(false);
      // Undeclared exception!
      try {
        embedder_ThrowingRunningStoriesFailed0.handleFailures(batchFailures0);
      }catch(Embedder.RunningStoriesFailed e) {
        /*
         * Failures in running stories: 
         */
        /*
      %%%<ex><className val="RunningStoriesFailed"/><stackDepth val="14"/><causeDepth val="0"/><source val="org.jbehave.core.embedder.Embedder$ThrowingRunningStoriesFailed.handleFailures(Embedder.java:443)"/></ex>%%%
         */
      }
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 org.jbehave.core.embedder.Embedder$RunningStoriesFailed.<init>(Lorg/jbehave/core/reporters/ReportsCount;)V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      int int0 = 1463;
      int int1 = 59;
      ReportsCount reportsCount0 = new ReportsCount(1463, 1463, 59, 1463, 59, 1463, 1463, 1463);
      Embedder.RunningStoriesFailed embedder_RunningStoriesFailed0 = new Embedder.RunningStoriesFailed(reportsCount0);
      Embedder.AnnotatedEmbedderRunFailed embedder_AnnotatedEmbedderRunFailed0 = null;
      try {
        embedder_AnnotatedEmbedderRunFailed0 = new Embedder.AnnotatedEmbedderRunFailed((AnnotatedEmbedderRunner) null, (Throwable) embedder_RunningStoriesFailed0);
      }catch(NullPointerException e) {
        /*
         * no message in exception (getMessage() returned null)
         */
        /*
      %%%<ex><className val="NullPointerException"/><stackDepth val="14"/><causeDepth val="0"/><source val="org.jbehave.core.embedder.Embedder$AnnotatedEmbedderRunFailed.&lt;init&gt;(Embedder.java:455)"/></ex>%%%
         */
      }
  }
}

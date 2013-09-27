/*
 * This file was automatically generated by EvoSuite
 */

package org.jbehave.core.io;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.net.NetworkInterface;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryResourceNotFound;


public class LoadFromClasspathEvoSuiteTest {


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 org.jbehave.core.io.LoadFromClasspath.loadResourceAsText(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   * 2 org.jbehave.core.io.LoadFromClasspath.<init>(Ljava/lang/ClassLoader;)V: root-Branch
   * 3 org.jbehave.core.io.LoadFromClasspath.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      LoadFromClasspath loadFromClasspath0 = new LoadFromClasspath();
      // Undeclared exception!
      try {
        loadFromClasspath0.loadResourceAsText((String) null);
      }catch(NullPointerException e) {
        /*
         * name
         */
        /*
      %%%<ex><className val="NullPointerException"/><stackDepth val="26"/><causeDepth val="0"/><source val="java.util.zip.ZipFile.getEntry(ZipFile.java:161)"/></ex>%%%
         */
      }
  }

  //Test case number: 1
  /*
   * 7 covered goals:
   * 1 org.jbehave.core.io.LoadFromClasspath.<init>(Ljava/lang/Class;)V: root-Branch
   * 2 org.jbehave.core.io.LoadFromClasspath.loadStoryAsText(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   * 3 org.jbehave.core.io.LoadFromClasspath.loadResourceAsText(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   * 4 org.jbehave.core.io.LoadFromClasspath.<init>(Ljava/lang/ClassLoader;)V: root-Branch
   * 5 org.jbehave.core.io.LoadFromClasspath.<init>()V: root-Branch
   * 6 org.jbehave.core.io.LoadFromClasspath.toString()Ljava/lang/String;: root-Branch
   * 7 org.jbehave.core.io.LoadFromClasspath.resourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;: I10 Branch 1 IFNONNULL L37 - false
   */
  @Test
  public void test1()  throws Throwable  {
      Class<?> class0 = NetworkInterface.class;
      LoadFromClasspath loadFromClasspath0 = new LoadFromClasspath(class0);
      Class<?> class1 = LoadFromClasspath.class;
      LoadFromClasspath loadFromClasspath1 = new LoadFromClasspath();
      String string0 = loadFromClasspath1.toString();
      LoadFromClasspath loadFromClasspath2 = new LoadFromClasspath(class1);
      String string1 = loadFromClasspath1.toString();
      String string2 = loadFromClasspath2.toString();
      // Undeclared exception!
      try {
        loadFromClasspath2.loadStoryAsText("ci\"dRk*LRt`=pqR");
      }catch(StoryResourceNotFound e) {
        /*
         * Story path 'ci\"dRk*LRt`=pqR' not found by class loader org.evosuite.instrumentation.InstrumentingClassLoader@4a1bda
         */
        /*
      %%%<ex><className val="StoryResourceNotFound"/><stackDepth val="16"/><causeDepth val="0"/><source val="org.jbehave.core.io.LoadFromClasspath.resourceAsStream(LoadFromClasspath.java:38)"/></ex>%%%
         */
      }
  }
}

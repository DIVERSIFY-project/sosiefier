/*
 * This file was automatically generated by EvoSuite
 */

package org.jbehave.core.io;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PushbackInputStream;
import java.io.UnsupportedEncodingException;
import org.jbehave.core.io.InvalidStoryResource;


public class InvalidStoryResourceEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 org.jbehave.core.io.InvalidStoryResource.<init>(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/Throwable;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      String string0 = "XZ\"v8gX}p[b^*1<u~5";
      InvalidStoryResource invalidStoryResource0 = new InvalidStoryResource("XZ\"v8gX}p[b^*1<u~5", (InputStream) null, (Throwable) null);
      FileInputStream fileInputStream0 = null;
      try {
        fileInputStream0 = new FileInputStream("XZ\"v8gX}p[b^*1<u~5");
      }catch(FileNotFoundException e) {
        /*
         * XZ\"v8gX}p[b^*1<u~5 (No such file or directory)
         */
        /*
      %%%<ex><className val="FileNotFoundException"/><stackDepth val="16"/><causeDepth val="0"/><source val="java.io.FileInputStream.open(Native Method)"/></ex>%%%
         */
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 org.jbehave.core.io.InvalidStoryResource.<init>(Ljava/lang/String;Ljava/lang/Throwable;)V: root-Branch
   * 2 org.jbehave.core.io.InvalidStoryResource.<init>(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/Throwable;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      String string0 = "";
      InvalidStoryResource invalidStoryResource0 = new InvalidStoryResource("", (Throwable) null);
      InvalidStoryResource invalidStoryResource1 = new InvalidStoryResource("", (InputStream) null, (Throwable) invalidStoryResource0);
      // Undeclared exception!
      try {
        File.createTempFile("", "");
      }catch(IllegalArgumentException e) {
        /*
         * Prefix string too short
         */
        /*
      %%%<ex><className val="IllegalArgumentException"/><stackDepth val="15"/><causeDepth val="0"/><source val="java.io.File.createTempFile0(File.java:1728)"/></ex>%%%
         */
      }
  }
}

/*
 * This file was automatically generated by EvoSuite
 */

package org.jbehave.core.parsers;

import java.util.HashMap;
import java.util.Map;

import org.jbehave.core.configuration.Keywords;
import org.jbehave.core.i18n.LocalizedKeywords;
import org.jbehave.core.model.ExamplesTableFactory;
import org.jbehave.core.model.TableTransformers;
import org.junit.Test;


public class RegexStoryParserEvoSuiteTest {


  //Test case number: 0  @Test
  public void test0()  throws Throwable  {
      Keywords keywords0 = new Keywords();
      String string0 = keywords0.toString();
      RegexStoryParser regexStoryParser0 = null;
      try {
        regexStoryParser0 = new RegexStoryParser(keywords0);
      }catch(LocalizedKeywords.ResourceBundleNotFound e) {
        /*
         * Resource bundle i18n/keywords not found for locale en in classLoader org.evosuite.instrumentation.InstrumentingClassLoader@1db3e20
         */
        /*
      %%%<ex><className val="ResourceBundleNotFound"/><stackDepth val="23"/><causeDepth val="1"/><source val="java.util.ResourceBundle.throwMissingResourceException(ResourceBundle.java:1539)"/></ex>%%%
         */
      }
  }

  //Test case number: 1  @Test
  public void test1()  throws Throwable  {
      RegexStoryParser regexStoryParser0 = null;
      try {
        regexStoryParser0 = new RegexStoryParser();
      }catch(LocalizedKeywords.ResourceBundleNotFound e) {
        /*
         * Resource bundle i18n/keywords not found for locale en in classLoader org.evosuite.instrumentation.InstrumentingClassLoader@1db3e20
         */
        /*
      %%%<ex><className val="ResourceBundleNotFound"/><stackDepth val="22"/><causeDepth val="1"/><source val="java.util.ResourceBundle.throwMissingResourceException(ResourceBundle.java:1539)"/></ex>%%%
         */
      }
  }

  //Test case number: 2
  /*
   * 16 covered goals:
   * 1 org.jbehave.core.parsers.RegexStoryParser.patternToPullDescriptionIntoGroupOne()Ljava/util/regex/Pattern;: root-Branch
   * 2 org.jbehave.core.parsers.RegexStoryParser.patternToPullStoryMetaIntoGroupOne()Ljava/util/regex/Pattern;: root-Branch
   * 3 org.jbehave.core.parsers.RegexStoryParser.concatenateWithOr([Ljava/lang/String;)Ljava/lang/String;: root-Branch
   * 4 org.jbehave.core.parsers.RegexStoryParser.<init>(Lorg/jbehave/core/configuration/Keywords;Lorg/jbehave/core/model/ExamplesTableFactory;)V: root-Branch
   * 5 org.jbehave.core.parsers.RegexStoryParser.patternToPullNarrativeIntoGroupOne()Ljava/util/regex/Pattern;: root-Branch
   * 6 org.jbehave.core.parsers.RegexStoryParser.patternToPullStoryGivenStoriesIntoGroupOne()Ljava/util/regex/Pattern;: root-Branch
   * 7 org.jbehave.core.parsers.RegexStoryParser.parseDescriptionFrom(Ljava/lang/String;)Lorg/jbehave/core/model/Description;: I11 Branch 2 IFLE L51 - true
   * 8 org.jbehave.core.parsers.RegexStoryParser.parseStoryMetaFrom(Ljava/lang/String;)Lorg/jbehave/core/model/Meta;: I13 Branch 3 IFLE L59 - true
   * 9 org.jbehave.core.parsers.RegexStoryParser.concatenateWithOr(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;: I19 Branch 21 IFNULL L232 - true
   * 10 org.jbehave.core.parsers.RegexStoryParser.parseNarrativeFrom(Ljava/lang/String;)Lorg/jbehave/core/model/Narrative;: I11 Branch 5 IFLE L73 - true
   * 11 org.jbehave.core.parsers.RegexStoryParser.concatenateWithOr(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;: I9 Branch 20 IFNULL L231 - true
   * 12 org.jbehave.core.parsers.RegexStoryParser.parseGivenStories(Ljava/lang/String;)Lorg/jbehave/core/model/GivenStories;: I15 Branch 7 IFEQ L95 - true
   * 13 org.jbehave.core.parsers.RegexStoryParser.concatenateWithOr(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;: I59 Branch 22 IF_ICMPLT L233 - true
   * 14 org.jbehave.core.parsers.RegexStoryParser.parseGivenStories(Ljava/lang/String;)Lorg/jbehave/core/model/GivenStories;: I33 Branch 8 IFEQ L99 - true
   * 15 org.jbehave.core.parsers.RegexStoryParser.preScenarioText(Ljava/lang/String;)Ljava/lang/String;: I12 Branch 4 IFLE L68 - false
   * 16 org.jbehave.core.parsers.RegexStoryParser.concatenateWithOr(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;: I59 Branch 22 IF_ICMPLT L233 - false
   */
  @Test
  public void test2()  throws Throwable  {
      Keywords keywords0 = new Keywords();
      RegexStoryParser regexStoryParser0 = new RegexStoryParser(keywords0, (ExamplesTableFactory) null);
      // Undeclared exception!
      try {
        regexStoryParser0.parseStory("`}%wxM@|=bJDg.EKMpF", "`}%wxM@|=bJDg.EKMpF");
      }catch(Throwable e) {
        /*
         * Could not initialize class org.jbehave.core.model.GivenStories
         */
        /*
      %%%<ex><className val="NoClassDefFoundError"/><stackDepth val="15"/><causeDepth val="0"/><source val="org.jbehave.core.parsers.RegexStoryParser.parseGivenStories(RegexStoryParser.java:100)"/></ex>%%%
         */
      }
  }

  //Test case number: 3  @Test
  public void test3()  throws Throwable  {
      Map<String, String> map0 = Keywords.defaultKeywords();
      TableTransformers tableTransformers0 = new TableTransformers();
      ExamplesTableFactory examplesTableFactory0 = null;
      try {
        examplesTableFactory0 = new ExamplesTableFactory(tableTransformers0);
      }catch(LocalizedKeywords.ResourceBundleNotFound e) {
        /*
         * Resource bundle i18n/keywords not found for locale en in classLoader org.evosuite.instrumentation.InstrumentingClassLoader@1db3e20
         */
        /*
      %%%<ex><className val="ResourceBundleNotFound"/><stackDepth val="22"/><causeDepth val="1"/><source val="java.util.ResourceBundle.throwMissingResourceException(ResourceBundle.java:1539)"/></ex>%%%
         */
      }
  }

  //Test case number: 4
  /*
   * 17 covered goals:
   * 1 org.jbehave.core.parsers.RegexStoryParser.patternToPullDescriptionIntoGroupOne()Ljava/util/regex/Pattern;: root-Branch
   * 2 org.jbehave.core.parsers.RegexStoryParser.patternToPullStoryMetaIntoGroupOne()Ljava/util/regex/Pattern;: root-Branch
   * 3 org.jbehave.core.parsers.RegexStoryParser.concatenateWithOr([Ljava/lang/String;)Ljava/lang/String;: root-Branch
   * 4 org.jbehave.core.parsers.RegexStoryParser.<init>(Lorg/jbehave/core/configuration/Keywords;Lorg/jbehave/core/model/ExamplesTableFactory;)V: root-Branch
   * 5 org.jbehave.core.parsers.RegexStoryParser.patternToPullNarrativeIntoGroupOne()Ljava/util/regex/Pattern;: root-Branch
   * 6 org.jbehave.core.parsers.RegexStoryParser.patternToPullStoryGivenStoriesIntoGroupOne()Ljava/util/regex/Pattern;: root-Branch
   * 7 org.jbehave.core.parsers.RegexStoryParser.parseDescriptionFrom(Ljava/lang/String;)Lorg/jbehave/core/model/Description;: I11 Branch 2 IFLE L51 - true
   * 8 org.jbehave.core.parsers.RegexStoryParser.parseStoryMetaFrom(Ljava/lang/String;)Lorg/jbehave/core/model/Meta;: I13 Branch 3 IFLE L59 - true
   * 9 org.jbehave.core.parsers.RegexStoryParser.concatenateWithOr(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;: I19 Branch 21 IFNULL L232 - true
   * 10 org.jbehave.core.parsers.RegexStoryParser.parseNarrativeFrom(Ljava/lang/String;)Lorg/jbehave/core/model/Narrative;: I11 Branch 5 IFLE L73 - true
   * 11 org.jbehave.core.parsers.RegexStoryParser.concatenateWithOr(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;: I9 Branch 20 IFNULL L231 - true
   * 12 org.jbehave.core.parsers.RegexStoryParser.parseGivenStories(Ljava/lang/String;)Lorg/jbehave/core/model/GivenStories;: I15 Branch 7 IFEQ L95 - true
   * 13 org.jbehave.core.parsers.RegexStoryParser.concatenateWithOr(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;: I59 Branch 22 IF_ICMPLT L233 - true
   * 14 org.jbehave.core.parsers.RegexStoryParser.parseGivenStories(Ljava/lang/String;)Lorg/jbehave/core/model/GivenStories;: I33 Branch 8 IFEQ L99 - true
   * 15 org.jbehave.core.parsers.RegexStoryParser.preScenarioText(Ljava/lang/String;)Ljava/lang/String;: I12 Branch 4 IFLE L68 - false
   * 16 org.jbehave.core.parsers.RegexStoryParser.concatenateWithOr(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;: I59 Branch 22 IF_ICMPLT L233 - false
   * 17 org.jbehave.core.parsers.RegexStoryParser.parseStory(Ljava/lang/String;)Lorg/jbehave/core/model/Story;: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      Keywords keywords0 = new Keywords();
      String string0 = keywords0.notPerformed();
      RegexStoryParser regexStoryParser0 = new RegexStoryParser(keywords0, (ExamplesTableFactory) null);
      // Undeclared exception!
      try {
        regexStoryParser0.parseStory("I$!oN! H,\"Y>8");
      }catch(Throwable e) {
        /*
         * Could not initialize class org.jbehave.core.model.GivenStories
         */
        /*
      %%%<ex><className val="NoClassDefFoundError"/><stackDepth val="16"/><causeDepth val="0"/><source val="org.jbehave.core.parsers.RegexStoryParser.parseGivenStories(RegexStoryParser.java:100)"/></ex>%%%
         */
      }
  }

  //Test case number: 5  @Test
  public void test5()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Keywords keywords0 = null;
      try {
        keywords0 = new Keywords(hashMap0);
      }catch(Keywords.KeywordNotFound e) {
        /*
         * Keyword Meta not found amongst {}
         */
        /*
      %%%<ex><className val="KeywordNotFound"/><stackDepth val="15"/><causeDepth val="0"/><source val="org.jbehave.core.configuration.Keywords.keyword(Keywords.java:225)"/></ex>%%%
         */
      }
  }

  //Test case number: 6  @Test
  public void test6()  throws Throwable  {
      RegexStoryParser regexStoryParser0 = null;
      try {
        regexStoryParser0 = new RegexStoryParser((ExamplesTableFactory) null);
      }catch(LocalizedKeywords.ResourceBundleNotFound e) {
        /*
         * Resource bundle i18n/keywords not found for locale en in classLoader org.evosuite.instrumentation.InstrumentingClassLoader@1db3e20
         */
        /*
      %%%<ex><className val="ResourceBundleNotFound"/><stackDepth val="22"/><causeDepth val="1"/><source val="java.util.ResourceBundle.throwMissingResourceException(ResourceBundle.java:1539)"/></ex>%%%
         */
      }
  }
}

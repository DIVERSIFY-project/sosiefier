/*
 * This file was automatically generated by EvoSuite
 */

package org.jbehave.core.steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import org.jbehave.core.annotations.AsParameterConverter;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.Keywords;
import org.jbehave.core.configuration.ParanamerConfiguration;
import org.jbehave.core.configuration.PropertyBasedConfiguration;
import org.jbehave.core.i18n.LocalizedKeywords;
import org.jbehave.core.io.LoadFromRelativeFile;
import org.jbehave.core.model.ExamplesTable;
import org.jbehave.core.model.Meta;
import org.jbehave.core.model.OutcomesTable;
import org.jbehave.core.model.Scenario;
import org.jbehave.core.steps.AbstractStepsFactory;
import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.CompositeStepsFactory;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.jbehave.core.steps.ProvidedStepsFactory;
import org.jbehave.core.steps.StepCollector;


public class CompositeStepsFactoryEvoSuiteTest {


  //Test case number: 0
  /*
   * 4 covered goals:
   * 1 org.jbehave.core.steps.CompositeStepsFactory.<init>([Lorg/jbehave/core/steps/InjectableStepsFactory;)V: root-Branch
   * 2 org.jbehave.core.steps.CompositeStepsFactory.createInstanceOfType(Ljava/lang/Class;)Ljava/lang/Object;: I37 Branch 2 IF_ICMPLT L25 - true
   * 3 org.jbehave.core.steps.CompositeStepsFactory.createInstanceOfType(Ljava/lang/Class;)Ljava/lang/Object;: I37 Branch 2 IF_ICMPLT L25 - false
   * 4 org.jbehave.core.steps.CompositeStepsFactory.createInstanceOfType(Ljava/lang/Class;)Ljava/lang/Object;: I41 Branch 3 IFNONNULL L31 - false
   */
  @Test
  public void test0()  throws Throwable  {
      InjectableStepsFactory[] injectableStepsFactoryArray0 = new InjectableStepsFactory[2];
      CompositeStepsFactory compositeStepsFactory0 = new CompositeStepsFactory(injectableStepsFactoryArray0);
      Class<?> class0 = CompositeStepsFactory.class;
      // Undeclared exception!
      try {
        compositeStepsFactory0.createInstanceOfType(class0);
      }catch(AbstractStepsFactory.StepsInstanceNotFound e) {
        /*
         * Steps instance not found for type class org.jbehave.core.steps.CompositeStepsFactory in factory org.jbehave.core.steps.CompositeStepsFactory@11a621e
         */
        /*
      %%%<ex><className val="StepsInstanceNotFound"/><stackDepth val="14"/><causeDepth val="0"/><source val="org.jbehave.core.steps.CompositeStepsFactory.createInstanceOfType(CompositeStepsFactory.java:32)"/></ex>%%%
         */
      }
  }

  //Test case number: 1  @Test
  public void test1()  throws Throwable  {
      InjectableStepsFactory[] injectableStepsFactoryArray0 = new InjectableStepsFactory[3];
      OutcomesTable outcomesTable0 = null;
      try {
        outcomesTable0 = new OutcomesTable();
      }catch(LocalizedKeywords.ResourceBundleNotFound e) {
        /*
         * Resource bundle i18n/keywords not found for locale en in classLoader org.evosuite.instrumentation.InstrumentingClassLoader@9c67db
         */
        /*
      %%%<ex><className val="ResourceBundleNotFound"/><stackDepth val="22"/><causeDepth val="1"/><source val="java.util.ResourceBundle.throwMissingResourceException(ResourceBundle.java:1539)"/></ex>%%%
         */
      }
  }

  //Test case number: 2
  /*
   * 4 covered goals:
   * 1 org.jbehave.core.steps.CompositeStepsFactory.<init>([Lorg/jbehave/core/steps/InjectableStepsFactory;)V: root-Branch
   * 2 org.jbehave.core.steps.CompositeStepsFactory.createInstanceOfType(Ljava/lang/Class;)Ljava/lang/Object;: I37 Branch 2 IF_ICMPLT L25 - true
   * 3 org.jbehave.core.steps.CompositeStepsFactory.createInstanceOfType(Ljava/lang/Class;)Ljava/lang/Object;: I37 Branch 2 IF_ICMPLT L25 - false
   * 4 org.jbehave.core.steps.CompositeStepsFactory.createInstanceOfType(Ljava/lang/Class;)Ljava/lang/Object;: I41 Branch 3 IFNONNULL L31 - false
   */
  @Test
  public void test2()  throws Throwable  {
      InjectableStepsFactory[] injectableStepsFactoryArray0 = new InjectableStepsFactory[2];
      Configuration configuration0 = null;
      CompositeStepsFactory compositeStepsFactory0 = new CompositeStepsFactory(injectableStepsFactoryArray0);
      Class<?> class0 = Locale.class;
      // Undeclared exception!
      try {
        compositeStepsFactory0.createInstanceOfType(class0);
      }catch(AbstractStepsFactory.StepsInstanceNotFound e) {
        /*
         * Steps instance not found for type class java.util.Locale in factory org.jbehave.core.steps.CompositeStepsFactory@1964294
         */
        /*
      %%%<ex><className val="StepsInstanceNotFound"/><stackDepth val="14"/><causeDepth val="0"/><source val="org.jbehave.core.steps.CompositeStepsFactory.createInstanceOfType(CompositeStepsFactory.java:32)"/></ex>%%%
         */
      }
  }
}

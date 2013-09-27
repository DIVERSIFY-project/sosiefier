/*
 * This file was automatically generated by EvoSuite
 */

package org.jbehave.core.steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.Keywords;
import org.jbehave.core.configuration.ParanamerConfiguration;
import org.jbehave.core.configuration.PropertyBasedConfiguration;
import org.jbehave.core.i18n.LocalizedKeywords;
import org.jbehave.core.reporters.ConsoleOutput;
import org.jbehave.core.reporters.StoryReporter;
import org.jbehave.core.steps.AbstractStepsFactory;
import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.jbehave.core.steps.ProvidedStepsFactory;
import org.jbehave.core.steps.Steps;


public class ProvidedStepsFactoryEvoSuiteTest {


  //Test case number: 1
  /*
   * 5 covered goals:
   * 1 org.jbehave.core.steps.ProvidedStepsFactory.<init>(Ljava/util/List;)V: root-Branch
   * 2 org.jbehave.core.steps.ProvidedStepsFactory.createInstanceOfType(Ljava/lang/Class;)Ljava/lang/Object;: I23 Branch 1 IFEQ L23 - true
   * 3 org.jbehave.core.steps.ProvidedStepsFactory.createInstanceOfType(Ljava/lang/Class;)Ljava/lang/Object;: I39 Branch 2 IFNE L21 - true
   * 4 org.jbehave.core.steps.ProvidedStepsFactory.createInstanceOfType(Ljava/lang/Class;)Ljava/lang/Object;: I39 Branch 2 IFNE L21 - false
   * 5 org.jbehave.core.steps.ProvidedStepsFactory.createInstanceOfType(Ljava/lang/Class;)Ljava/lang/Object;: I43 Branch 3 IFNONNULL L29 - false
   */
  @Test
  public void test1()  throws Throwable  {
      LinkedList<CandidateSteps> linkedList0 = new LinkedList<CandidateSteps>();
      CandidateSteps candidateSteps0 = linkedList0.peekFirst();
      String string0 = Keywords.META_PROPERTY;
      Steps steps0 = new Steps();
      ParanamerConfiguration paranamerConfiguration0 = new ParanamerConfiguration();
      PropertyBasedConfiguration propertyBasedConfiguration0 = new PropertyBasedConfiguration();
      LocalizedKeywords localizedKeywords0 = (LocalizedKeywords)propertyBasedConfiguration0.keywords();
      boolean boolean0 = linkedList0.add((CandidateSteps) steps0);
      boolean boolean1 = linkedList0.offer((CandidateSteps) steps0);
      ProvidedStepsFactory providedStepsFactory0 = new ProvidedStepsFactory((List<CandidateSteps>) linkedList0);
      Class<?> class0 = ProvidedStepsFactory.class;
      // Undeclared exception!
      try {
        providedStepsFactory0.createInstanceOfType(class0);
      }catch(AbstractStepsFactory.StepsInstanceNotFound e) {
        /*
         * Steps instance not found for type class org.jbehave.core.steps.ProvidedStepsFactory in factory org.jbehave.core.steps.ProvidedStepsFactory@96dceb
         */
        /*
      %%%<ex><className val="StepsInstanceNotFound"/><stackDepth val="14"/><causeDepth val="0"/><source val="org.jbehave.core.steps.ProvidedStepsFactory.createInstanceOfType(ProvidedStepsFactory.java:30)"/></ex>%%%
         */
      }
  }
}

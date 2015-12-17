package fr.inria.diversify.dspot;

import fr.inria.diversify.dspot.processor.AbstractAmp;
import fr.inria.diversify.factories.DiversityCompiler;
import fr.inria.diversify.runner.InputProgram;
import spoon.reflect.declaration.CtMethod;

import java.util.*;

/**
 * User: Simon
 * Date: 03/12/15
 * Time: 13:52
 */
public class SAAmplification  extends  Amplification {
    int maxTrial = 400;
    int maxSizeNewTest = 200;
    public SAAmplification(InputProgram inputProgram, DiversityCompiler compiler, Set<String> classLoaderFilter, List<AbstractAmp> amplifiers) {
      super(inputProgram, compiler, classLoaderFilter, amplifiers);
    }


    protected List<CtMethod> ampTest(Collection<CtMethod> tests) {
        Random r = new Random();
        List<CtMethod> listTests = new ArrayList<>(tests);
        List<CtMethod> newTests = new ArrayList<>(maxSizeNewTest);

        int trial = 0;
        while (newTests.size() < maxSizeNewTest && trial < maxSizeNewTest ) {
            trial++;
            CtMethod test = listTests.get(r.nextInt(listTests.size()));
            AbstractAmp amplifier = amplifiers.get(r.nextInt(amplifiers.size()));

            CtMethod newTest = amplifier.applyRandom(test);
            if(newTest != null) {
                newTests.add(newTest);
            }
        }
        return newTests;
    }
}

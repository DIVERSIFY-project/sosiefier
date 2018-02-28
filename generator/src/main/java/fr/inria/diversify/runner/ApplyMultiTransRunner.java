package fr.inria.diversify.runner;

import fr.inria.diversify.statistic.SinglePointSessionResults;
import fr.inria.diversify.transformation.AddMethodInvocation;
import fr.inria.diversify.transformation.MultiSwapSubType;
import fr.inria.diversify.transformation.SwapSubType;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.util.Log;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtParameter;

import java.util.*;

/**
 * Created by nharrand on 09/10/17.
 */
public class ApplyMultiTransRunner extends SinglePointRunner {
    public ApplyMultiTransRunner(InputConfiguration inputConfiguration, String projectDir, String srcDir) {
        super(inputConfiguration, projectDir, srcDir);
    }


    @Override
    public void run(int n) throws Exception {
        int i = new Random().nextInt(n-1);
        Set<SwapSubType> transformations = new HashSet<>();
        while (transQuery.hasNextTransformation() && i >= 0) {
            transformations.add((SwapSubType) transQuery.query());
        }
        Transformation trans = new MultiSwapSubType(transformations);
        try {
            applyTransformation(trans);
            int status;
            status = runTest(tmpDir);
        } catch (Exception e) {
            trans.setStatus(-2);
            tryRestore(trans, e);
        }
    }

    protected void applyTransformation(Transformation trans) throws Exception {
        if(withParent) {
            if(acceptedErrors) {
                builder.setAcceptedErrors(trans.getParent().getFailures());
            }
            trans.applyWithParent(tmpDir + "/" + sourceDir);
        } else {
            trans.apply(tmpDir + "/" + sourceDir);
        }
    }
}

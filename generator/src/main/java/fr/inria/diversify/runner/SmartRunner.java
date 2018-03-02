package fr.inria.diversify.runner;

import fr.inria.diversify.statistic.SinglePointSessionResults;
import fr.inria.diversify.transformation.AddMethodInvocation;
import fr.inria.diversify.transformation.SingleTransformation;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.util.Log;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtParameter;

import java.util.List;
import java.util.Properties;

public class SmartRunner extends SinglePointRunner {
    public SmartRunner(InputConfiguration inputConfiguration, String projectDir, String srcDir) {
        super(inputConfiguration, projectDir, srcDir);

    }

    private void initTraces() {
        String tracesDir = inputConfiguration.getProperty("traces");
        if(tracesDir != null) {

        }
    }

    private String buildAgentLine(String test) {
        if(inputConfiguration.getProperty("traces") == null) return null;
        if(inputConfiguration.getProperty("traceAgent") == null) return null;
        if(inputConfiguration.getProperty("tracePackage") == null) return null;
        return"-javaagent:" +
                inputConfiguration.getProperty("traceAgent") +
                "=\"strict-includes|includes=" +
                inputConfiguration.getProperty("tracePackage") +
                "|excludes=fr.inria.yalta|follow=" +
                inputConfiguration.getProperty("traces") +
                "/" + test +
                "\"";
    }

    @Override
    protected void run(Transformation trans) throws Exception {
        Log.info("trial {}", trial);
        Log.debug("output dir: " + tmpDir + "/" + sourceDir);
//        writePosition(tmpDir + "/transplant.json", (ASTTransformation) trans);

        try {
            applyTransformation(trans);

            try {
                int status;
                if(trans instanceof SingleTransformation) {
                    SingleTransformation a = (SingleTransformation) trans;
                    Properties p = new Properties();
                    if(testImpact != null) {
                        p.setProperty("test", getTests(a.methodLocationName()));
                        p.setProperty("argLine", buildAgentLine(getTests(a.methodLocationName())));
                    }
                    status = runTest(tmpDir, p);
                } else {
                    status = runTest(tmpDir);
                }


//                if(status == 0) {
//                    writeAllInfo((SingleTransformation) trans, trial);
//                }

                trans.setStatus(status);
                trans.setFailures(builder.getFailedTests());
                // error during runTest
            } catch (Exception e) {
                trans.setStatus(-2);
                Log.debug("compile error during diversification", e);
            }

            trial++;
            trans.restore(tmpDir + "/" + sourceDir);

            ((SinglePointSessionResults) sessionResults).addRunResults(trans);
        } catch (Exception e) {
            trans.setStatus(-2);
            tryRestore(trans, e);
        }
        transformations.add(trans);

    }
}

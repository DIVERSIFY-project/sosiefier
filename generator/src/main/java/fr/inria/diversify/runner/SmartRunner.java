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
        System.out.println("traces: " + inputConfiguration.getProperty("traces"));
        System.out.println("traceAgent: " + inputConfiguration.getProperty("traceAgent"));
        System.out.println("tracePackage: " + inputConfiguration.getProperty("tracePackage"));
        if(inputConfiguration.getProperty("traces") == null) return null;
        if(inputConfiguration.getProperty("traceAgent") == null) return null;
        if(inputConfiguration.getProperty("tracePackage") == null) return null;


        return"-javaagent:" +
                inputConfiguration.getProperty("traceAgent") +
                "=strict-includes|includes=" +
                inputConfiguration.getProperty("tracePackage") +
                "|excludes=fr.inria.yalta|mfollow=" +
                inputConfiguration.getProperty("traces") +
                "/" + test +
                "";
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
                        String rawTests = getTests(a.methodLocationName());
                        String tests[] = rawTests.split(",");
                        //p.setProperty("test", );
                        status = -2;
                        boolean divergent = false;
                        for(int i = 0; i < tests.length; i++) {
                            p.setProperty("test", tests[i]);
                            p.setProperty("argLine", buildAgentLine(tests[i]));
                            System.out.println("-DargLine=\"" + buildAgentLine(tests[i]) + "\"");
                            status = runTest(tmpDir, p);
                            System.out.println("[STATUS] -------> " + status);
                            if(status < 0) {
                                break;
                            } else if (status >= 1) {
                                divergent = true;
                            }
                        }
                        if(divergent && status >= 0) status = 1;
                    } else {
                        status = runTest(tmpDir, p);
                    }
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

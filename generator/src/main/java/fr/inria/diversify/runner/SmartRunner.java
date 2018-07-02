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
        String exclude = "";
        if(inputConfiguration.getProperty("traceExclude") != null) {
            exclude = "," + inputConfiguration.getProperty("traceExclude");
        }

        return"-javaagent:" +
                inputConfiguration.getProperty("traceAgent") +
                "=strict-includes|includes=" +
                inputConfiguration.getProperty("tracePackage") +
                "|excludes=fr.inria.yalta" +
                exclude +
                "|mfollow=" +
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
                    String method = a.methodLocationName();

                    Properties p = new Properties();
                    if(testImpact != null && method != null) {
                        String rawTests = getTests(method);
                        Log.debug("Run the following tests: <" + rawTests + ">");
                        if(rawTests.equals("")) {
                            status = -4;
                            Log.debug("No test covering method " + method);
                        } else {
                            String tests[] = rawTests.split(",");
                            //p.setProperty("test", );
                            status = -2;
                            boolean divergent = false;
                            int i = 0;
                            for (; i < tests.length; i++) {
                                p.setProperty("test", tests[i]);
                                String argLine = buildAgentLine(tests[i]);
                                if (argLine != null) {
                                    System.out.println("-DargLine=\"" + argLine + "\"");
                                    p.setProperty("argLine", argLine);
                                } else {
                                    System.out.println("No agent to run");
                                }
                                p.setProperty("failIfNoTests", "false");
                                status = runTest(tmpDir, p);
                                System.out.println("[STATUS] -------> " + status);
                                if (status < 0) {
                                    break;
                                } else if (status >= 1) {
                                    divergent = true;
                                    break;
                                }
                            }
                            if (status >= 0) {
                                String remainingTests = "";
                                int first = i+1;//either all tests have been ran or previous loop has exited through break;
                                for (; i < tests.length; i++) {
                                    if (i != first) remainingTests += "," + tests[i];
                                    else remainingTests += tests[i];
                                }
                                Log.debug("Run the following remaining tests: <" + remainingTests + ">");
                                if (!remainingTests.equals("")) {

                                    Properties p2 = new Properties();
                                    p2.setProperty("test", remainingTests);
                                    p2.setProperty("failIfNoTests", "false");
                                    status = runTest(tmpDir, p2);
                                }
                            }
                            if (divergent && status >= 0) status = 1;
                        }
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

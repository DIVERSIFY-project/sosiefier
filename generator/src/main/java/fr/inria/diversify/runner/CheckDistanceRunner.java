package fr.inria.diversify.runner;

import fr.inria.diversify.statistic.SinglePointSessionResults;
import fr.inria.diversify.transformation.AddMethodInvocation;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.util.FileUtils;
import fr.inria.diversify.util.Log;
import org.apache.commons.codec.binary.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * Created by nharrand on 10/05/17.
 */
public class CheckDistanceRunner extends AbstractRunner {
    /**
     * Indicates if we also apply the parent transformation
     */
    protected boolean withParent = false;

    /**
     * Indicates if we set the accepted errors for the parent
     */
    protected boolean acceptedErrors = false;


    public CheckDistanceRunner(InputConfiguration inputConfiguration, String projectDir, String srcDir) {
        this.sourceDir = srcDir;
        this.projectDir = projectDir;
        transformations = new ArrayList<>();
        this.inputConfiguration = inputConfiguration;
        sessionResults = new SinglePointSessionResults();
    }

    @Override
    public void run(int n) throws Exception {
        if (n > 0) {
            transformations = new ArrayList<>(n);
            int count = 0;
            while (transQuery.hasNextTransformation() && count < n) {
                run(transQuery.query());
                count++;
            }
        } else {
            while (transQuery.hasNextTransformation()) {
                run(transQuery.query());
            }
        }
    }

    public void run(Collection<Transformation> trans) throws Exception {
        for (Transformation transformation : trans) {
            run(transformation);
        }
        Log.info("session result: {}", sessionResults);
    }

    protected void run(Transformation trans) throws Exception {
        Log.info("trial {}", trial);
        Log.debug("output dir: " + tmpDir + "/" + sourceDir);
        initMethodImpact();
//        writePosition(tmpDir + "/transplant.json", (ASTTransformation) trans);

        try {
            applyTransformation(trans);

            try {
                curTrans = trans;
                int status = runTest(tmpDir);

                /*AddMethodInvocation a = (AddMethodInvocation) trans;
                a.fillInvocationSignature();

                //trans.setStatus(status);
                trans.setFailures(builder.getFailedTests());*/
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
    Transformation curTrans;

    @Override
    protected Integer runTest(String directory) throws InterruptedException {
        int status;

        Log.debug("run test in directory: {}", directory);
        builder.setDirectory(directory);
        if(curTrans instanceof AddMethodInvocation) {
            AddMethodInvocation cur = (AddMethodInvocation) curTrans;
            String sig = cur.getParentMethod().getSignature();
            Set<String> tests = methodsTests.get(sig);

            String testList = "";
            for(String s : tests) testList += "," + s;
            testList = testList.substring(2);

            String goals[] = {
                    "-Dtest=" + testList +
                    " -DargLine=\\\"-javaagent:\"" +
                    "=\\\"" + inputConfiguration.getProperty("agentParams","") + "\\\"\""
            };
            // -Dtest=Base32Test
            // -DargLine=\"-javaagent:" + + "=\\\"excludes=fr.inria.yalta,org.apache.maven,java.lang.Shutdown,org.junit\\\"\" test > tracesBase32Test.json

            builder.runBuilder(goals);

        } else {
            builder.runBuilder();
        }


        Log.info("status: " + builder.getStatus() + ", compile error: " + builder.getCompileError() + ", run all test: " + builder.allTestRun() + ", nb error: " + builder.getFailedTests().size());
        status = builder.getStatus();

        return status;
    }

    protected void applyTransformation(Transformation trans) throws Exception {
        if (withParent) {
            if (acceptedErrors) {
                builder.setAcceptedErrors(trans.getParent().getFailures());
            }
            trans.applyWithParent(tmpDir + "/" + sourceDir);
        } else {
            trans.apply(tmpDir + "/" + sourceDir);
        }
        //System.out.println("Soesie src dir: "+getSosieDestinationPath());
        //((SingleTransformation) trans).printJavaFile(getSosieDestinationPath());
    }

    protected void writePosition(String fileName, ASTTransformation transformation) throws IOException {
        FileWriter out = new FileWriter(fileName);

        String className = transformation.classLocationName();
        int line = transformation.getTransplantationPoint().getCtCodeFragment().getPosition().getLine();

        out.write("{\"Position\": \"" + className + ":" + line + "\"}");

        out.close();
    }

    public void setWithParent(boolean withParent) {
        this.withParent = withParent;
    }

    public void setAcceptedErrors(boolean acceptedErrors) {
        this.acceptedErrors = acceptedErrors;
    }

    public Map<String, Set<String>> methodsTests = new HashMap<>();

    public void initMethodImpact() {
        File json = new File(sourceDir, "tie-report.json");
        if(!json.exists())
            System.err.println("The src project must contain a json named methodsImpact.json containing a map (method, set(test-case))");

        String rawMap = FileUtils.readFile(json);
        try {
            JSONObject m = new JSONObject(rawMap);
            JSONArray methods = m.getJSONArray("methodList");
            for(int i = 0; i < methods.length(); i++) {
                JSONObject method = methods.getJSONObject(i);
                Set<String> testSet = new HashSet<>();
                JSONArray tests = m.getJSONArray("called-in");
                for(int j = 0; j < methods.length(); j++) {
                    String testcase = methods.getString(i);
                    testSet.add(testcase);
                }
                methodsTests.put(method.getString("method"), testSet);

            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}

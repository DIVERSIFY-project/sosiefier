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
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtParameter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
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
    File tracerAgent;

    public CheckDistanceRunner(InputConfiguration inputConfiguration, String projectDir, String srcDir, File tracerAgent) {
        this.sourceDir = srcDir;
        this.projectDir = projectDir;
        transformations = new ArrayList<>();
        this.inputConfiguration = inputConfiguration;
        sessionResults = new SinglePointSessionResults();
        this.tracerAgent = tracerAgent;
    }

    @Override
    public void run(int n) throws Exception {
        if(n > 0) {
            transformations = new ArrayList<>(n);
            int count = 0;
            while(transQuery.hasNextTransformation() &&  count < n) {
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
        for(Transformation transformation: trans) {
            run(transformation);
        }
        Log.info("session result: {}", sessionResults);
    }

    protected void run(Transformation trans) throws Exception {
        Log.info("trial {}", trial);
        Log.debug("output dir: " + tmpDir + "/" + sourceDir);
//        writePosition(tmpDir + "/transplant.json", (ASTTransformation) trans);

        try {
            applyTransformation(trans);

            try {
                int status;
                if(trans instanceof AddMethodInvocation) {
                    AddMethodInvocation a = (AddMethodInvocation) trans;
                    CtMethod m = a.getTp().getParent(CtMethod.class);
                    String params = "(";
                    boolean isFirst = true;
                    List<CtParameter> ps = m.getParameters();
                    for(CtParameter p : ps) {
                        if(isFirst) isFirst = false;
                        else params +=", ";
                        params += p.getType().getQualifiedName();
                    }
                    params += ")";
                    String method = m.getDeclaringType().getQualifiedName() + "." +
                            m.getSimpleName() + params;
                    Properties p = new Properties();
                    if(testImpact != null) {
                        p.setProperty("test", getTests(method));
                    }
                    Method insert = a.getaInv().getExecutable().getActualMethod();
                    String insertName = insert.getName();
                    for(Parameter pa :insert.getParameters()) {
                        //TODO
                    }


                    status = runTest(tmpDir, p);

                    //Run test srcDir -> trace
                    //Run test outputDir -> follows
                    // check deviation
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

    protected void applyTransformation(Transformation trans) throws Exception {
        if(withParent) {
            if(acceptedErrors) {
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

        out.write("{\"Position\": \""+ className+ ":"+ line +"\"}");

        out.close();
    }

    public void setWithParent(boolean withParent) {
        this.withParent = withParent;
    }

    public void setAcceptedErrors(boolean acceptedErrors) {
        this.acceptedErrors = acceptedErrors;
    }


    //    protected void writeAllInfo(SingleTransformation trans, int trial) throws IOException {
//        File dir = new File(tmpDir + "/../../detail/"+ System.currentTimeMillis() + "/");
//        dir.mkdirs();
//
//        writePosition(dir.getAbsolutePath() + "/transplant.json", (ASTTransformation) trans);
//
//        FileWriter mavenOutput = new FileWriter(new File(dir.getAbsoluteFile() + "/maven"));
//        mavenOutput.write(builder.getOutput());
//        mavenOutput.close();
//
//        FileUtils.copyFile(trans.getPosition().getFile(),new File(dir.getAbsoluteFile() + "/java.java"));
//
//    }

    protected Integer runCompareTest(String directory, Properties properties, File toTrace) throws InterruptedException {
        String agent = "javaagent:" + tracerAgent.getAbsolutePath() + "=\""; // + path + "=\"" + param + "\""
        //includeFile=testTrace.json|output=testlog3.json
        File trace = new File(directory + "trace.json");

        Properties p = (Properties) properties.clone();
        p.setProperty("argLine",agent + "includeFile=" + toTrace.getAbsolutePath() + "|output=" + trace + "\"");

        runTest(projectDir,properties);
        properties.setProperty("argLine",agent + "includeFile=" + toTrace.getAbsolutePath() + "|follow=" + trace + "\"");
        int r = runTest(directory,properties);
        return r;
    }

    protected Integer runTest(String directory, Properties properties) throws InterruptedException {
        int status;

        Log.debug("run test in directory: {}", directory);
        builder.setDirectory(directory);
        builder.runBuilder(null,properties);
        Log.info("status: " + builder.getStatus() + ", compile error: " + builder.getCompileError() + ", run all test: " + builder.allTestRun() + ", nb error: " + builder.getFailedTests().size());
        status = builder.getStatus();

        return status;
    }
}
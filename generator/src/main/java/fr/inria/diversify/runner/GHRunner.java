package fr.inria.diversify.runner;


import fr.inria.diversify.buildSystem.maven.MavenBuilder;
import fr.inria.diversify.statistic.SinglePointSessionResults;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.transformation.ast.exception.ApplyTransformationException;
import fr.inria.diversify.transformation.ast.exception.BuildTransplantException;
import fr.inria.diversify.util.Log;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Simon on 20/08/14.
 */
public class GHRunner extends AbstractRunner {
    /**
     * Indicates if we also apply the parent transformation
     */
    protected boolean withParent = false;

    /**
     * Indicates if we set the accepted errors for the parent
     */
    protected boolean acceptedErrors = false;

    String scriptBefore;
    String scriptAfter ;
    String testProject;

    public GHRunner(InputConfiguration inputConfiguration, String projectDir, String srcDir, String scriptBefore, String scriptAfter, String testProject) {
        this.sourceDir = srcDir;
        this.projectDir = projectDir;
        transformations = new ArrayList<>();
        this.inputConfiguration = inputConfiguration;
        sessionResults = new SinglePointSessionResults();
        this.scriptBefore = scriptBefore;
        this.scriptAfter = scriptAfter;
        this.testProject = testProject;
    }

    @Override
    public void run(int n) throws Exception {
        if(n > 0) {
            for (int i = 0; i < n; i++) {
                run(transQuery.query());
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
                transformations.add(trans);
                int status = runTest(tmpDir);

                trans.setStatus(status);
                trans.setFailures(builder.getTestFail());
                if (status == 0) {
                   trans.setStatus(runOtherTest());

                }
                // error during runTest
            } catch (Exception e) {
                trans.setStatus(-2);
                Log.debug("compile error during diversification", e);
            }

            trial++;
            trans.restore(tmpDir + "/" + sourceDir);

            ((SinglePointSessionResults) sessionResults).addRunResults(trans);
        } catch (ApplyTransformationException e) {
            tryRestore(trans,e);
        } catch (BuildTransplantException e) {}
    }

    protected int runOtherTest() throws InterruptedException, IOException {
        Process p = Runtime.getRuntime().exec("sh " +  scriptBefore);
        p.waitFor();
//
//        inputConfiguration = new InputConfiguration(testProject);
//        InputProgram testInputProgram = InitUtils.initInputProgram(inputConfiguration);


        String[] phases = new String[]{"clean", "test"};

        MavenBuilder rb = new MavenBuilder(testProject);
        rb.setGoals(phases);
        rb.setTimeOut(1000);
        rb.runBuilder();
        Log.info("status: " + rb.getStatus() + ", compile error: " + rb.getCompileError() + ", run all test: " + rb.allTestRun() + ", nb error: " + builder.getTestFail().size());

        p = Runtime.getRuntime().exec("sh " +  scriptAfter);
        p.waitFor();
      return rb.getStatus();
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
}

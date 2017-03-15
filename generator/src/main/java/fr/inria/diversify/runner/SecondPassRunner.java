package fr.inria.diversify.runner;

import fr.inria.diversify.statistic.SinglePointSessionResults;
import fr.inria.diversify.transformation.AddMethodInvocation;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.util.Log;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by nharrand on 22/02/17.
 */
public class SecondPassRunner  extends AbstractRunner {
    /**
     * Indicates if we also apply the parent transformation
     */
    protected boolean withParent = false;

    /**
     * Indicates if we set the accepted errors for the parent
     */
    protected boolean acceptedErrors = false;


    public SecondPassRunner(InputConfiguration inputConfiguration, String projectDir, String srcDir) {
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
//        writePosition(tmpDir + "/transplant.json", (ASTTransformation) trans);

        try {
            applyTransformation(trans);

            try {
                //int status = runTest(tmpDir);

                AddMethodInvocation a = (AddMethodInvocation) trans;
                a.fillInvocationSignature();

                //trans.setStatus(status);
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

}
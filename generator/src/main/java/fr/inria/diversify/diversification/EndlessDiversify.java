package fr.inria.diversify.diversification;

import fr.inria.diversify.statistic.SinglePointSessionResults;
import fr.inria.diversify.transformation.SingleTransformation;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.transformation.ast.exception.ApplyTransformationException;
import fr.inria.diversify.transformation.ast.exception.BuildTransplantException;
import fr.inria.diversify.util.Log;
import org.json.JSONException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Simon on 02/10/14.
 */
public class EndlessDiversify extends AbstractDiversify {

    public EndlessDiversify(InputConfiguration inputConfiguration, String project, String src) {
        this.sourceDir = src;
        this.projectDir = project;
        transformations = new ArrayList<>();
        this.inputConfiguration = inputConfiguration;
        sessionResults = new SinglePointSessionResults();
    }

    protected void run(SingleTransformation trans) throws Exception {
        Log.info("trial {}", trial);
        Log.debug("output dir: " + tmpDir + "/" + sourceDir);
        try {
            applyTransformation(trans);
            try {
                transformations.add(trans);
                int status = runTest(tmpDir);

                trans.setStatus(status);
                trans.setFailures(builder.getTestFail());

            } catch (Exception e) {
                trans.setStatus(-2);
                Log.debug("compile error during diversification", e);
            }
            trial++;
            ((SinglePointSessionResults) sessionResults).addRunResults(trans);
            if (trans.getStatus() != 0) {
                trans.restore(tmpDir + "/" + sourceDir);
            } else {
                Log.info(sessionResults.toString());
                copySosieProgram();
                ((ASTTransformation) trans).updateStatementList();

                saveReport();
                writeTransformations(getSosieSourcesDir());
            }
        } catch (ApplyTransformationException e) {
            tryRestore(trans,e);
        } catch (BuildTransplantException e) {}
    }

    protected void saveReport() throws IOException {
        File dir = new File(getResultDir());
        if(!dir.exists()) {
            dir.mkdirs();
        }
        sessionResults.saveReport(getResultDir() + "/" + Thread.currentThread().getId() + "_session");
    }

    protected void writeTransformation(SingleTransformation trans) throws IOException, JSONException {
        File dir = new File(getSosieSourcesDir());
        if(!dir.exists())
            dir.mkdirs();

        FileWriter results = new FileWriter(getResultDir() + "/" + Thread.currentThread().getId() + "_trans.json", true);

        trans.toJSONObject().write(results);
        results.flush();
    }

    protected void applyTransformation(SingleTransformation trans) throws Exception {
        trans.apply(tmpDir + "/" + sourceDir);
    }

    @Override
    public void run(int n) throws Exception {
        setSosieSourcesDir(getResultDir());
        if(n <= 0) {
            while (true) {
                run(transQuery.query());
            }
        } else {
            for(int i = 0;i < n; i++) {
                run(transQuery.query());
            }
        }
    }

    protected String getSosieDestinationPath() {
        return getSosieSourcesDir() + "/" + sessionResults.getBeginTime();
    }
}

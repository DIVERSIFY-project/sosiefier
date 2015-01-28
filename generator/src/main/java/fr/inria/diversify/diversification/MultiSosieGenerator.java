package fr.inria.diversify.diversification;

import fr.inria.diversify.statistic.SinglePointSessionResults;
import fr.inria.diversify.transformation.SingleTransformation;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.transformation.ast.exception.ApplyTransformationException;
import fr.inria.diversify.transformation.ast.exception.BuildTransplantException;
import fr.inria.diversify.util.Log;
import org.json.JSONException;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

/**
 * Created by Simon on 23/10/2014.
 */
public class MultiSosieGenerator extends AbstractDiversify {
    protected List<SingleTransformation> allTransformation;
    protected boolean randomGeneration = false;
   // protected List<Transformation> currentSosie;
    protected List<List<SingleTransformation>> multiSosies;

    public MultiSosieGenerator(InputConfiguration inputConfiguration, String projectDir, String srcDir) {
        this.sourceDir = srcDir;
        this.projectDir = projectDir;
        transformations = new ArrayList<>();
        this.inputConfiguration = inputConfiguration;
        sessionResults = new SinglePointSessionResults();
    }

    public MultiSosieGenerator(List<SingleTransformation> allTransformation) {
        this.allTransformation = allTransformation;
    }


    @Override
    public void run(int n) throws Exception {
        while(multiSosies.size() < n ) {
            applyAndCheck(getNextTransformation());

            if(transformations.size() == transformations.size()) {
                multiSosies.add(transformations);
                copySosieProgram();
                restoreAll();
                trial++;
            }
        }
    }


    protected void applyAndCheck(SingleTransformation trans) throws Exception {
        Log.info("trial {}", trial);
        Log.debug("output dir: " + tmpDir + "/" + sourceDir);
        try {
            trans.apply(tmpDir + "/" + sourceDir);
            try {
                int status = runTest(tmpDir);

                trans.setStatus(status);
                trans.setFailures(builder.getTestFail());

            } catch (Exception e) {
                trans.setStatus(-2);
                Log.debug("compile error during diversification", e);
            }

            ((SinglePointSessionResults) sessionResults).addRunResults(trans);
            if (trans.getStatus() != 0) {
                trans.restore(tmpDir + "/" + sourceDir);
            } else {
                Log.info(sessionResults.toString());
                transformations.add(trans);
                writeTransformations(getSosieSourcesDir());
            }
        } catch (ApplyTransformationException e) {
            tryRestore(trans,e);
        } catch (BuildTransplantException e) {}
    }


    protected void restoreAll() throws Exception {
        for(SingleTransformation transformation: transformations) {
            transformation.restore(tmpDir + "/" + sourceDir);
        }
        transformations.clear();
    }

    protected SingleTransformation getNextTransformation() throws Exception {
        if(randomGeneration) {
            Random random = new Random();
            SingleTransformation t = allTransformation.remove(random.nextInt(allTransformation.size()));
            return t;
        } else {
            return allTransformation.remove(0);
        }
    }


    protected void writeTransformation(String fileName, ASTTransformation transformation) throws IOException, JSONException {
        FileWriter out = new FileWriter(fileName);

        out.write(transformation.toJSONObject().toString());

        out.close();
    }

    public void setTransformation(Collection<SingleTransformation> transformation) {
        allTransformation = new ArrayList<>(transformation);
    }

    public void setRandomGeneration(boolean randomGeneration) {
        this.randomGeneration = randomGeneration;
    }
}

package fr.inria.diversify.diversification;

import fr.inria.diversify.statistic.SinglePointSessionResults;
import fr.inria.diversify.testamplification.compare.diff.Diff;
import fr.inria.diversify.transformation.MultiTransformation;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.transformation.ast.exception.ApplyTransformationException;
import fr.inria.diversify.transformation.ast.exception.BuildTransplantException;
import fr.inria.diversify.transformation.query.AmpSosieQuery;
import fr.inria.diversify.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Simon on 13/02/15.
 */
public class MultiTransformationGenerator extends DiversifyAndCompare {
    protected MultiTransformation currentMultiTransformation;
    protected boolean onlySosie;


    protected int transformationSize;

    public MultiTransformationGenerator(InputConfiguration inputConfiguration, String projectDir, String srcDir) {
        super(inputConfiguration, projectDir, srcDir, null, null);
    }

    @Override
    public void run(int n) throws Exception {
        currentMultiTransformation = new MultiTransformation(true);
        while(trial < n && transQuery.hasNextTransformation()) {
            applyAndCheck(transQuery.query());

            addTransformation();

            if(currentMultiTransformation.size() == transformationSize || !transQuery.hasNextTransformation()) {
                addTransformation();

                copySosieProgram();
                currentMultiTransformation = new MultiTransformation(true);
                transQuery.currentTransformationEnd();
                trial++;
            }
        }
    }

    protected void addTransformation() throws JSONException {
        if(currentMultiTransformation.getStatus() == 0) {
            Transformation clone = currentMultiTransformation.clone();
            if(!transformations.contains(clone)) {
                transformations.add(clone);
                Diff d = ((AmpSosieQuery) transQuery).getCurrentDiff().clone();
                d.setSosie(clone);
                diff.add(d.toJson());
            }
        }
    }

    protected void applyAndCheck(Transformation trans) throws Exception {
        currentMultiTransformation.add(trans);
        String dir = tmpDir + "/" + sourceDir;
        try {
            currentMultiTransformation.apply(dir);
            try {
                int status = runTest(tmpDir);

                currentMultiTransformation.setStatus(status);
                currentMultiTransformation.setFailures(builder.getTestFail());

            } catch (Exception e) {
                currentMultiTransformation.setStatus(-2);
                Log.debug("compile error during diversification", e);
            }
            currentMultiTransformation.restore(dir);

            if (currentMultiTransformation.getStatus() != 0) {
                currentMultiTransformation.remove(trans);
            }
        } catch (ApplyTransformationException e) {
            tryRestore(trans,e);
        } catch (BuildTransplantException e) {}
        if(onlySosie && currentMultiTransformation.getStatus() != 0) {
            currentMultiTransformation.remove(trans);
        }
    }

    protected void writeTransformation(String fileName, ASTTransformation transformation) throws IOException, JSONException {
        FileWriter out = new FileWriter(fileName);

        out.write(transformation.toJSONObject().toString());

        out.close();
    }

    public void setOnlySosie(boolean onlySosie) {
        this.onlySosie = onlySosie;
    }

    public void setTransformationSize(int transformationSize) {
        this.transformationSize = transformationSize;
    }
}

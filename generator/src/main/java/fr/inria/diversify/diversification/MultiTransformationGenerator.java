package fr.inria.diversify.diversification;

import fr.inria.diversify.statistic.SinglePointSessionResults;
import fr.inria.diversify.transformation.MultiTransformation;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.transformation.ast.exception.ApplyTransformationException;
import fr.inria.diversify.transformation.ast.exception.BuildTransplantException;
import fr.inria.diversify.util.Log;
import org.json.JSONException;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


/**
 * Created by Simon on 13/02/15.
 */
public class MultiTransformationGenerator extends AbstractDiversify {
    protected MultiTransformation currentMultiTransformation;
    protected boolean onlySosie;

    protected int transformationSize;

    public MultiTransformationGenerator(InputConfiguration inputConfiguration, String projectDir, String srcDir) {
        this.sourceDir = srcDir;
        this.projectDir = projectDir;
        transformations = new ArrayList<>();
        this.inputConfiguration = inputConfiguration;
        sessionResults = new SinglePointSessionResults();
    }

    @Override
    public void run(int n) throws Exception {
        currentMultiTransformation = new MultiTransformation();
        while(transformations.size() < n && transQuery.hasNextTransformation()) {

            applyAndCheck(transQuery.query());

            if(currentMultiTransformation.size() == transformationSize) {
                transformations.add(currentMultiTransformation);

                copySosieProgram();
                currentMultiTransformation = new MultiTransformation();
                transQuery.currentTransformationEnd();
                trial++;
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

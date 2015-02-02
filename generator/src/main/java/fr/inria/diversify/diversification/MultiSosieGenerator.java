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
import java.util.Collection;
import java.util.List;
import java.util.Random;

/**
 * Created by Simon on 23/10/2014.
 */
public class MultiSosieGenerator extends AbstractDiversify {
    protected List<Transformation> allTransformation;
    protected boolean randomGeneration = false;
   protected MultiTransformation currentMultiTransformation;
    protected List<MultiTransformation> multiSosies;
    private int transformationSize;

    public MultiSosieGenerator(InputConfiguration inputConfiguration, String projectDir, String srcDir) {
        this.sourceDir = srcDir;
        this.projectDir = projectDir;
        transformations = new ArrayList<>();
        this.inputConfiguration = inputConfiguration;
        sessionResults = new SinglePointSessionResults();
    }

    public MultiSosieGenerator(List<Transformation> allTransformation) {
        this.allTransformation = allTransformation;
    }


    @Override
    public void run(int n) throws Exception {
        while(multiSosies.size() < n ) {
            applyAndCheck(getNextTransformation());

            if(currentMultiTransformation.size() == transformations.size()) {
                multiSosies.add(currentMultiTransformation);
                copySosieProgram();
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
    }

    protected Transformation getNextTransformation() throws Exception {
        if(randomGeneration) {
            Random random = new Random();
            Transformation t = allTransformation.remove(random.nextInt(allTransformation.size()));
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

    public void setTransformation(Collection<Transformation> transformation) {
        allTransformation = new ArrayList<>(transformation);
    }

    public void setRandomGeneration(boolean randomGeneration) {
        this.randomGeneration = randomGeneration;
    }

    public void setTransformationSize(int transformationSize) {
        this.transformationSize = transformationSize;
    }
}

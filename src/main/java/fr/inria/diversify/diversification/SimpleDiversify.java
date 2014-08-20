package fr.inria.diversify.diversification;

import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.util.Log;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Simon on 20/08/14.
 */
public class SimpleDiversify extends AbstractDiversify {

    public SimpleDiversify(InputConfiguration inputConfiguration, String projectDir, String srcDir) {
        this.sourceDir = srcDir;
        this.projectDir = projectDir;
        transformations = new ArrayList<>();
        this.inputConfiguration = inputConfiguration;
    }

    @Override
    public void run(int n) throws Exception {
        for(int i = 0;i < n; i++  ) {
            run(transQuery.getTransformation());
        }
    }


    public void run(Collection<Transformation> trans) throws Exception {
        for(Transformation transformation: trans) {
            run(transformation);
        }
    }

    protected void run(Transformation trans) throws Exception {
        Log.debug("output dir: " + tmpDir + "/" + sourceDir);
        try {
            trans.apply(tmpDir + "/" + sourceDir);
            transformations.add(trans);
            int status = runTest(tmpDir);

            trans.setStatus(status);
//            Log.debug("current: {}, parent: {} status: {}", builder.getTestFail().size(), trans.getParent().getFailures().size(), status);
            trans.setFailures(builder.getTestFail());
        } catch (Exception e) {
            trans.setStatus(-2);
            Log.warn("compile error during diversification", e);
        }
        trans.restore(tmpDir + "/" + sourceDir);
        Log.debug("run after restore: " + tmpDir + "/" + sourceDir);
    }
}

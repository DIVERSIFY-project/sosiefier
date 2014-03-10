package fr.inria.diversify.diversification;

import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.query.ast.AbstractTransformationQuery;
import fr.inria.diversify.util.Log;


/**
 * User: Simon
 * Date: 10/03/14
 * Time: 14:54
 */
public class DiversifyWithParent extends Diversify {

    public DiversifyWithParent(AbstractTransformationQuery transQuery, String projectDir) {
        super(transQuery, projectDir);
    }

    public DiversifyWithParent(String projectDir, String workingDir) {
       super(projectDir,workingDir);
    }


    protected void run(Transformation trans, String tmpDir) throws Exception {
        Log.debug("output dir: " + tmpDir + "/" + sourceDir);
        try {
            builder.setAcceptedErrors(trans.getParent().getFailures());
            trans.applyWithParent(tmpDir + "/" + sourceDir);
            transformations.add(trans);
            int status = runTest(tmpDir);

            if(status == 0)
                sosie++;
            trial++;
            trans.setStatus(status);
            trans.setFailures(builder.getErrors());
        } catch (Exception e) {
            compileError++;
            trans.setStatus(-2);
            Log.warn("compile error during diversification", e);
        }
        trans.restore(tmpDir + "/" + sourceDir);
        Log.debug("run after restore: " + tmpDir + "/" + sourceDir);
    }
}

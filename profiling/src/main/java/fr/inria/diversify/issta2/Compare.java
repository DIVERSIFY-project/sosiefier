package fr.inria.diversify.issta2;

import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.SinglePointDiversify;
import fr.inria.diversify.statistic.SinglePointSessionResults;
import fr.inria.diversify.transformation.SingleTransformation;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.transformation.ast.exception.ApplyTransformationException;
import fr.inria.diversify.transformation.ast.exception.BuildTransplantException;
import fr.inria.diversify.util.Log;

/**
 * Created by Simon on 21/01/15.
 */
public class Compare extends SinglePointDiversify {
    protected SosieComparator comparator;

    public Compare(InputConfiguration inputConfiguration, String projectDir, String srcDir, SosieComparator sosieComparator) {
        super(inputConfiguration, projectDir, srcDir);
        this.comparator = sosieComparator;
    }

    @Override
    public void run(int n) throws Exception {
        comparator.init(tmpDir);
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

    protected void run(Transformation trans) throws Exception {
        Log.info("trial {}", trial);
        Log.debug("output dir: " + tmpDir + "/" + sourceDir);
        writePosition(tmpDir + "/transplant.json", (ASTTransformation) trans);

        try {
            applyTransformation(trans);

            try {
                transformations.add(trans);
                int status = runTest(tmpDir);

                trans.setStatus(status);
                trans.setFailures(builder.getTestFail());

                // error during runTest
            } catch (Exception e) {
                trans.setStatus(-2);
                Log.debug("compile error during diversification", e);
            }

            trial++;
            trans.restore(tmpDir + "/" + sourceDir);

            if (trans.getStatus() == 0) {
                comparator.compare((SingleTransformation)trans);
            }

            ((SinglePointSessionResults) sessionResults).addRunResults(trans);
        } catch (ApplyTransformationException e) {
            tryRestore(trans,e);
            e.printStackTrace();
        } catch (BuildTransplantException e) {}
    }
}

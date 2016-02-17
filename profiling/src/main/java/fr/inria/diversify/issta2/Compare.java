package fr.inria.diversify.issta2;

import fr.inria.diversify.runner.InputConfiguration;
import fr.inria.diversify.runner.SinglePointRunner;
import fr.inria.diversify.logger.Diff;
import fr.inria.diversify.logger.JsonDiffOutput;
import fr.inria.diversify.persistence.json.output.JsonTransformationWriter;
import fr.inria.diversify.statistic.SinglePointSessionResults;
import fr.inria.diversify.transformation.SingleTransformation;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.transformation.ast.exception.ApplyTransformationException;
import fr.inria.diversify.transformation.ast.exception.BuildTransplantException;
import fr.inria.diversify.util.Log;
import org.json.JSONException;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Simon on 21/01/15.
 */
public class Compare extends SinglePointRunner {
    protected SosieComparator comparator;
    protected Map<Transformation, Set<Diff>> diffs;


    public Compare(InputConfiguration inputConfiguration, String projectDir, String srcDir, SosieComparator sosieComparator) {
        super(inputConfiguration, projectDir, srcDir);
        this.comparator = sosieComparator;
        diffs = new HashMap<>();
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
                trans.setFailures(builder.getFailedTests());
                // error during runTest
            } catch (Exception e) {
                trans.setStatus(-2);
                Log.debug("compile error during diversification", e);
            }

            trial++;
            trans.restore(tmpDir + "/" + sourceDir);

            if (trans.getStatus() == 0) {
                Set<Diff> diff = comparator.compare((SingleTransformation) trans);
                if(!diff.isEmpty()) {
                    diffs.put(trans, diff);
                }
            }

            ((SinglePointSessionResults) sessionResults).addRunResults(trans);
        } catch (Exception e) {
            tryRestore(trans,e);
            e.printStackTrace();
        }
    }

    /**
     * Write found transformations to file.
     *
     *
     * @param fileName File name where the transformations are going to be stored.
     * @throws IOException
     * @throws JSONException
     */
    public String writeTransformations(String fileName) throws IOException, JSONException {
        if (transformations.isEmpty())
            return "";

        JsonTransformationWriter writer = new JsonTransformationWriter();
        writer.addSection(JsonDiffOutput.class, new JsonDiffOutput(diffs));
        writer.write(transformations, fileName + ".json", inputConfiguration.getInputProgram().getProgramDir() + "/pom.xml");
        return fileName + ".json";
    }
}

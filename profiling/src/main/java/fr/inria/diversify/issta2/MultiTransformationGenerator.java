package fr.inria.diversify.issta2;

import fr.inria.diversify.runner.AbstractRunner;
import fr.inria.diversify.runner.InputConfiguration;
import fr.inria.diversify.logger.Diff;
import fr.inria.diversify.logger.JsonDiffOutput;
import fr.inria.diversify.persistence.json.output.JsonTransformationWriter;
import fr.inria.diversify.transformation.MultiTransformation;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.exception.ApplyTransformationException;
import fr.inria.diversify.transformation.exception.BuildTransplantException;
import fr.inria.diversify.transformation.query.TransformationQuery;
import fr.inria.diversify.util.Log;
import org.json.JSONException;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * User: Simon
 * Date: 04/11/15
 * Time: 14:02
 */
public class MultiTransformationGenerator extends AbstractRunner {
    protected MultiTransformation currentMultiTransformation;
    protected boolean onlySosie;
    protected int transformationSize;
//    protected Map<Transformation, Set<Diff>> diffs;

    public MultiTransformationGenerator(InputConfiguration inputConfiguration, String project, String src) {
        this.sourceDir = src;
        this.projectDir = project;
        transformations = new ArrayList<>();
        this.inputConfiguration = inputConfiguration;
    }

    @Override
    public void run(int n) throws Exception {
        currentMultiTransformation = new MultiTransformation(true);

        while(trial < n && transQuery.hasNextTransformation()) {
            applyAndCheck(transQuery.query());
            addTransformation();
            if(currentMultiTransformation.size() == transformationSize) {
//                addTransformation();
                currentMultiTransformation = new MultiTransformation(true);
                transQuery.currentTransformationEnd();
                trial++;
            }
        }
    }

    protected void addTransformation() throws JSONException {
        if(!transformations.contains(currentMultiTransformation)) {
            transformations.add(currentMultiTransformation);
        }
//        Set<Diff> diffSet = currentMultiTransformation.getTransformations().stream()
//                .filter(t -> diffs.containsKey(t))
//                .flatMap(t -> diffs.get(t).stream())
//                .collect(Collectors.toSet());
//        diffs.put(currentMultiTransformation, diffSet);
    }

    protected void applyAndCheck(Transformation trans) throws Exception {
        currentMultiTransformation.add(trans);
        String dir = tmpDir + "/" + sourceDir;
        try {
            currentMultiTransformation.apply(dir);
            try {
                int status = runTest(tmpDir);

                currentMultiTransformation.setStatus(status);
                currentMultiTransformation.setFailures(builder.getFailedTests());

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

    protected void writeTransformation(String fileName, Transformation transformation) throws IOException, JSONException {
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

        Map<Transformation, Set<Diff>> multiDiffs = new HashMap<>();
//        for(Transformation transformation : transformations) {
//            multiDiffs.put(transformation, diffs.get(transformation));
//        }

        JsonTransformationWriter writer = new JsonTransformationWriter();
        writer.addSection(JsonDiffOutput.class, new JsonDiffOutput(multiDiffs));
        writer.write(transformations, fileName + ".json", inputConfiguration.getInputProgram().getProgramDir() + "/pom.xml");
        return fileName + ".json";
    }
    public void setTransformationQuery(TransformationQuery transQuery) {
//        if(transQuery instanceof DiffQuery) {
//            diffs = ((DiffQuery) transQuery).getTransToDiffs();
//        }
        this.transQuery = transQuery;
    }

}

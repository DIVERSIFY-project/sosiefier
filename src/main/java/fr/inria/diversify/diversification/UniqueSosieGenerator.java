package fr.inria.diversify.diversification;

import fr.inria.diversify.statistic.SinglePointSessionResults;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.util.Log;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Simon on 23/10/2014.
 */
public class UniqueSosieGenerator extends AbstractDiversify {
    List<Transformation> allTransformation;
    private Collection<Transformation> transformation;

    public UniqueSosieGenerator(InputConfiguration inputConfiguration, String projectDir, String srcDir) {
        this.sourceDir = srcDir;
        this.projectDir = projectDir;
        transformations = new ArrayList<>();
        this.inputConfiguration = inputConfiguration;
        sessionResults = new SinglePointSessionResults();
    }

    public UniqueSosieGenerator(List<Transformation> allTransformation) {
        this.allTransformation = allTransformation;
    }

    @Override
    public void run(int n) throws Exception {

        while (transformations.size() < n && !allTransformation.isEmpty()) {
            run(allTransformation.remove(0));
        }
    }

    protected void run(Transformation trans) throws Exception {
        Log.info("trial {}", trial);
        Log.debug("output dir: " + tmpDir + "/" + sourceDir);
        try {
            writePosition(tmpDir + "/transplant.json", (ASTTransformation) trans);
            trial++;
            trans.apply(tmpDir + "/" + sourceDir);
            int status = runTest(tmpDir);

            if(status == 0) {
                transformations.add(trans);
                copySosieProgram();
            }
            trans.setStatus(status);
            trans.setFailures(builder.getTestFail());

        } catch (Exception e) {
            Log.debug("compile error during diversification", e);
        }
        trans.restore(tmpDir + "/" + sourceDir);
        ((SinglePointSessionResults) sessionResults).addRunResults(trans);
    }



    protected void writePosition(String fileName, ASTTransformation transformation) throws IOException {
        FileWriter out = new FileWriter(fileName);

        String className = transformation.classLocationName();
        int line = transformation.getTransplantationPoint().getCtCodeFragment().getPosition().getLine();

        out.write("{\"Position\": \""+ className+ ":"+ line +"\"}");

        out.close();
    }

    public void setTransformation(Collection<Transformation> transformation) {
        allTransformation = new ArrayList<>(transformation);
    }
}

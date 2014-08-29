package fr.inria.diversify.diversification;


import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.util.Log;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Simon on 20/08/14.
 */
public class SinglePointDiversify extends AbstractDiversify {

    protected int trial = 0;
    protected int compile = 0;
    protected int sosie = 0;

    public SinglePointDiversify(InputConfiguration inputConfiguration, String projectDir, String srcDir) {
        this.sourceDir = srcDir;
        this.projectDir = projectDir;
        transformations = new ArrayList<>();
        this.inputConfiguration = inputConfiguration;
    }

    @Override
    public void run(int n) throws Exception {
        for(int i = 0;i < n; i++  ) {
            run(transQuery.buildTransformation());
        }
        Log.info("session result:");
        Log.info("\ttrial: {}", trial);
        Log.info("\tcompile: {}", compile);
        Log.info("\tsosie: {}", sosie);
    }


    public void run(Collection<Transformation> trans) throws Exception {
        for(Transformation transformation: trans) {
            run(transformation);
        }
        Log.info("session result:");
        Log.info("\ttrial: {}", trial);
        Log.info("\tcompile: {}", compile);
        Log.info("\tsosie: {}", sosie);
    }

    protected void run(Transformation trans) throws Exception {
        Log.info("trial {}",trial);
        Log.debug("output dir: " + tmpDir + "/" + sourceDir);
        try {
            writePosition(tmpDir + "/transplant.json", (ASTTransformation) trans);

            trans.apply(tmpDir + "/" + sourceDir);
            transformations.add(trans);
            int status = runTest(tmpDir);

            trans.setStatus(status);
            trans.setFailures(builder.getTestFail());
            if(status == 0) {
                sosie ++;
            }
            if(status == -2) {
                compile++;
            }

        } catch (Exception e) {
            trans.setStatus(-2);
            Log.warn("compile error during diversification", e);
        }
        trial++;
        trans.restore(tmpDir + "/" + sourceDir);
        Log.debug("run after restore: " + tmpDir + "/" + sourceDir);
    }

    protected void writePosition(String fileName, ASTTransformation transformation) throws IOException {
        FileWriter out = new FileWriter(fileName);

        String className = transformation.classLocationName();
        int line = transformation.getTransplantationPoint().getCtCodeFragment().getPosition().getLine();

        out.write("{\"Position\": \""+ className+ ":"+ line +"\"}");

        out.close();
    }
}

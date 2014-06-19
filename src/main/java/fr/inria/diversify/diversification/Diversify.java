package fr.inria.diversify.diversification;

import fr.inria.diversify.transformation.AbstractTransformation;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.query.TransformationQuery;
import fr.inria.diversify.transformation.query.ByteCodeTransformationQuery;
import fr.inria.diversify.util.Log;
import org.codehaus.plexus.util.FileUtils;

import java.io.IOException;
import java.util.ArrayList;

import java.util.Collection;

/**
 *
 * User: Simon
 * Date: 5/2/13
 * Time: 5:39 PM
 */
public class Diversify extends AbstractDiversify {
    protected int compileError = 0;
    protected int sosie = 0;
    protected int trial = 0;

    public Diversify(TransformationQuery transQuery, String projectDir) {
        this.transQuery = transQuery;
        this.projectDir = projectDir;
        transformations = new ArrayList<>();
    }

    public Diversify(String projectDir, String workingDir) {
        this.sourceDir = workingDir;
        this.projectDir = projectDir;

        transformations = new ArrayList<>();
    }

    @Override
    public void run(int n) throws Exception {
        for (int i = 0; i < n; i++) {
            Log.info("===========================");
            Log.info("DIVERSIFICATION RUN :: " + n);
            Log.info("===========================");
            //The amount of transformations are set by the transQuery
            transQuery.query();
            run(transQuery.getTransformations());
        }
        FileUtils.cleanDirectory(tmpDir);
        FileUtils.forceDelete(tmpDir);

        Log.debug("{} setCompile error on {} compilation", compileError, n);
        Log.debug("{} sosie on {} trial", sosie, trial);
    }

    @Override
    protected void run(Collection<Transformation> trans) throws Exception {
        Log.info("number of diversification: " + trans.size());
        int i = 0;
        for (Transformation tran : trans) {
            Log.info("Transformation: " + i);
            Log.debug("output dir: " + tmpDir + "/" + sourceDir);

            tran.apply(tmpDir + "/" + sourceDir);
            transformations.add(tran);
            //run(tran, tmpDir);
            i++;
        }

        int status;
        try {
            Log.info("===========================");
            Log.info("BUILDING DIVERSIFIED PROGRAM");
            Log.info("===========================");
            status = runTest(tmpDir);
        } catch (Exception e) {
            compileError++;
            status = -2;
        }

        for (Transformation tran : trans) {
            if (tran.getStatus() == AbstractTransformation.NOT_TESTED) {
                tran.setStatus(status);
                tran.setFailures(builder.getErrors());
            }
        }


        String[] statusCode = {"SOSIE!!", "Test failed :P", "Compile failed" };
        Log.info("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Log.info(statusCode[status]);
        Log.info("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //tran.restore(tmpDir + "/" + sourceDir);

        try {
            FileUtils.cleanDirectory(tmpDir);
            FileUtils.forceDelete(tmpDir);
        } catch (IOException e) {
            Log.warn("Unable to delete " + tmpDir + " : " + e.getMessage());
        }

        Log.debug("{} setCompile error on {} compilation", compileError, trans.size());
        Log.debug("{} sosie on {} trial", sosie, trial);
    }

    protected void run(Transformation trans, String tmpDir) throws Exception {
        Log.debug("output dir: " + tmpDir + "/" + sourceDir);
        try {
            trans.apply(tmpDir + "/" + sourceDir);
            transformations.add(trans);
            int status = runTest(tmpDir);

            if(status == AbstractTransformation.SOSIE)
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

    protected String[] getMavenPhase() {
        if(transQuery != null && transQuery instanceof ByteCodeTransformationQuery)
            return new String[]{"test"};
        else
            return new String[]{"clean", "test"};
    }
}

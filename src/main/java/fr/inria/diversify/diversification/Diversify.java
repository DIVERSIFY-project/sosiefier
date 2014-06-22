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
import java.util.Iterator;
import java.util.ListIterator;

/**
 * User: Simon
 * Date: 5/2/13
 * Time: 5:39 PM
 */
public class Diversify extends AbstractDiversify {
    /**
     * Number of compiled errors
     */
    protected int compileError = 0;

    /**
     * Number of sosies found
     */
    protected int sosie = 0;

    /**
     * Number of trials performed
     */
    protected int trial = 0;

    /** Reports results on every step. Slower, but allows to stop the process without
     *  loosing all the information
     */
    private boolean earlyReport = false;

    /** Reports results on every step. Slower, but allows to stop the process without
     *  loosing all the information
     */
    public boolean getEarlyReport() {
        return earlyReport;
    }

    public void setEarlyReport(boolean earlyReport) {
        this.earlyReport = earlyReport;
    }

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

        trial = 0;
        sosie = 0;

        for (int i = 0; i < n; i++) {
            Log.info("===========================");
            Log.info("DIVERSIFICATION RUN :: " + i);
            Log.info("===========================");

            //Increase the trial count
            trial++;
            //The amount of transformations are given in the query by the InputProgram
            transQuery.query();
            //Run transformations found
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
            Log.info("APPLY TRANSFORMATION: " + i);
            Log.debug("output dir: " + tmpDir + "/" + sourceDir);
            tran.apply(tmpDir + "/" + sourceDir);
            transformations.add(tran);
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
            tran.restore(tmpDir + "/" + sourceDir);
        }

        String[] statusCode = {"SOSIE!!", "TEST FAILED :P", "COMPILE FAILED :("};
        Log.info("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Log.info(statusCode[status * -1]);
        Log.debug("{} setCompile error on {} compilation", compileError, trans.size());
        Log.debug("{} sosie on {} trial", sosie, trial);
        Log.info("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    protected void run(Transformation trans, String tmpDir) throws Exception {
        Log.debug("output dir: " + tmpDir + "/" + sourceDir);
        try {
            trans.apply(tmpDir + "/" + sourceDir);
            transformations.add(trans);
            int status = runTest(tmpDir);

            if (status == AbstractTransformation.SOSIE)
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
        if (transQuery != null && transQuery instanceof ByteCodeTransformationQuery)
            return new String[]{"test"};
        else
            return new String[]{"clean", "test"};
    }


}

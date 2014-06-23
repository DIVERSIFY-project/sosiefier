package fr.inria.diversify.diversification;

import fr.inria.diversify.statistic.RunResults;
import fr.inria.diversify.statistic.SessionResults;
import fr.inria.diversify.transformation.AbstractTransformation;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.query.TransformationQuery;
import fr.inria.diversify.transformation.query.ByteCodeTransformationQuery;
import fr.inria.diversify.util.Log;
import org.codehaus.plexus.util.FileUtils;
import org.json.JSONException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
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
     * Session report
     */
    SessionResults sessionResults;

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

    /**
     * Indicates if we must early report sosies only
     */
    private boolean earlyReportSosiesOnly = false;

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

        sessionResults = new SessionResults();

        if ( earlyReport && !(new File(getResultDir()).exists()) ) {
            mkDirResult(getResultDir());
        }

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
            Collection<Transformation> ts = transQuery.getTransformations();
            run(ts);
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

        if ( earlyReport && getResultDir() != null ) {
            if ( earlyReportSosiesOnly == false || status == 0 ) {
                try {
                    RunResults result = new RunResults();
                    result.setId(trial);
                    result.setStatus(status);
                    result.setTransformations(trans);
                    result.setFailedTests(builder.getErrors());
                    result.saveToFile(getResultDir() + "/" + "session_" + sessionResults.getBeginTime() +
                            "_trial_" + trial + "_size_" + trans.size() + "_stat_" + status + ".json");
                    sessionResults.addRunResults(result);
                    sessionResults.saveReport(getResultDir() + "/session_" + sessionResults.getBeginTime() + ".txt" );
                } catch ( IOException e ) {
                    Log.warn("Cannot output early report: ", e);
                } catch ( JSONException e ) {
                    //Not my mf problem!! (Hard rock in the background)
                    throw e;
                }

            }
        }
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


    /**
     * Indicates if we must early report sosies only
     */
    public boolean getEarlyReportSosiesOnly() {
        return earlyReportSosiesOnly;
    }

    public void setEarlyReportSosiesOnly(boolean earlyReportSosiesOnly) {
        this.earlyReportSosiesOnly = earlyReportSosiesOnly;
    }
}

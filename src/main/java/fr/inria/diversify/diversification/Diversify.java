package fr.inria.diversify.diversification;

import fr.inria.diversify.sosie.logger.Instru;
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
import java.util.ArrayList;

import java.util.Collection;

/**
 * User: Simon
 * Date: 5/2/13
 * Time: 5:39 PM
 */
public class Diversify extends AbstractDiversify {

    /**
     * Input configuration
     */
    InputConfiguration inputConfiguration;

    /**
     * Session report
     */
    SessionResults sessionResults;

    /**
     * Number of compiled errors. TODO: This info is already in SessionResults
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

    public Diversify(InputConfiguration inputConfiguration, TransformationQuery transQuery, String projectDir) {
        this.transQuery = transQuery;
        this.projectDir = projectDir;
        transformations = new ArrayList<>();
    }

    public Diversify(InputConfiguration inputConfiguration, String projectDir, String workingDir) {
        this.sourceDir = workingDir;
        this.projectDir = projectDir;
        transformations = new ArrayList<>();
        this.inputConfiguration = inputConfiguration;
    }

    @Override
    public void run(int n) throws Exception {

        sessionResults = new SessionResults();

        File f = new File(getResultDir());
        if ( earlyReport && !(f.exists())) { f.mkdirs(); }

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

        Log.debug("{} setCompile error on {} compilation", compileError, n);
        Log.debug("{} sosie on {} trial", sosie, trial);
    }

    @Override
    protected void run(Collection<Transformation> trans) throws Exception {

        String outputDir = tmpDir + "/" + sourceDir;

        Log.info("number of diversification: " + trans.size());
        int i = 0;
        for (Transformation tran : trans) {
            Log.info("APPLY TRANSFORMATION: " + i);
            Log.debug("output dir: " + outputDir);
            tran.apply(outputDir);
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
                    result.saveToFile(getResultDir() + "/" +
                            "trial_" + trial + "_size_" + trans.size() + "_stat_" + status + ".json");
                    sessionResults.addRunResults(result);
                    sessionResults.saveReport(getResultDir() + "/session" + trans.size() + ".txt" );
                } catch ( IOException e ) {
                    Log.warn("Cannot output early report: ", e);
                } catch ( JSONException e ) {
                    //Not my mf problem!! (Hard rock in the background)
                    throw e;
                }
            }
        }
        if ( status == 0 ) {
            copySosieProgram();
        }
    }

    protected void copySosieProgram() throws IOException {
        //Store the whole sosie program.
        if ( getSocieSourcesDir() != null && (new File(getSocieSourcesDir()).exists()) ) {
            File source = new File(tmpDir);
            String destPath = getSocieSourcesDir() + "/" + sessionResults.getBeginTime() + "_trial_" + trial;
            File dest = new File(destPath);


            boolean intruMethodCall = Boolean.parseBoolean(inputConfiguration.getProperty("intruMethodCall"));
            boolean intruVariable = Boolean.parseBoolean(inputConfiguration.getProperty("intruVariable"));
            boolean intruError = Boolean.parseBoolean(inputConfiguration.getProperty("intruError"));
            boolean intruAssert = Boolean.parseBoolean(inputConfiguration.getProperty("intruAssert"));
            boolean intruNewTest = Boolean.parseBoolean(inputConfiguration.getProperty("intruNewTest"));

            if ( intruMethodCall || intruVariable || intruError || intruAssert || intruNewTest ) {
                Instru instru = new Instru(projectDir, tmpDir, inputConfiguration.getProperty("testSrc"), destPath);
                instru.instru(intruMethodCall, intruVariable, intruError, intruNewTest, intruAssert);
            }
            org.apache.commons.io.FileUtils.copyDirectory(source, dest);
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

package fr.inria.diversify.diversification;

import fr.inria.diversify.sosie.logger.Instru;
import fr.inria.diversify.statistic.RunResults;
import fr.inria.diversify.statistic.SessionResults;
import fr.inria.diversify.transformation.AbstractTransformation;
import fr.inria.diversify.transformation.query.SeveralTriesUnsuccessful;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.query.TransformationQuery;
import fr.inria.diversify.util.Log;
import org.json.JSONException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Collection;
import java.util.Iterator;

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

    private boolean earlyReportSosiesOnly = false;
    /**
     * Indicates if we must early report sosies only
     */
    public boolean getEarlyReportSosiesOnly() {
        return earlyReportSosiesOnly;
    }

    public void setEarlyReportSosiesOnly(boolean earlyReportSosiesOnly) {
        this.earlyReportSosiesOnly = earlyReportSosiesOnly;
    }

    /**
     * Reports results on every step. Slower, but allows to stop the process without
     * loosing all the information
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
        sessionResults = new SessionResults();
        String[] p = projectDir.split("/");
        sessionResults.setName(p[p.length - 1]);
    }

    public Diversify(InputConfiguration inputConfiguration, String projectDir, String workingDir) {
        this.sourceDir = workingDir;
        this.projectDir = projectDir;
        transformations = new ArrayList<>();
        this.inputConfiguration = inputConfiguration;
        sessionResults = new SessionResults();
        String[] p = projectDir.split("/");
        sessionResults.setName(p[p.length - 1]);
    }

    @Override
    /**
     * Runs the diversificator.
     * @param n Number of times the diversification process will run, i.e trials
     * @throws Exception
     */
    public void run(int n) throws Exception {

        //Create the folder for the output
        File f = new File(getResultDir());
        if (earlyReport && !(f.exists())) {
            f.mkdirs();
        }

        //Number of trials made and sosies achieved
        trial = 0;
        sosie = 0;

        String outputDir = tmpDir + "/" + sourceDir;

        for (int i = 0; i < n; i++) {
            Log.info("===========================");
            Log.info("DIVERSIFICATION RUN :: " + i);
            Log.info("===========================");
            //Increase the trial count
            trial++;


            //We will try several times, collecting errors in the way
            boolean success = false;
            int attempts = 0;
            Exception[] causes = new Exception[10];
            while (success == false && attempts < 10) {
                //1. We query for transformations.
                transQuery.query();
                //Obtain transformations
                transformations = (java.util.List<Transformation>) transQuery.getTransformations();

                //2. We try to apply them
                try {
                    applyTransformations(transformations, outputDir);
                    success = true;
                } catch (Exception ex) {
                    Log.error("Query application failed! " + ex.getMessage());
                    //Application failed!... we'll query and apply again
                    causes[attempts] = ex;
                    attempts++;
                }

                //Run transformations found
                if (success) {
                    try {
                        run();
                    } catch (Exception ex) {
                        Log.error("Diversified program run failed! " + ex.getMessage());
                        success = false;
                        //Application failed!... we'll query, apply and run again
                        causes[attempts] = ex;
                        attempts++;
                    }
                }
            }
            //OK, we where unable to do anything...
            if (!success) {
                throw new SeveralTriesUnsuccessful(causes);
            }
        }
    }

    protected void applyTransformations(Collection<Transformation> trans, String outputDir) throws Exception {

        int successful = 0;
        try {
            //Try to apply transformations
            for (Transformation t : trans) {
                t.apply(outputDir);
                successful++;
            }
        } catch (Exception e) {
            //Revert to the original state
            try {
                for (Iterator<Transformation> i = trans.iterator(); i.hasNext() && successful > 0; successful--) {
                    i.next().restore(outputDir);
                }
            } catch (Exception ex) {
                //From here I just don't want to recover
                throw new RuntimeException(ex);
            }
            //Once reverted, rethrow
            throw e;
        }

    }

    //@Override
    protected void run() throws Exception {

        Log.info("number of diversification: " + transformations.size());
        int i = 0;
        int status;

        Log.info("============================");
        Log.info("BUILDING DIVERSIFIED PROGRAM");
        Log.info("============================");

        status = runTest(tmpDir);

        if (status == 0) { copySosieProgram(trans); }

        //Store transformation status
        for (Transformation tran : transformations) {
            if (tran.getStatus() == AbstractTransformation.NOT_TESTED) {
                tran.setStatus(status);
                tran.setFailures(builder.getTestFail());
            }
            tran.restore(tmpDir + "/" + sourceDir);
        }

        String[] statusCode = {"SOSIE!!", "TEST FAILED :P", "COMPILE FAILED :("};
        Log.info("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        try {
            Log.info(statusCode[Math.abs(status)]);
        } catch (ArrayIndexOutOfBoundsException e) {
            Log.error("INVALID STATUS!! Status: " + status);
            throw new RuntimeException(e);
        }
        Log.debug("{} setCompile error on {} compilation", compileError, transformations.size());
        Log.debug("{} sosie on {} trial", sosie, trial);
        Log.info("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        if (earlyReport && getResultDir() != null) {
            earlyReport(status);
        }
        if (status == 0) {
            copySosieProgram();

        }
    }

    /**
     * Early reports the advance of the system.
     *
     * @param status Status of the current transformations, Sosie, build failed, etc.
     */
    protected void earlyReport(int status) {
        if (getEarlyReportSosiesOnly() == false || status == 0) {
            try {
                RunResults result = buildRunResult(transformations, status);
                result.saveToFile(getResultDir() + "/" + Thread.currentThread().getId() +
                        "_trial_" + trial + "_size_" + transformations.size() + "_stat_" + status + ".json");
                sessionResults.addRunResults(result);
                sessionResults.saveReport(
                        getResultDir() + "/" + Thread.currentThread().getId() + "_session.html");
            } catch (IOException | JSONException e) {
                //Not my mf problem!! (Hard rock in the background)
                //I mean, user usually want to stop process if no output is possible
                throw new RuntimeException(e);
            }
        }
    }


    /**
     * Builds the results from a transformation list and a resulting status
     *
     * @param trans  Transformations list
     * @param status Resulting status
     * @return A run result
     */
    protected RunResults buildRunResult(Collection<Transformation> trans, int status) {
        RunResults result = new RunResults();
        result.setId(trial);
        result.setStatus(status);
        result.setTransformations(trans);
        result.setFailedTests(builder.getTestFail());
        return result;
    }

    protected void copySosieProgram() throws IOException, JSONException {
        //Store the whole sosie program.
        try {

            if (getSocieSourcesDir() != null && getSocieSourcesDir().length() > 0) {
                File f = new File(getSocieSourcesDir());
                if (!(f.exists())) {
                    f.mkdirs();
                }

                String destPath = getSocieSourcesDir() + "/" + sessionResults.getBeginTime() + "_trial_" + trial;

                boolean intruMethodCall = Boolean.parseBoolean(inputConfiguration.getProperty("intruMethodCall"));
                boolean intruVariable = Boolean.parseBoolean(inputConfiguration.getProperty("intruVariable"));
                boolean intruError = Boolean.parseBoolean(inputConfiguration.getProperty("intruError"));
                boolean intruAssert = Boolean.parseBoolean(inputConfiguration.getProperty("intruAssert"));
                boolean intruNewTest = Boolean.parseBoolean(inputConfiguration.getProperty("intruNewTest"));

                if (intruMethodCall || intruVariable || intruError || intruAssert || intruNewTest) {
                    Instru instru = new Instru(
                            tmpDir, sourceDir,
                            inputConfiguration.getProperty("testSrc"), destPath);
                    instru.instru(intruMethodCall, intruVariable, intruError, intruNewTest, intruAssert);
                }
            FileWriter writer = new FileWriter(destPath+"/trans.json");
            for(Transformation t : trans) {
                    writer.write(t.toJSONObject().toString()+"\n");
            }
        } catch (IOException e) {
            //We may also don't want to recover from here. If no instrumentation possible... now what?
            throw new RuntimeException(e);
        }
    }


    /*
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
            trans.setFailures(builder.getTestFail());
        } catch (Exception e) {
            compileError++;
            trans.setStatus(-2);
            Log.warn("compile error during diversification", e);
        }

        trans.restore(tmpDir + "/" + sourceDir);
        Log.debug("run after restore: " + tmpDir + "/" + sourceDir);
    }*/
}

package fr.inria.diversify.runner;

import fr.inria.diversify.statistic.RunResults;
import fr.inria.diversify.statistic.SessionResults;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.query.KnownSosieQuery;
import fr.inria.diversify.transformation.query.QueryException;
import fr.inria.diversify.transformation.query.SeveralTriesUnsuccessful;
import fr.inria.diversify.transformation.query.TransformationQuery;
import fr.inria.diversify.util.Log;
import org.json.JSONException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * User: Simon
 * Date: 5/2/13
 * Time: 5:39 PM
 */
public class OldRunner extends AbstractRunner {

//    /**
//     * Session report
//     */
//    protected SessionResults sessionResults;

    /**
     * Number of compiled errors. TODO: This info is already in SessionResults
     */
    protected int compileError = 0;

    /**
     * Number of sosies found
     */
    protected int sosie = 0;

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

    public OldRunner(InputConfiguration inputConfiguration, TransformationQuery transQuery, String projectDir) {
        this.transQuery = transQuery;
        this.projectDir = projectDir;
        transformations = new ArrayList<>();
        sessionResults = new SessionResults();
        String[] p = projectDir.split("/");
        sessionResults.setName(p[p.length - 1]);
        this.inputConfiguration = inputConfiguration;
    }

    public OldRunner(InputConfiguration inputConfiguration, String projectDir, String workingDir) {
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
     * @param n Number of sosies we want
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

        //We will try several times, collecting errors in the way
        boolean success = true;
        boolean ableToFindMoreSosies = true;
        while (sosie < n && success && ableToFindMoreSosies) {
            Log.info("===========================");
            Log.info("DIVERSIFICATION RUN :: " + trial);
            Log.info("===========================");
            //Increase the trial count
            trial++;

            success = false;

            int attempts = 0;
            Exception[] causes = new Exception[10];
            while (success == false && attempts < 10) {
                //1. We executeQuery for transformations.
                try {
                    ((KnownSosieQuery) transQuery).executeQuery();
                    //Obtain transformations
                    transformations = (List<Transformation>)  ((KnownSosieQuery) transQuery).getMultiTransformations();
                    success = true;
                } catch (SeveralTriesUnsuccessful e ) {
                    if ( e.getCauses()[0] instanceof QueryException) {
                        QueryException qe = (QueryException)e.getCauses()[0];
                        if ( qe.getReason().equals(QueryException.Reasons.UNABLE_TO_FIND_SOSIE_PARENT) ) {
                            //Gently stop the search
                            attempts = 100;
                            ableToFindMoreSosies = false;
                        }
                    }
                    attempts++;
                    success = false;
                }

                //2. We try to apply them
                if ( success ) {
                    try {
                        applyTransformations(transformations, outputDir);
                        success = true;
                    } catch (Exception ex) {
                        ((KnownSosieQuery) transQuery).setLastTransformationStatus(Transformation.EXCEPTION);
                        success = false;
                        Log.error("Query application failed! " + ex.getMessage());
                        //Application failed!... we'll executeQuery and apply again
                        causes[attempts] = ex;
                        attempts++;
                    }
                }

                //3. We run transformations found
                if (success) {
                    try {
                        run();
                    } catch (Exception ex) {
                        ((KnownSosieQuery) transQuery).setLastTransformationStatus(Transformation.EXCEPTION);
                        Log.error("Diversified program run failed! " + ex.getMessage());
                        success = false;
                        //Application failed!... we'll executeQuery, apply and run again
                        causes[attempts] = ex;
                        attempts++;
                    }
                }
            }
            //OK, we where unable to do anything... while there was chance to do something
            if (!success && ableToFindMoreSosies) {
                throw new SeveralTriesUnsuccessful(causes);
            }
        }
    }

    protected void applyTransformations(Collection<Transformation> trans, String outputDir) throws Exception {

        int successful = 0;
        try {
            //Try to apply transformations
            for (Transformation t : trans) {
                //Input the configuration
                if ( t instanceof Transformation) {
                    ((Transformation)t).setInputProgram(inputConfiguration.getInputProgram());
                }
                t.apply(outputDir);
                successful++;
            }
        } catch (Exception e) {
            //Revert to the original state
            try {
                for (Iterator<Transformation> i = trans.iterator(); i.hasNext() && successful > 0; successful--) {
                    Transformation t = i.next();
                    if ( t instanceof Transformation) {
                        ((Transformation)t).setInputProgram(inputConfiguration.getInputProgram());
                    }
                    t.restore(outputDir);
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

        //Build and run the transformation
        status = runTest(tmpDir);
        //Give back to the executeQuery the value of the las transformation
        ((KnownSosieQuery) transQuery).setLastTransformationStatus(status);

        if (status == Transformation.SOSIE) {
            sosie++;
        }

        //Store transformation status
        for (Transformation tran : transformations) {
            if (tran.getStatus() == Transformation.NOT_TESTED) {
                tran.setStatus(status);
                tran.setFailures(builder.getFailedTests());
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
    }

    /**
     * Early reports the advance of the system.
     *
     * @param status Status of the current transformations, Sosie, locate failed, etc.
     */
    protected void earlyReport(int status) {
        if (getEarlyReportSosiesOnly() == false || status == 0) {
            try {
                RunResults result = buildRunResult(transformations, status,  ((KnownSosieQuery) transQuery).getLastIncrementalSeries());
                String jsonFile = getResultDir() + "/" + Thread.currentThread().getId() +
                        "_trial_" + trial + "_size_" + transformations.size() + "_stat_" + status + ".json";
                result.saveToFile(jsonFile);
                ((SessionResults) sessionResults).addRunResults(result, jsonFile, getResultDir() + "/buidOutput" + builder.getRunCount() + ".txt");
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
    protected RunResults buildRunResult(Collection<Transformation> trans, int status, int series) {
        RunResults result = new RunResults();
        result.setId(trial);
        result.setIncrementalSeries(series);
        result.setStatus(status);
        result.setTransformations(trans);
        result.setFailedTests(builder.getFailedTests());
        return result;
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

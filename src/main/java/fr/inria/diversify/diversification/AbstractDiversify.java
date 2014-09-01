package fr.inria.diversify.diversification;

import fr.inria.diversify.sosie.logger.Instru;
import fr.inria.diversify.statistic.AbstractSessionResults;
import fr.inria.diversify.transformation.*;
import fr.inria.diversify.buildSystem.AbstractBuilder;
import fr.inria.diversify.transformation.query.TransformationQuery;
import fr.inria.diversify.util.GitUtils;
import fr.inria.diversify.util.Log;
import org.apache.commons.io.FileUtils;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.json.JSONException;

import java.io.*;
import java.util.List;

/**
 * User: Simon
 * Date: 9/2/13
 * Time: 3:05 PM
 */
public abstract class AbstractDiversify {

    /**
     * Number of trials performed
     */
    protected int trial = 0;

    /**
     * Session report
     */
    protected AbstractSessionResults sessionResults;

    /**
     * Input configuration
     */
    protected InputConfiguration inputConfiguration;

    /**
     * The original temporal directory. This is a patch. Sometimes we cannot delete the tmpDir
     */
    protected String originalTmpDir;

    /**
     * Directory project
     */
    protected String projectDir;
    /**
     * Temporal directory where the diversificated programs are going to be temporary stored
     */
    protected String tmpDir;
    /**
     * Source directory of the project
     */
    protected String sourceDir;

    /**
     * Directory to store result information, i.e number of trials, number of sosies, transformations, etc.
     */
    private String resultDir;

    /**
     * Directory to copy sosies programs source code to.
     */
    private String socieSourcesDir = null;



    /**
     * The original temporal directory. This is a patch. Sometimes we cannot delete the tmpDir
     */
    public String getOriginalTmpDir() { return originalTmpDir; }

    public void setOriginalTmpDir(String originalTmpDir) { this.originalTmpDir = originalTmpDir; }

    public void setTransformationQuery(TransformationQuery transQuery) {
        this.transQuery = transQuery;
    }

    public List<Transformation> getTransformations() {
        return transformations;
    }

    public AbstractBuilder getBuilder() {
        return builder;
    }

    public void setBuilder(AbstractBuilder builder) {
        this.builder = builder;
    }

    /**
     * Result directory
     */
    public String getResultDir() { return resultDir; }

    public void setResultDir(String resultDir) { this.resultDir = resultDir; }

    /**
     * Directory to copy sosies programs source code to.
     */

    public String getSocieSourcesDir() { return socieSourcesDir; }

    public void setSocieSourcesDir(String socieSourcesDir) {
        this.socieSourcesDir = socieSourcesDir;
    }

    protected List<Transformation> transformations;

    /**
     * Query to find transformations
     */
    protected TransformationQuery transQuery;
    /**
     * Build system to perform the build lifecycle
     */
    protected AbstractBuilder builder;

    /**
     * Runs the diversificator.
     * @param n Number of times the diversification process will run, i.e trials
     * @throws Exception
     */
    public abstract void run(int n) throws Exception;

    //protected abstract void run(Collection<Transformation> trans) throws Exception;

    /**
     *
     * @param output
     * @return
     */
    public String printResult(String output) {
        mkDirResult(output);
        String prefix = output + System.currentTimeMillis();
        String fileName = "";
        try {
            fileName = writeTransformations(prefix);
            Log.info("write result in {}", fileName);
        } catch (Exception e) {
            Log.error("error in Builder.printResult", e);
        }
        return fileName;
    }

    public void printResult(String output, String git) {
        String absoluteFileName = printResult(git + "/" + output);
        String fileName = absoluteFileName.substring(git.length() + 1, absoluteFileName.length());

        try {
            GitUtils gitUtils = new GitUtils("https://github.com/simonAllier/sosie-exp.git", git);
            gitUtils.pull();
            gitUtils.add(fileName);
            gitUtils.commit("test");
            gitUtils.push();
        } catch (IOException e) {

            e.printStackTrace();
        } catch (GitAPIException e) {
            e.printStackTrace();
        }

//        GitUtil.addToGit(tmp + "/", "*");
//        GitUtil.pushGit();
    }

    /**
     * Write found transformations to file.
     *
     * TODO: A sugestion, we should move this to AbstractQuery
     *
     * @param fileName File name where the transformations are going to be stored.
     * @throws IOException
     * @throws JSONException
     */
    public String writeTransformations(String fileName) throws IOException, JSONException {
        if (transformations.isEmpty())
            return "";

        TransformationsWriter write = new TransformationsWriter(transformations, fileName);
        return write.writeAllTransformation(null);
    }

    protected void mkDirResult(String output) {
        String[] tmp = output.split("/");
        String dirs = "";
        for (int i = 0; i < tmp.length - 1; i++) {
            dirs = dirs + tmp[i] + "/";
        }
        new File(dirs).mkdirs();
        Log.debug("mkdir: {}", dirs);
    }

    /**
     * Initializes de temporal directory to copy the sources of the sosiefied program
     *
     * @param dirProject Directory where the original program is. Is going to be copy to dirTarget
     * @param dirTarget  Directory where the diversified program is going to be after the transformation are run.
     *                   Transformations are applied to the source in dirTarget
     * @return
     * @throws IOException
     * @throws InterruptedException
     */
    public String init(String dirProject, String dirTarget) throws IOException, InterruptedException {
        originalTmpDir = dirTarget;
        tmpDir = dirTarget + "/tmp_" + System.currentTimeMillis();
        File dir = new File(tmpDir);
        dir.mkdirs();
        FileUtils.copyDirectory(new File(dirProject), dir);

        return tmpDir;
    }

    /**
     * Delete the temporal files that we have created
     */
    public void deleteTmpFiles() {
        try {
            org.codehaus.plexus.util.FileUtils.cleanDirectory(tmpDir);
            org.codehaus.plexus.util.FileUtils.forceDelete(tmpDir);
        } catch (IOException e) {
            try {
                init(projectDir, originalTmpDir);
            } catch (Exception e1) {
                throw new RuntimeException(e1);
            }
        }
    }

    protected Integer runTest(String directory) throws InterruptedException {
        Log.debug("run test in directory: {}", directory);
        builder.setDirectory(directory);
        builder.runBuilder();
        Log.info("status: " + builder.getStatus() + ", compile error: " + builder.getCompileError() + ", run all test: " + builder.allTestRun() + ", nb error: " + builder.getTestFail().size());
        return builder.getStatus();
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
                    Instru instru = new Instru(tmpDir, sourceDir, inputConfiguration.getProperty("testSrc"), destPath, transformations);
                    instru.instru(intruMethodCall, intruVariable, intruError, intruNewTest, intruAssert);
                } else {
                    org.codehaus.plexus.util.FileUtils.copyDirectory(new File(tmpDir), f);
                }

                FileWriter writer = new FileWriter(destPath + "/trans.json");
                for (Transformation t : transformations) {
                    writer.write(t.toJSONObject().toString() + "\n");
                }
                writer.close();

            }
        } catch (IOException e) {
            //We may also don't want to recover from here. If no instrumentation possible... now what?
            throw new RuntimeException(e);
        }
    }

}

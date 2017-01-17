package fr.inria.diversify.runner;

import fr.inria.diversify.bytecode.CompareBytecode;
import fr.inria.diversify.persistence.json.output.JsonTransformationWriter;
import fr.inria.diversify.statistic.AbstractSessionResults;
import fr.inria.diversify.buildSystem.AbstractBuilder;
import fr.inria.diversify.transformation.SingleTransformation;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.query.TransformationQuery;
import fr.inria.diversify.util.FileUtils;
import fr.inria.diversify.util.GitUtils;
import fr.inria.diversify.util.Log;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.json.JSONException;
import spoon.reflect.declaration.CtType;

import java.io.*;
import java.util.List;

/**
 * User: Simon
 * Date: 9/2/13
 * Time: 3:05 PM
 */
public abstract class AbstractRunner {

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
    private String sosieSourcesDir = null;

    private boolean android = false;


    /**
     * The original temporal directory. This is a patch. Sometimes we cannot delete the tmpDir
     */
    public String getOriginalTmpDir() { return originalTmpDir; }

    public void setOriginalTmpDir(String originalTmpDir) { this.originalTmpDir = originalTmpDir; }

    public String getTmpDir() {
        return tmpDir;
    }

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

    public String getSosieSourcesDir() { return sosieSourcesDir; }

    public void setSosieSourcesDir(String sosieSourcesDir) {
        this.sosieSourcesDir = sosieSourcesDir;
    }

    protected List<Transformation> transformations;

    /**
     * Query to find transformations
     */
    protected TransformationQuery transQuery;
    /**
     * Build system to perform the locate lifecycle
     */
    protected AbstractBuilder builder;

    /**
     * Runs the diversificator.
     * @param n Number of times the diversification process will run, i.e trials
     * @throws Exception
     */
    public abstract void run(int n) throws Exception;

    protected boolean compareByteCode(Transformation transformation) throws Exception {
        if(transformation instanceof SingleTransformation) {
            SingleTransformation singleTransformation = (SingleTransformation) transformation;
            CtType mainType = singleTransformation.getPosition().getCompilationUnit().getMainType();

            InputProgram inputProgram = inputConfiguration.getInputProgram();

            String originalClass = inputProgram.getProgramDir() + "/" + inputProgram.getClassesDir() + "/" + mainType.getQualifiedName().replace(".", "/") + ".class";
            String sosieClass = tmpDir + "/" + inputProgram.getClassesDir() + "/" + mainType.getQualifiedName().replace(".", "/") + ".class";

            CompareBytecode compareBytecode = new CompareBytecode(originalClass, sosieClass);
            return compareBytecode.equals(singleTransformation.methodLocationName());
        }
        return true;
    }

    /**
     *
     * @param output
     * @return
     */
    public String printResult(String output) {
        return printResult(output, false);
    }

    public String printResult(String output, boolean sp) {
        Log.info("session result: {}", sessionResults);
        mkDirResult(output);
        String prefix = output + System.currentTimeMillis();
        String fileName = "";
        try {
            if(sp)
                fileName = writeTransformationsIntoSpecificFile(output);
            else
                fileName = writeTransformations(prefix);
            Log.info("write result in {}", fileName);
        } catch (Exception e) {
            Log.error("error in Builder.printResult", e);
        }
        return fileName;
    }

    public void printResultInGitRepo(String output, String git) {
        String absoluteFileName = printResult(git + "/" + output);
        String fileName = absoluteFileName.substring(git.length() + 1, absoluteFileName.length());
        Log.info("add dir {} in git", fileName);
        try {
            GitUtils gitUtils = new GitUtils(git);
            gitUtils.pull();
            gitUtils.add(fileName);
            gitUtils.commit("update");
            gitUtils.push();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (GitAPIException e) {
            e.printStackTrace();
        }
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

        JsonTransformationWriter writer = new JsonTransformationWriter();
        writer.write(transformations, fileName + ".json", inputConfiguration.getInputProgram().getProgramDir() + "/pom.xml");
        return fileName + ".json";
    }

    public String writeTransformationsIntoSpecificFile(String fileName) throws IOException, JSONException {
        if (transformations.isEmpty())
            return "";

        JsonTransformationWriter writer = new JsonTransformationWriter();
        writer.write(transformations, fileName, inputConfiguration.getInputProgram().getProgramDir() + "/pom.xml");
        return fileName;
    }

    protected void mkDirResult(String output) {
        String dirs = "";
        if(output.endsWith("/")) {
            dirs = output;
        } else {
            String[] tmp = output.split("/");

            for (int i = 0; i < tmp.length - 1; i++) {
                dirs = dirs + tmp[i] + "/";
            }
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
            FileUtils.cleanDirectory(new File(tmpDir));
            FileUtils.forceDelete(new File(tmpDir));
        } catch (IOException e) {
            try {
                init(projectDir, originalTmpDir);
            } catch (Exception e1) {
                throw new RuntimeException(e1);
            }
        }
    }

    protected Integer runTest(String directory) throws InterruptedException {
        int status;

        Log.debug("run test in directory: {}", directory);
        builder.setDirectory(directory);
        builder.runBuilder();
        Log.info("status: " + builder.getStatus() + ", compile error: " + builder.getCompileError() + ", run all test: " + builder.allTestRun() + ", nb error: " + builder.getFailedTests().size());
        status = builder.getStatus();

        return status;
    }

    protected String getSosieDestinationPath() {
        return getSosieSourcesDir() + "/" + sessionResults.getBeginTime() + "_trial_" + trial;
    }

    protected void tryRestore(Transformation trans, Exception e) throws Exception {
        try {
            trans.restore(tmpDir + "/" + sourceDir);
        } catch (Exception restore) {
            e.printStackTrace();
            Log.debug("");
        }
        int status = runTest(tmpDir);
        if (status != 0) {
            throw new Exception(e);
        }
    }

    public void setAndroid(boolean android) {
        this.android = android;
    }
}

package fr.inria.diversify.diversification;

import fr.inria.diversify.transformation.*;
import fr.inria.diversify.buildSystem.AbstractBuilder;
import fr.inria.diversify.transformation.query.TransformationQuery;
import fr.inria.diversify.util.GitUtil;
import fr.inria.diversify.util.Log;
import org.apache.commons.io.FileUtils;
import org.json.JSONException;

import java.io.*;
import java.util.Collection;
import java.util.List;

/**
 * User: Simon
 * Date: 9/2/13
 * Time: 3:05 PM
 */
public abstract class AbstractDiversify {
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

    public abstract void run(int n) throws Exception;

    protected abstract void run(Collection<Transformation> trans) throws Exception;

    /**
     *
     * @param output
     * @return
     */
    public String printResult(String output) {
        mkDirResult(output);
        String fileName = output + System.currentTimeMillis();// + "_transformation.json";
        try {
            writeTransformations(fileName);
            Log.info("write result in {}", fileName);
        } catch (Exception e) {
            Log.error("error in Builder.printResult", e);
        }
        return fileName;
    }

    public void printResult(String output, String git) {
        String absoluteFileName = printResult(git + "/" + output);

        String[] split = absoluteFileName.split("/");
        String tmp = split[0];
        for (int i = 1; i < split.length - 1; i++) {
            tmp = tmp + "/" + split[i];
        }
        Log.debug(tmp + "/   " + split[split.length - 1]);
        GitUtil.addToGit(tmp + "/", "*");
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
    public void writeTransformations(String fileName) throws IOException, JSONException {
        if (transformations.isEmpty())
            return;

        TransformationsWriter write = new TransformationsWriter(transformations, fileName);
        write.writeAllTransformation(null);
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
        tmpDir = dirTarget + "/tmp_" + System.currentTimeMillis();
        File dir = new File(tmpDir);
        dir.mkdirs();
        FileUtils.copyDirectory(new File(dirProject), dir);

        return tmpDir;
    }

    protected Integer runTest(String directory) throws InterruptedException, CompileException, InstantiationException, IllegalAccessException {
        Log.debug("run test in directory: {}", directory);
        builder.setDirectory(directory);
        builder.runBuilder();
        Log.info("status: " + builder.getStatus() + ", compile error: " + builder.getCompileError() + ", run all test: " + builder.allTestRun() + ", nb error: " + builder.getErrors().size());
        if (builder.getCompileError()) {
            throw new CompileException("compile error in maven");
        }
        return builder.getStatus();
    }



}

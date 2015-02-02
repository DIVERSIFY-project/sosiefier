package fr.inria.diversify.diversification;

import fr.inria.diversify.buildSystem.maven.MavenBuilder;
import fr.inria.diversify.statistic.SinglePointSessionResults;
import fr.inria.diversify.testamplification.CompareAmpliTest;
import fr.inria.diversify.testamplification.compare.diff.TestDiff;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.transformation.ast.exception.ApplyTransformationException;
import fr.inria.diversify.transformation.ast.exception.BuildTransplantException;
import fr.inria.diversify.util.Log;
import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Simon on 21/01/15.
 */
public class DiversifyAndCompare extends SinglePointDiversify {
    protected String amplifiedTestDir;
    protected String originalLogDir;
    protected InputProgram inputProgram;
    protected String testSrcDir;
    protected List<JSONObject> diff;
    protected String filterFile;

    public DiversifyAndCompare(InputConfiguration inputConfiguration, String projectDir, String srcDir, String testDir) {
        super(inputConfiguration, projectDir, srcDir);
        testSrcDir = testDir;
        diff = new ArrayList<>();
    }

    protected void run(Transformation trans) throws Exception {
        Log.info("trial {}", trial);
        Log.debug("output dir: " + tmpDir + "/" + sourceDir);
        writePosition(tmpDir + "/transplant.json", (ASTTransformation) trans);

        try {
            applyTransformation(trans);

            try {
                transformations.add(trans);
                int status = runTest(tmpDir);

                trans.setStatus(status);
                trans.setFailures(builder.getTestFail());
                if (status == 0) {
                    compare(trans);
                }
                // error during runTest
            } catch (Exception e) {
                trans.setStatus(-2);
                Log.debug("compile error during diversification", e);
            }

            trial++;
            trans.restore(tmpDir + "/" + sourceDir);

            ((SinglePointSessionResults) sessionResults).addRunResults(trans);
        } catch (ApplyTransformationException e) {
            tryRestore(trans,e);
            e.printStackTrace();
        } catch (BuildTransplantException e) {}
    }

    protected void compare(Transformation trans) throws IOException, JSONException, InterruptedException {
        String sosieDir = copySosieProgram();
        copyTestAndLogger(sosieDir);
        runSosie(sosieDir);
        CompareAmpliTest cat = new CompareAmpliTest();

        List<TestDiff> result = cat.compare(originalLogDir, sosieDir + "/log");
        try {
            Map<String, Set<String>> filter = cat.loadFilter(filterFile);
            cat.filter(result,filter);

            diff.add(cat.toJson(result, trans));
        } catch (Exception e) {
            Log.debug("");
        } finally {
            FileUtils.forceDelete(new File(sosieDir));
        }

    }

    protected void copyTestAndLogger(String sosieDir) throws IOException {
        File log = new File(sosieDir + "/log");
        log.mkdir();
        File id = new File(sosieDir + "/log/id");
        id.createNewFile();

        FileUtils.copyDirectory(new File(amplifiedTestDir), new File(sosieDir + "/" +testSrcDir));
        File dir = new File(sosieDir+"/"+sourceDir+ "/fr/inria/diversify/testamplification/logger");
        FileUtils.forceMkdir(dir);
        String packagePath = System.getProperty("user.dir") + "/generator/src/main/java/fr/inria/diversify/testamplification/logger/";
        FileUtils.copyFileToDirectory(new File(packagePath + fr.inria.diversify.testamplification.logger.Logger.class.getSimpleName() + ".java"), dir);
        FileUtils.copyFileToDirectory(new File(packagePath + fr.inria.diversify.testamplification.logger.ShutdownHookLog.class.getSimpleName() + ".java"), dir);
        FileUtils.copyFileToDirectory(new File(packagePath + fr.inria.diversify.testamplification.logger.LogWriter.class.getSimpleName() + ".java"),dir);
        FileUtils.copyFileToDirectory(new File(packagePath + fr.inria.diversify.testamplification.logger.AssertLogWriter.class.getSimpleName() + ".java"),dir);
    }

    protected void runSosie(String sosieDir) throws IOException, InterruptedException {
        MavenBuilder builder = new MavenBuilder(sosieDir);
        builder.runGoals(new String[]{"clean", "test"}, false);
    }

    public void setAmplifiedTestDir(String amplifiedTestDir) {
        this.amplifiedTestDir = amplifiedTestDir;
    }

    public void setOriginalLogDir(String originalLogDir) {
        this.originalLogDir = originalLogDir;
    }

    public void setFilterFile(String filterFile) {
        this.filterFile = filterFile;
    }

    public String printResult(String output) {
        mkDirResult(output);
        String fileName = "";
        try {
            fileName = output + System.currentTimeMillis() + ".json";
            for(JSONObject d : diff) {
                FileWriter fw = new FileWriter(fileName);
                d.write(fw);
                fw.close();
            }

            Log.info("write result in {}", fileName);
        } catch (Exception e) {
            Log.error("error in Builder.printResult", e);
        }
        return fileName;
    }
}

package fr.inria.diversify.diversification;

import fr.inria.diversify.buildSystem.maven.MavenBuilder;
import fr.inria.diversify.statistic.SinglePointSessionResults;
import fr.inria.diversify.testamplification.CompareAmpliTest;
import fr.inria.diversify.testamplification.compare.diff.Diff;
import fr.inria.diversify.testamplification.compare.diff.Pool;
import fr.inria.diversify.testamplification.compare.diff.TestDiff;
import fr.inria.diversify.transformation.NullTransformation;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.transformation.ast.exception.ApplyTransformationException;
import fr.inria.diversify.transformation.ast.exception.BuildTransplantException;
import fr.inria.diversify.util.Log;
import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.util.*;

/**
 * Created by Simon on 21/01/15.
 */
public class DiversifyAndCompare extends SinglePointDiversify {
    protected String amplifiedTestDir;
    protected String originalLogDir;
    protected String testSrcDir;
    protected List<JSONObject> diff;
    protected Map<String, Set<String>> filter;
    protected String filterFile;

    public DiversifyAndCompare(InputConfiguration inputConfiguration, String projectDir, String srcDir, String testDir, String filterFile) {
        super(inputConfiguration, projectDir, srcDir);
        testSrcDir = testDir;
        diff = new ArrayList<>();
        this.filterFile = filterFile;

    }

    private void initFilter() throws Exception {
        Transformation trans = new NullTransformation();
        try {
            applyTransformation(trans);

            try {
                int status = runTest(tmpDir);

                trans.setStatus(status);
                trans.setFailures(builder.getTestFail());
                if (status == 0) {
                    compare(trans, true);
                }
                // error during runTest
            } catch (Exception e) {
                trans.setStatus(-2);
                Log.debug("compile error during diversification", e);
            }
        } catch (Exception e) {}
    }

    @Override
    public void run(int n) throws Exception {
        initFilter();
        if(n > 0) {
            for (int i = 0; i < n; i++) {
                run(transQuery.query());
            }
        } else {
            while (transQuery.hasNextTransformation()) {
                run(transQuery.query());
            }
        }
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
                    compare(trans, false);
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

    protected void compare(Transformation sosie, boolean makeFilter) throws IOException, JSONException, InterruptedException {
        String sosieDir = copySosieProgram();
        try {
            copyTestAndLogger(sosieDir);
            runSosie(sosieDir);
//
//            File log = new File(sosieDir + "/log/");
//            FileUtils.forceDelete(log);
//            log.mkdir();
//            (new File(log +"/id")).createNewFile();
//            runSosie(sosieDir);

            CompareAmpliTest cat = new CompareAmpliTest();

            Diff result = cat.compare(originalLogDir, sosieDir + "/log");

            if(makeFilter) {
                filter = cat.loadFilter(filterFile);
                for(String f : result.buildFilter()) {
                    String[] tmp = f.split(" ");
                    if(!filter.containsKey(tmp[0])) {
                        filter.put(tmp[0], new HashSet<>());
                    }
                    filter.get(tmp[0]).add(f.substring(tmp[0].length() + 1,f.length()));
                }
            } else {
                result.filter(filter);
                result.setSosie(sosie);
                diff.add(result.toJson());
            }
        } finally {
            Pool.reset();
            FileUtils.forceDelete(new File(sosieDir));
        }

    }

    protected void copyTestAndLogger(String sosieDir) throws IOException {
        File log = new File(sosieDir + "/log");
        log.mkdir();
        File id = new File(sosieDir + "/log/id");
        id.createNewFile();
        File testDir = new File(sosieDir + "/" +testSrcDir);
        FileUtils.forceDelete(testDir);

        testDir.mkdirs();

        FileUtils.copyDirectory(new File(amplifiedTestDir), testDir);
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

//    public void setFilterFile(String filterFile) {
//        this.filterFile = filterFile;
//    }

    public String printResult(String output) {
        Log.info("session result: {}", sessionResults);
        mkDirResult(output);
        String fileName = "";
        try {
            int i = 0;
            for(JSONObject d : diff) {
                fileName = output + System.currentTimeMillis() +i+ ".json";
                FileWriter fw = new FileWriter(fileName);
                d.write(fw);
                fw.close();
                i++;
                Log.info("write diff in {}", fileName);
            }


        } catch (Exception e) {
            Log.error("error in Builder.printResult", e);
        }
        String[] tmp = output.split("/");
        String ret = "";
        for (int i = 0; i< tmp.length -1; i++) {
            ret +=  tmp[i] + "/";
        }
        return ret;
    }

    public Set<String> loadFilter(String file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        Set<String> filter = new HashSet<>();

        String line = reader.readLine();
        while(line != null) {
            filter.add(line);
            line = reader.readLine();
        }
        return filter;
    }
}

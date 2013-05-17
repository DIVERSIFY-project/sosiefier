package fr.inria.diversify.replace;

import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.runtest.CoverageReport;
import fr.inria.diversify.statistic.StatisticDiversification;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.Factory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * User: Simon
 * Date: 5/2/13
 * Time: 5:39 PM
 */
public class Diversify {

    protected String sourceDir;
    protected String tmpDir;
    protected CodeFragmentList codeFragments;
    protected Factory factory;
    protected CoverageReport coverageReport;
    private List<Transformation> transformations;

    public Diversify(CodeFragmentList codeFragments, CoverageReport coverageReport, String sourceDir, String tmpDir) {
        this.coverageReport = coverageReport;
        this.codeFragments = codeFragments;
        this.factory = codeFragments.getCodeFragments().get(0).getCtCodeFragment().getFactory();
        this.tmpDir = tmpDir;
        transformations = new ArrayList<Transformation>();
        this.sourceDir = sourceDir;
    }

    public void run(int n) throws Exception {
        prepare(sourceDir, tmpDir);
        for (int i = 1; i < n; i++) {
            System.out.println(i);

            Replace rp = new Replace(codeFragments, coverageReport, tmpDir);
            try {
                Transformation tf = rp.replace();
                tf.setJUnitResult(runTest(tmpDir));
                transformations.add(tf);
            }
            catch (Exception e) {}

            rp.restore();

            if(i%100 == 0) {
                try {
                    writeTransformation("transformation/transformation_"+System.currentTimeMillis()+".json");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
               transformations = new ArrayList<Transformation>();
            }
        }
        StatisticDiversification stat = new StatisticDiversification(transformations, 191);
        stat.writeStat();
    }

    public void writeTransformation(String FileName) throws IOException, JSONException {
        BufferedWriter out = new BufferedWriter(new FileWriter(FileName));

        for (int i = 0; i < transformations.size(); i++) {
            JSONObject obj = new JSONObject();
            obj.put("Transformation_" + i, transformations.get(i).toJSONObject());
            out.write(obj.toString());
            out.newLine();
        }
        out.close();
    }

    protected void prepare(String dirSource, String dirTarget) throws IOException, InterruptedException {
        Runtime r = Runtime.getRuntime();
        Process p = r.exec("cp -r " + dirSource + " " + dirTarget);
        p.waitFor();
    }

    protected List<String> runTest(String directory) throws InterruptedException, CompileException {
        RunMavenTest rt = new RunMavenTest(directory);
        rt.start();
        int count = 0;
        while (rt.getResult() == null && count < 100) {
            count++;
            Thread.sleep(1000);
        }
        rt.stop();
        if(rt.getCompileError())
            throw new CompileException("error");
        return rt.getResult();
    }
}

package fr.inria.diversify.replace;

import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.runtest.CoverageReport;
import fr.inria.diversify.runtest.RunTest;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.runner.Result;
import spoon.processing.ProcessingManager;
import spoon.reflect.Factory;
import spoon.support.JavaOutputProcessor;
import spoon.support.QueueProcessingManager;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

/**
 * User: Simon
 * Date: 5/2/13
 * Time: 5:39 PM
 */
public class Diversify {


    protected String tmpDir;
    protected CodeFragmentList codeFragments;
    protected Factory factory;
    protected CoverageReport coverageReport;
    List<String> classPath;
    private List<Transformation> transformations;

    public Diversify(CodeFragmentList codeFragments, CoverageReport coverageReport, String testDirectory) {
        this.coverageReport = coverageReport;
        this.codeFragments = codeFragments;
        this.factory = codeFragments.getCodeFragments().get(0).getCtCodeFragment().getFactory();
        this.tmpDir = "output";
        transformations = new ArrayList<Transformation>();

        classPath = new ArrayList<String>();
        classPath.add(System.getProperty("user.dir") + "/" + tmpDir + "_diversify/");
        classPath.add(testDirectory);
    }

    public void run(int n) throws IOException, CompileException {
        try {
            printJavaFile(tmpDir);
            printJavaFile(tmpDir + "_diversify");
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(i);
            Replace rp = new Replace(codeFragments, coverageReport, tmpDir + "_diversify");
            try {
                Transformation tf = rp.replace();
                tf.setJUnitResult(runTest("tests.AllTests"));
                transformations.add(tf);
            } catch (Exception e) {
                e.printStackTrace();
            }
            rp.restore();
        }
    }

    public void writeTransformation(String FileName) throws IOException, JSONException {
        BufferedWriter out = new BufferedWriter(new FileWriter(FileName));

        for(int i = 0 ; i < transformations.size(); i++) {
            JSONObject obj = new JSONObject();
            obj.put("Transformation_"+i, transformations.get(i).toJSONObject());
            out.write(obj.toString());
            out.newLine();
        }
        out.close();
    }

    protected Result runTest(String className) throws MalformedURLException, ClassNotFoundException {
        RunTest runTest = new RunTest(className, classPath);
        return runTest.run();
    }

    protected void printJavaFile(String repository) throws IOException {
        ProcessingManager pm = new QueueProcessingManager(factory);
        JavaOutputProcessor processor = new JavaOutputProcessor(new File(repository));

        pm.addProcessor(processor);
        pm.process();
    }

    public void setTmpDirectory(String tmp) {
        tmpDir = tmp;
    }
}

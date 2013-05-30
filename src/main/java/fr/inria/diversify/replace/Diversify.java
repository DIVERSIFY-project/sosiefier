package fr.inria.diversify.replace;

import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.runtest.CoverageReport;
import org.json.JSONArray;
import org.json.JSONException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * User: Simon
 * Date: 5/2/13
 * Time: 5:39 PM
 */
public class Diversify {

    protected String sourceDir;
    protected String tmpDir;
    protected CodeFragmentList codeFragments;
    protected CoverageReport coverageReport;
    protected List<Transformation> transformations;
    protected Set<Thread> threadSet;

    public Diversify(CodeFragmentList codeFragments, CoverageReport coverageReport, String sourceDir, String tmpDir) {
        this.coverageReport = coverageReport;
        this.codeFragments = codeFragments;
        this.tmpDir = tmpDir;

        this.sourceDir = sourceDir;
    }

    public void run(int n) throws Exception {
        transformations = new ArrayList<Transformation>();
        int error = 0;
        String dir = prepare(sourceDir, tmpDir);
        System.out.println("dir "+ dir);
        for (int i = 0; i < n; i++) {
            System.out.println(i);
            initThreadGroup();

            Replace rp = new Replace(codeFragments, coverageReport, dir);
            try {
                Transformation tf = rp.replace();
                List<String> errors = runTest(dir);
                tf.setJUnitResult(errors);
                transformations.add(tf);
            }
            catch (Exception e) {
                System.out.println("compile error "+(error++));
            }
            rp.restore();
            killUselessThread();

        }
    }

    public void printResult(String output) {
        try {
            writeTransformation(output + "_transformation.json");
        } catch (Exception e) {
            e.printStackTrace();
        }
//        StatisticDiversification stat = new StatisticDiversification(transformations);
//        stat.writeStat(output);
    }

    public void writeTransformation(String FileName) throws IOException, JSONException {
        if(transformations.isEmpty())
            return;
        BufferedWriter out = new BufferedWriter(new FileWriter(FileName));
        JSONArray obj = new JSONArray();
        for (int i = 0; i < transformations.size(); i++) {
            try {
                obj.put(transformations.get(i).toJSONObject());
            } catch (Exception e) {}
        }
        out.write(obj.toString());
        out.newLine();
        out.close();
    }

    protected String prepare(String dirSource, String dirTarget) throws IOException, InterruptedException {
        String dir = dirTarget + "/tmp_" + System.currentTimeMillis();
        copyDirectory(new File(dirSource), new File(dir));
        return dir;
    }

    protected List<String> runTest(String directory) throws InterruptedException, CompileException {
        RunMaven rt = new RunMaven(directory, "test");
        rt.start();
        int count = 0;
        while (rt.getResult() == null && count < 30) {
            count++;
            Thread.sleep(1000);
        }
        System.out.println("compile error: "+rt.getCompileError());
        System.out.println("all test run: "+rt.allTestRun());
        if(rt.getCompileError())
            throw new CompileException("error ");

        return rt.getResult();
    }

    protected void initThreadGroup() {
        threadSet = Thread.getAllStackTraces().keySet();
    }

    protected void killUselessThread() {
        for(Thread thread: Thread.getAllStackTraces().keySet())  {
            if(!threadSet.contains(thread)) {
                thread.stop();
            }
        }
    }

    protected void copyDirectory(File sourceLocation , File targetLocation) throws IOException {
        if (sourceLocation.isDirectory()) {
            if (!targetLocation.exists()) {
                targetLocation.mkdir();
            }

            String[] children = sourceLocation.list();
            for (int i=0; i<children.length; i++) {
                copyDirectory(new File(sourceLocation, children[i]),
                        new File(targetLocation, children[i]));
            }
        } else {

            InputStream in = new FileInputStream(sourceLocation);
            OutputStream out = new FileOutputStream(targetLocation);

            // Copy the bits from instream to outstream
            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
            in.close();
            out.close();
        }
    }
}

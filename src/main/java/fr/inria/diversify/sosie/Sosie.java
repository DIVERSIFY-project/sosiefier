package fr.inria.diversify.sosie;

import fr.inria.diversify.transformation.CompileException;
import fr.inria.diversify.transformation.RunMaven;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.query.AbstractTransformationQuery;
import org.codehaus.plexus.util.FileUtils;
import org.json.JSONException;

import java.io.*;
import java.util.Set;

/**
 * User: Simon
 * Date: 7/22/13
 * Time: 10:20 AM
 */
public class Sosie {

    protected String projectDir;
    protected String tmpDir;
    protected Set<Thread> threadSet;
    protected String srcDir;
    protected AbstractTransformationQuery transQuery;
    protected int timeOut;

    public Sosie(AbstractTransformationQuery transQuery, String projectDir) {
        this.transQuery = transQuery;
        this.tmpDir = "output_sosie";
        this.projectDir = projectDir;
    }

    public void run(int n) throws Exception {
        File dir = new File(tmpDir);
        if(!dir.exists())
            dir.mkdirs();
        for (int i = 0; i < n; i++) {
            System.out.println(i);
            run(transQuery.getTransformation());
        }
    }

    protected void run(Transformation trans) throws Exception {
        initThreadGroup();
        String dir = prepare(projectDir, tmpDir);
        System.out.println("output dir sosie: " + dir + "/" + srcDir);
        try {
            trans.apply(dir + "/" + srcDir);
            if(runTest(dir) != 0) {
                FileUtils.cleanDirectory(dir);
                FileUtils.forceDelete(dir);
            }
            else {
                FileWriter fileWriter = new FileWriter(dir +"/diversificationPoint");
                fileWriter.append(trans.positionString());
                fileWriter.close();
            }
        } catch (Exception e) {
            System.out.println("compile error ");
            FileUtils.cleanDirectory(dir);
            FileUtils.forceDelete(dir);
        }
        killUselessThread();
    }

    protected String prepare(String dirSource, String dirTarget) throws IOException, InterruptedException {
        String dir = dirTarget + "/tmp_" + System.currentTimeMillis();
        copyDirectory(new File(dirSource), new File(dir));
//        copyDirectory(new File(dirSource), new File(dir));
        return dir;
    }



    protected Integer runTest(String directory) throws InterruptedException, CompileException {
        RunMaven rt = new RunMaven(directory, "test", false);
        rt.start();
        int count = 0;
        while (rt.getFailures() == null && count < timeOut) {
            count++;
            Thread.sleep(1000);
        }
        if (rt.getCompileError())
            throw new CompileException("error ");

        if (!rt.allTestRun())
            return -1;
        return rt.getFailures();
    }

    protected void initThreadGroup() {
        threadSet = Thread.getAllStackTraces().keySet();
    }

    protected void killUselessThread() {
        for (Thread thread : Thread.getAllStackTraces().keySet()) {
            if (!threadSet.contains(thread)) {
                thread.stop();
            }
        }
    }

    protected void copyDirectory(File sourceLocation, File targetLocation) throws IOException {
        if (sourceLocation.isDirectory()) {
            if (!targetLocation.exists()) {
                targetLocation.mkdir();
            }

            String[] children = sourceLocation.list();
            for (String aChildren : children) {
                copyDirectory(new File(sourceLocation, aChildren),
                        new File(targetLocation, aChildren));
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

    public void setTmpDirectory(String tmpDir) {
        this.tmpDir = tmpDir;
    }

    public void setTimeOut(int timeOut) {
        this.timeOut = timeOut;
    }

    public void setSourceDirectory(String sourceDirectory) {
        this.srcDir = sourceDirectory;
    }
}

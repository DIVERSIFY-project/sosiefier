package fr.inria.diversify.diversification;

import fr.inria.diversify.transformation.*;
import fr.inria.diversify.transformation.query.ITransformationQuery;
import fr.inria.diversify.util.GitUtil;
import fr.inria.diversify.util.Log;
import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import spoon.reflect.declaration.CtSimpleType;

import java.io.*;
import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * User: Simon
 * Date: 9/2/13
 * Time: 3:05 PM
 */
public abstract class Builder {
    protected String projectDir;
    protected String tmpDir;
    protected List<ITransformation> transformations;
    protected Set<Thread> threadSet;
    protected String workingDir;
    protected boolean clojureTest;
    protected int timeOut;
    protected ITransformationQuery transQuery;
    protected String newPomFile;


    public abstract void run(int n) throws Exception;

    public abstract void run(Set<ITransformation> trans) throws Exception;

    public void printResult(String output, String git) {
        mkDirResult(output,git);
        String fileName = output + System.currentTimeMillis() + "_transformation.json";
        String absoluteFileName = git + "/" + fileName;
        try {
            writeTransformation(absoluteFileName);
            Log.info("write result in {}", fileName);
        } catch (Exception e) {
            Log.error("error in Builder.printResult", e);
        }
        if(!git.equals("")) {

            String[] split = absoluteFileName.split("/");
            String tmp = split[0];
            for (int i = 1;i < split.length - 1; i++) {
                tmp = tmp + "/" + split[i];
            }

            Log.debug(tmp+"/   "+split[split.length - 1]);
            GitUtil.addToGit(tmp+"/", "*");
        }
//        StatisticDiversification stat = new StatisticDiversification(transformations);
//        stat.writeStat(output);
    }

    public void writeTransformation(String fileName) throws IOException, JSONException {
        if (transformations.isEmpty())
            return;

        TransformationsWriter write = new TransformationsWriter(transformations,fileName);
        write.writeAllTransformation(null);
    }

    protected void mkDirResult(String output, String git) {
        String[] tmp = output.split("/");
        String dirs = git +"/";
        for (int i = 0; i< tmp.length - 1;i++) {
            dirs = dirs + tmp[i] + "/";
        }
        new File(dirs).mkdirs();
        Log.debug("mkdir: {}",dirs);
    }

    protected String prepare(String dirSource, String dirTarget, String newPomFile) throws IOException, InterruptedException {
        String dirName = dirTarget + "/tmp_" + System.currentTimeMillis();
        File dir = new File(dirName);
        dir.mkdirs();
        copyDirectory(new File(dirSource), dir);
        if(newPomFile != "")
            FileUtils.copyFileToDirectory(new File(newPomFile),dir);

        return dirName;
    }

    protected Integer runTest(String directory) throws InterruptedException, CompileException {
        RunMaven rt = new RunMaven(directory, getMavenPhase(), timeOut,clojureTest);
        rt.start();
        rt.join(1000 * timeOut);

        Log.info("compile error: " + rt.getCompileError() + ", run all test: " + rt.allTestRun() + ", number of failure: " + rt.getFailures());
        if (rt.getCompileError()) {
            throw new CompileException("compile error in maven");
        }

        if (!rt.allTestRun())
            return -1;
        return rt.getFailures();
    }

    protected abstract String[] getMavenPhase();

    public void initTimeOut() throws InterruptedException {
        initThreadGroup();
        RunMaven rt = new RunMaven(projectDir, new String[]{"clean", "test"}, 0, clojureTest);
        rt.start();
        timeOut = 0;
        int factor = 12;
        while (rt.getFailures() == null) {
            timeOut = timeOut + factor;
            Thread.sleep(1000);
        }
        Log.debug("timeOut init: " + timeOut);
        killUselessThread();
    }

    protected void initThreadGroup() {
        threadSet = Thread.getAllStackTraces().keySet();
    }

    protected void killUselessThread() {
        killAllChildrenProcess();
        for (Thread thread : Thread.getAllStackTraces().keySet()) {
            if (!threadSet.contains(thread)) {
                thread.stop();
            }
        }
    }

    protected void killAllChildrenProcess() {
        String pid = ManagementFactory.getRuntimeMXBean().getName().split("@")[0];
        Log.debug("PID :"+pid);
        Runtime r = Runtime.getRuntime();
        try {
//            findAllChildrenProcessOSX();
            r.exec("pkill -P " +pid);
//            killAllChildrenProcess2();

            Thread.sleep(1000);
        } catch (Exception e) {
            Log.error("killallchildren ",e);
        }
        Log.debug("all children process kill");
    }

    protected void killAllChildrenProcess2() throws IOException, InterruptedException {
        Runtime r = Runtime.getRuntime();
        for(String pid : findAllChildrenProcessUNIX()) {
            r.exec("kill -9 "+pid);
        }
    }

    protected List<String> findAllChildrenProcessUNIX() {
        String pid = ManagementFactory.getRuntimeMXBean().getName().split("@")[0];
        Log.debug("PID :"+pid);
        Runtime r = Runtime.getRuntime();
        List<String> list = new ArrayList<String>();
        try {
            Process p = r.exec("pstree -p "+ pid +" | grep -o '([0-9]\\+)' | grep -o '[0-9]\\+'") ;
            BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;

            while ((line = input.readLine()) != null) {
                if(!line.equals(pid))
                    list.add(pid);
            }
            input.close();
        } catch (Exception e) {
        }
        return list;
    }

    protected List<String> findAllChildrenProcessOSX() {
        Pattern pattern = Pattern.compile("\\s*(\\d+).+");
        String pid = ManagementFactory.getRuntimeMXBean().getName().split("@")[0];
        Runtime r = Runtime.getRuntime();
        List<String> list = new ArrayList<String>();
        try {
            Log.debug("sh script/pstree.sh "+ pid);
            Process p = r.exec("sh script/pstree.sh "+ pid) ;
            BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;

            while ((line = input.readLine()) != null) {
                Log.debug(line);
                Matcher matcher = pattern.matcher(line);
                if(!line.equals(matcher.group(1)))
                    list.add(matcher.group(1));
            }
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
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

    public void setClojureTest(boolean clojureTest) {
        this.clojureTest = clojureTest;
    }

    public void setTimeOut(int timeOut) {
        this.timeOut = timeOut;
    }

    public void setSourceDirectory(String sourceDirectory) {
        this.workingDir = sourceDirectory;
    }

    public void setNewPomFile(String pom) {
        newPomFile = pom;
    }

    public void setTransformationQuery(ITransformationQuery transQuery) {
        this.transQuery = transQuery;
    }

    public List<ITransformation> getTransformations() {return transformations;}
}

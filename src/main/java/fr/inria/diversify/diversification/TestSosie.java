package fr.inria.diversify.diversification;

import fr.inria.diversify.diversification.Builder;
import fr.inria.diversify.transformation.CompileException;
import fr.inria.diversify.transformation.RunMaven;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.query.AbstractTransformationQuery;
import fr.inria.diversify.util.Log;
import org.codehaus.plexus.util.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * User: Simon
 * Date: 9/2/13
 * Time: 2:39 PM
 */
public class TestSosie extends Builder {
    protected List<String> mavenProjects;

    public TestSosie(AbstractTransformationQuery transQuery, String projectDir) {
        this.transQuery = transQuery;
        this.tmpDir = "output_sosie";
        this.projectDir = projectDir;
        transformations = new ArrayList<Transformation>();

        clojureTest = false;
    }

    protected Integer runTest(String directory) throws InterruptedException, CompileException {
        if(PrunTest(directory) != 0)
            return -1;

        try {
            FileUtils.copyFile(new File(directory + "/target/junit-4.12-SNAPSHOT.jar"), new File(tmpDir+"/junit.jar"));
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
        for(String project: mavenProjects)
            if(PrunTest(project) != 0)
                return -1;

        return 0;
    }

    protected Integer PrunTest(String directory) throws InterruptedException, CompileException {
        RunMaven rt = new RunMaven(directory, "package",timeOut, clojureTest);
        rt.start();
        int count = 0;
        while (rt.getFailures() == null && count < timeOut) {
            count++;
            Thread.sleep(1000);
        }
        Log.debug("compile error: " + rt.getCompileError() + ", run all test" + rt.allTestRun() + ", number of failure" + rt.getFailures());        if (rt.getCompileError())
            throw new CompileException("error ");

        if (!rt.allTestRun())
            return -1;
        return rt.getFailures();
    }

    @Override
    public void run(int n) throws Exception {
        File dir = new File(tmpDir);
        if(!dir.exists())
            dir.mkdirs();
        for (int i = 0; i < n; i++) {
            Log.debug("diversification number: " + i);
            run(transQuery.getTransformation());
        }
    }

    @Override
    public void run(List<Transformation> trans) throws Exception {
        for (Transformation tran : trans)
            run(tran);
    }

    protected void run(Transformation trans) throws Exception {
        initThreadGroup();
        String dir = prepare(projectDir, tmpDir);
        Log.debug("output dir sosie: " + dir + "/" + srcDir);
        try {
            trans.apply(dir + "/" + srcDir);
            if(runTest(dir) != 0) {
                FileUtils.cleanDirectory(dir);
                FileUtils.forceDelete(dir);
            }
            else {
                transformations.add(trans);
            }
        } catch (Exception e) {
            Log.warn("compile error during diversification", e);
            FileUtils.cleanDirectory(dir);
            FileUtils.forceDelete(dir);
        }
        killUselessThread();
    }

    public void setMavenProject(List<String> mavenProjects) {
        this.mavenProjects = mavenProjects;
    }
}
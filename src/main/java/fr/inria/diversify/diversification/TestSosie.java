package fr.inria.diversify.diversification;

import fr.inria.diversify.transformation.CompileException;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.query.TransformationQuery;
import fr.inria.diversify.util.Log;
import org.codehaus.plexus.util.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * User: Simon
 * Date: 9/2/13
 * Time: 2:39 PM
 */
public class TestSosie extends AbstractDiversify {
    protected List<String> mavenProjects;

    public TestSosie(TransformationQuery transQuery, String projectDir) {
        this.transQuery = transQuery;
        this.projectDir = projectDir;
        transformations = new ArrayList<Transformation>();
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

//        builder.start();
//        int count = 0;
//        while (builder.getFailures() == null && count < timeOut) {
//            count++;
//            Thread.sleep(1000);
//        }
//        Log.debug("setCompile error: " + builder.getCompileError() + ", run all test" + builder.allTestRun() + ", number of failure" + builder.getFailures());
//        if (builder.getCompileError())
//            throw new CompileException("error ");
//
//        if (!builder.allTestRun())
//            return -1;
//        return builder.getFailures();
        return null;
    }

    @Override
    public void run(int n) throws Exception {
        for (int i = 0; i < n; i++) {
            Log.debug("diversification number: " + i);
            run(transQuery.getTransformation());
        }
    }

    @Override
    public void run(Collection<Transformation> trans) throws Exception {
        for (Transformation tran : trans)
            run(tran);
    }

    protected void run(Transformation trans) throws Exception {
        Log.debug("output dir sosie: " + tmpDir + "/" + sourceDir);
        try {
            trans.apply(tmpDir + "/" + sourceDir);
            if(runTest(tmpDir) != 0) {
                FileUtils.cleanDirectory(tmpDir);
                FileUtils.forceDelete(tmpDir);
            }
            else {
                transformations.add(trans);
            }
        } catch (Exception e) {
            Log.warn("setCompile error during diversification", e);
            FileUtils.cleanDirectory(tmpDir);
            FileUtils.forceDelete(tmpDir);
        }
    }

    public void setMavenProject(List<String> mavenProjects) {
        this.mavenProjects = mavenProjects;
    }
}

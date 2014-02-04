package fr.inria.diversify.diversification;

import fr.inria.diversify.transformation.*;
import fr.inria.diversify.transformation.builder.AbstractBuilder;
import fr.inria.diversify.transformation.query.ITransformationQuery;
import fr.inria.diversify.util.GitUtil;
import fr.inria.diversify.util.Log;
import org.apache.commons.io.FileUtils;
import org.json.JSONException;

import java.io.*;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * User: Simon
 * Date: 9/2/13
 * Time: 3:05 PM
 */
public abstract class AbstractDiversify {
    protected String projectDir;
    protected String tmpDir;
    protected List<Transformation> transformations;
    protected String sourceDir;
    protected ITransformationQuery transQuery;
    protected AbstractBuilder builder;


    public abstract void run(int n) throws Exception;

    public abstract void run(Collection<Transformation> trans) throws Exception;

    public void printResult(String output, String git) {
        mkDirResult(output,git);
        String fileName = output + System.currentTimeMillis() + "_transformation.json";
        String absoluteFileName = git + "/" + fileName;
        try {
            writeTransformation(absoluteFileName);
            Log.info("write result in {}", absoluteFileName);
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

    public String init(String dirProject, String dirTarget) throws IOException, InterruptedException {
        tmpDir = dirTarget + "/tmp_" + System.currentTimeMillis();
        File dir = new File(tmpDir);
        dir.mkdirs();
        FileUtils.copyDirectory(new File(dirProject), dir);

        return tmpDir;
    }

    protected Integer runTest(String directory) throws InterruptedException, CompileException, InstantiationException, IllegalAccessException {
        builder.runBuilder();
        Log.info("setCompile error: " + builder.getCompileError() + ", run all test: " + builder.allTestRun() + ", number of failure: " + builder.getFailures());
        if (builder.getCompileError()) {
            throw new CompileException("setCompile error in maven");
        }

        if (builder.getFailures() == null)
            return -1;
        return builder.getFailures();
    }


    public void setTransformationQuery(ITransformationQuery transQuery) {
        this.transQuery = transQuery;
    }

    public List<Transformation> getTransformations() {return transformations;}

    public void setBuilder(AbstractBuilder builder) {
        this.builder = builder;
    }
}

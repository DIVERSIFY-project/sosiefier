package fr.inria.diversify.diversification;

import fr.inria.diversify.transformation.*;
import fr.inria.diversify.buildSystem.AbstractBuilder;
import fr.inria.diversify.transformation.query.TransformationQuery;
import fr.inria.diversify.util.GitUtil;
import fr.inria.diversify.util.Log;
import org.apache.commons.io.FileUtils;
import org.json.JSONException;

import java.io.*;
import java.util.Collection;
import java.util.List;

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
    protected TransformationQuery transQuery;
    protected AbstractBuilder builder;


    public abstract void run(int n) throws Exception;

    public abstract void run(Collection<Transformation> trans) throws Exception;

    public String printResult(String output) {
        mkDirResult(output);
        String fileName = output + System.currentTimeMillis();// + "_transformation.json";
        try {
            writeTransformation(fileName);
            Log.info("write result in {}", fileName);
        } catch (Exception e) {
            Log.error("error in Builder.printResult", e);
        }
        return fileName;
    }

    public void printResult(String output, String git) {
        String absoluteFileName = printResult(git+"/"+output);

            String[] split = absoluteFileName.split("/");
            String tmp = split[0];
            for (int i = 1;i < split.length - 1; i++) {
                tmp = tmp + "/" + split[i];
            }
            Log.debug(tmp+"/   "+split[split.length - 1]);
        GitUtil.addToGit(tmp+"/", "*");
    }

    public void writeTransformation(String fileName) throws IOException, JSONException {
        if (transformations.isEmpty())
            return;

        TransformationsWriter write = new TransformationsWriter(transformations,fileName);
        write.writeAllTransformation(null);
    }

    protected void mkDirResult(String output) {
        String[] tmp = output.split("/");
        String dirs = "";
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
        Log.debug("run test in directory: {}", directory);
        builder.setDirectory(directory);
        builder.runBuilder();
        Log.info("status: " + builder.getStatus()+", compile error: " + builder.getCompileError() + ", run all test: " + builder.allTestRun() + ", nb error: " + builder.getErrors().size());
        if (builder.getCompileError()) {
            throw new CompileException("compile error in maven");
        }
        return builder.getStatus();
    }


    public void setTransformationQuery(TransformationQuery transQuery) {
        this.transQuery = transQuery;
    }

    public List<Transformation> getTransformations() {return transformations;}

    public void setBuilder(AbstractBuilder builder) {
        this.builder = builder;
    }


}

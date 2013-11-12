package fr.inria.diversify.diversification;

import fr.inria.diversify.transformation.ITransformation;
import fr.inria.diversify.transformation.query.AbstractTransformationQuery;
import fr.inria.diversify.util.Log;
import org.codehaus.plexus.util.FileUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.Set;

/**
 * User: Simon
 * Date: 7/22/13
 * Time: 10:20 AM
 */
public class Sosie extends Builder {

    public Sosie(AbstractTransformationQuery transQuery, String projectDir) {
        this.transQuery = transQuery;
        this.tmpDir = "output_sosie";
        this.projectDir = projectDir;
        transformations = new ArrayList<ITransformation>();

        clojureTest = false;
    }

    public Sosie(String projectDir) {
        this.transQuery = transQuery;
        this.tmpDir = "output_sosie";
        this.projectDir = projectDir;
        transformations = new ArrayList<ITransformation>();

        clojureTest = false;
    }
    @Override
    public void run(int n) throws Exception {
        File dir = new File(tmpDir);
        if(!dir.exists())
            dir.mkdirs();
        for (int i = 0; i < n; i++) {
            Log.debug("sosie number: " + i);
            run(transQuery.getTransformation());
        }
    }

    @Override
    public void run(Set<ITransformation> trans) throws Exception {
        for (ITransformation tran : trans)
            run(tran);
    }

    protected void run(ITransformation trans) throws Exception {
        initThreadGroup();
        String dir = prepare(projectDir, tmpDir,newPomFile);
        Log.debug("output dir sosie: " + dir + "/" + workingDir);
        try {
            trans.apply(dir + "/" + workingDir);
            if(runTest(dir) != 0) {
                FileUtils.cleanDirectory(dir);
                FileUtils.forceDelete(dir);
            }
            else {
                transformations.add(trans);
                FileWriter fileWriter = new FileWriter(dir +"/diversificationPoint");
                fileWriter.append(trans.toJSONObject().toString());
                fileWriter.close();
            }
        } catch (Exception e) {
            Log.warn("compile error during diversification", e);
            FileUtils.cleanDirectory(dir);
            FileUtils.forceDelete(dir);
        }
        killUselessThread();
    }
}

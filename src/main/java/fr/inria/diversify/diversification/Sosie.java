package fr.inria.diversify.diversification;

import fr.inria.diversify.sosie.logger.Instru;
import fr.inria.diversify.sosie.logger.InstruTestAndMethod;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.query.TransformationQuery;
import fr.inria.diversify.util.Log;
import org.codehaus.plexus.util.FileUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * User: Simon
 * Date: 7/22/13
 * Time: 10:20 AM
 */
public class Sosie extends AbstractDiversify {
    protected String testDir;
    protected boolean instru;

    public Sosie(String projectDir, String src, String test) {
        this.sourceDir = src;
        this.testDir = test;
        this.projectDir = projectDir;
        transformations = new ArrayList<>();
        instru = true;
    }
    @Override
    public void run(int n) throws Exception {
        for (int i = 0; i < n; i++) {
            Log.debug("sosie number: " + i);
            run(transQuery.buildTransformation());
        }
    }

    //@Override
    public void run(Collection<Transformation> trans) throws Exception {
        for (Transformation tran : trans)
            run(tran);
    }

    protected void run(Transformation trans) throws Exception {
        Log.debug("output dir sosie: " + tmpDir + "/" + sourceDir);
        try {
            trans.apply(tmpDir + "/" + sourceDir);
            int status = runTest(tmpDir);
            trans.setStatus(status);
            if(status != 0) {
                FileUtils.cleanDirectory(tmpDir);
                FileUtils.forceDelete(tmpDir);
            }
            else {
                transformations.add(trans);
                FileWriter fileWriter = new FileWriter(tmpDir +"/diversificationPoint");
                fileWriter.append(trans.toJSONObject().toString());
                fileWriter.close();
                if(instru)
                    instruTestAndMethod(tmpDir);
            }
        } catch (Exception e) {
            trans.setStatus(-2);
            Log.warn("setCompile error during diversification", e);
            FileUtils.cleanDirectory(tmpDir);
            FileUtils.forceDelete(tmpDir);
        }
        tmpDir = init(projectDir,"output_sosie/sosie");
    }

    protected void instruTestAndMethod(String project) throws Exception {
        String output = "output_sosieInstru/instru_"+System.currentTimeMillis();
        Instru instru = new Instru(project,sourceDir,testDir,output, transformations);
        instru.instru(true,true,false,true,false);
    }



}

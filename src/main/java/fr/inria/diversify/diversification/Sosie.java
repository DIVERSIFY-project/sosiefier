package fr.inria.diversify.diversification;

import fr.inria.diversify.sosie.logger.InstruTestAndMethod;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.query.TransformationQuery;
import fr.inria.diversify.util.DiversifyProperties;
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

    public Sosie(TransformationQuery transQuery, String projectDir) {
        this.transQuery = transQuery;
        this.projectDir = projectDir;
        transformations = new ArrayList<>();

    }

    public Sosie(String projectDir, String src) {
        this.sourceDir = src;
        this.projectDir = projectDir;
        transformations = new ArrayList<>();

    }
    @Override
    public void run(int n) throws Exception {
        for (int i = 0; i < n; i++) {
            Log.debug("sosie number: " + i);
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
                FileWriter fileWriter = new FileWriter(tmpDir +"/diversificationPoint");
                fileWriter.append(trans.toJSONObject().toString());
                fileWriter.close();
            }
        } catch (Exception e) {
            Log.warn("setCompile error during diversification", e);
            FileUtils.cleanDirectory(tmpDir);
            FileUtils.forceDelete(tmpDir);
        }
       
        tmpDir = init(projectDir,"output_sosie/sosie");
    }

    protected void instruTestAndMethod(String project, String output) throws Exception {
        String src = DiversifyProperties.getProperty("src");
        String test = project + "/" + DiversifyProperties.getProperty("testSrc");
        new InstruTestAndMethod(project,output,src,test);
    }
}

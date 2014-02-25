package fr.inria.diversify.diversification;

import fr.inria.diversify.sosie.InstruProject;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.query.ast.AbstractTransformationQuery;
import fr.inria.diversify.util.DiversifyProperties;
import fr.inria.diversify.util.Log;
import org.codehaus.plexus.util.FileUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/**
 * User: Simon
 * Date: 7/22/13
 * Time: 10:20 AM
 */
public class MutantSosie extends AbstractDiversify {
    protected String sosieDir;

    public MutantSosie(AbstractTransformationQuery transQuery, String projectDir) {
        this.transQuery = transQuery;
        this.projectDir = projectDir;
        transformations = new ArrayList<Transformation>();

    }

    public MutantSosie(String projectDir, String src) {
        this.sourceDir = src;
        this.projectDir = projectDir;
        transformations = new ArrayList<Transformation>();

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
            trans.getParent().apply(tmpDir + "/" + sourceDir);

            trans.getParent().apply(sosieDir + "/" + sourceDir);
            trans.apply(sosieDir + "/" + sourceDir);

            if(runTest(tmpDir) < -1 || runTest(sosieDir) < -1) {
                FileUtils.cleanDirectory(tmpDir);
                FileUtils.forceDelete(tmpDir);

                FileUtils.cleanDirectory(sosieDir);
                FileUtils.forceDelete(sosieDir);
            }
            else {
                transformations.add(trans);
                FileWriter fileWriter = new FileWriter(tmpDir +"/diversificationPoint");
                fileWriter.append(trans.toJSONObject().toString());
                fileWriter.close();
                instruProject(tmpDir);
            }
        } catch (Exception e) {
            Log.warn("setCompile error during diversification", e);
            FileUtils.cleanDirectory(tmpDir);
            FileUtils.forceDelete(tmpDir);
        }
        //new tmpdir
        init(projectDir,"output_sosie/sosie");
    }

    public String init(String dirProject, String dirTarget) throws IOException, InterruptedException {
        long m = System.currentTimeMillis();

        tmpDir = dirTarget + "/mutant_" + m;
        File dir = new File(tmpDir);
        dir.mkdirs();
        org.apache.commons.io.FileUtils.copyDirectory(new File(dirProject), dir);

        sosieDir = dirTarget + "/mutantSosie_" + m;
        dir = new File(sosieDir);
        dir.mkdirs();
        org.apache.commons.io.FileUtils.copyDirectory(new File(dirProject), dir);

        return tmpDir;
    }

    protected void instruProject(String projectDir) throws Exception {
        String tmpDir = DiversifyProperties.getProperty("out") + "/instru/sosie_" + System.currentTimeMillis();
        String src = DiversifyProperties.getProperty("src");
        String test = DiversifyProperties.getProperty("testSrc");
        new InstruProject(projectDir, tmpDir, src,test);
    }
}

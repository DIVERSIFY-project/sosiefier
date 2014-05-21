package fr.inria.diversify.diversification;

import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.query.TransformationQuery;
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
public class SosieWithParent extends AbstractDiversify {
    protected String sosieDir;
    protected String mutantDir;

    public SosieWithParent(TransformationQuery transQuery, String projectDir) {
        this.transQuery = transQuery;
        this.projectDir = projectDir;
        transformations = new ArrayList<>();
    }

    public SosieWithParent(String projectDir, String src) {
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
        Log.debug("output dir mutant and sosie: " + tmpDir );
        try {
            Log.debug("apply parent transformation");
            trans.getParent().apply(mutantDir + "/" + sourceDir);

            Log.debug("apply parent transformation + transformation");
            trans.applyWithParent(sosieDir + "/" + sourceDir);

            if(runTest(mutantDir) < -1 || runTest(sosieDir) < -1) {
                FileUtils.cleanDirectory(mutantDir);
                FileUtils.forceDelete(mutantDir);

                FileUtils.cleanDirectory(sosieDir);
                FileUtils.forceDelete(sosieDir);
            }
            else {
                trans.setFailures(builder.getErrors());
                transformations.add(trans);
                FileWriter fileWriter = new FileWriter(mutantDir +"/diversificationPoint");
                fileWriter.append(trans.toJSONObject().toString());
                fileWriter.close();
                long m = System.currentTimeMillis();
                String outDir = tmpDir + "/instru/" + m;
                instruProject(mutantDir, outDir + "/mutant/");
                instruProject(sosieDir, outDir + "/mutantSosie/");
            }
        } catch (Exception e) {
            Log.warn("setCompile error during diversification", e);
            FileUtils.cleanDirectory(mutantDir);
            FileUtils.forceDelete(mutantDir);

            FileUtils.cleanDirectory(sosieDir);
            FileUtils.forceDelete(sosieDir);
        }
        //new tmpdir
        init(projectDir,tmpDir);
    }

    public String init(String dirProject, String dirTarget) throws IOException, InterruptedException {
        tmpDir = dirTarget;
        long m = System.currentTimeMillis();

        mutantDir = dirTarget + "/" + m +"/mutant";
        File dir = new File(mutantDir);
        dir.mkdirs();
        org.apache.commons.io.FileUtils.copyDirectory(new File(dirProject), dir);

        sosieDir = dirTarget + "/" + m + "/mutantSosie";
        dir = new File(sosieDir);
        dir.mkdirs();
        org.apache.commons.io.FileUtils.copyDirectory(new File(dirProject), dir);

        return tmpDir;
    }

    protected void instruProject(String projectDir, String outDir) throws Exception {
//        String src = DiversifyProperties.getProperty("src");
//        String test = DiversifyProperties.getProperty("testSrc");
//        new InstruMethod(projectDir, outDir, src,test);
    }
}

package fr.inria.diversify.sosie;

import fr.inria.diversify.Builder;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.query.AbstractTransformationQuery;
import org.codehaus.plexus.util.FileUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

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
        transformations = new ArrayList<Transformation>();

        clojureTest = false;
    }
    @Override
    public void run(int n) throws Exception {
        File dir = new File(tmpDir);
        if(!dir.exists())
            dir.mkdirs();
        for (int i = 0; i < n; i++) {
            System.out.println(i);
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
        System.out.println("output dir sosie: " + dir + "/" + srcDir);
        try {
            trans.apply(dir + "/" + srcDir);
            if(runTest(dir) != 0) {
                FileUtils.cleanDirectory(dir);
                FileUtils.forceDelete(dir);
            }
            else {
                transformations.add(trans);
                FileWriter fileWriter = new FileWriter(dir +"/diversificationPoint");
                fileWriter.append(trans.positionString());
                fileWriter.close();
            }
        } catch (Exception e) {
            System.out.println("compile error ");
            FileUtils.cleanDirectory(dir);
            FileUtils.forceDelete(dir);
        }
        killUselessThread();
    }
}

package fr.inria.diversify.diversification;

import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.query.AbstractTransformationQuery;
import fr.inria.diversify.util.Log;
import org.codehaus.plexus.util.FileUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * User: Simon
 * Date: 5/2/13
 * Time: 5:39 PM
 */
public class Diversify extends Builder {
    protected int compileError = 0;
    protected int sosie = 0;
    protected int trial = 0;

    public Diversify(AbstractTransformationQuery transQuery, String projectDir) {
        this.transQuery = transQuery;
        this.tmpDir = "output_diversify";
        this.srcDir = "src/main/java";
        this.projectDir = projectDir;
        clojureTest = false;

        transformations = new ArrayList<Transformation>();
    }

    public Diversify(String projectDir) {
        this.tmpDir = "output_diversify";
        this.srcDir = "src/main/java";
        this.projectDir = projectDir;
        clojureTest = false;

        transformations = new ArrayList<Transformation>();
    }



    @Override
    public void run(int n) throws Exception {
        // todo bidon
        String dir = prepare(projectDir, tmpDir);

        for (int i = 0; i < n; i++) {
            Log.info("diversification number: " + i);
            run(transQuery.getTransformation(), dir);
        }
        FileUtils.cleanDirectory(dir);
        FileUtils.forceDelete(dir);

        Log.debug("{} compile error on {} compilation", compileError, n);
        Log.debug("{} sosie on {} trial", sosie, trial);
    }
    @Override
    public void run(Set<Transformation> trans) throws Exception {
        String dir = prepare(projectDir, tmpDir);
        for (Transformation tran : trans) {
            run(tran, dir);
        }
        FileUtils.cleanDirectory(dir);
        FileUtils.forceDelete(dir);
    }

    protected void run(Transformation trans, String tmpDir) throws Exception {
        initThreadGroup();
        Log.debug("output dir: " + tmpDir + "/" + srcDir);
        try {
            trans.apply(tmpDir + "/" + srcDir);
            int failures = runTest(tmpDir);
            if(failures == 0)
                sosie++;
            trial++;
            trans.setJUnitResult(failures);
            transformations.add(trans);

        } catch (Exception e) {
            compileError++;
            Log.warn("compile error during diversification", e);
        }
        trans.restore(tmpDir + "/" + srcDir);
        killUselessThread();
    }
}

package fr.inria.diversify.transformation;

import fr.inria.diversify.Builder;
import fr.inria.diversify.transformation.query.AbstractTransformationQuery;
import fr.inria.diversify.util.Log;
import org.codehaus.plexus.util.FileUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Simon
 * Date: 5/2/13
 * Time: 5:39 PM
 */
public class Diversify extends Builder {


    public Diversify(AbstractTransformationQuery transQuery, String projectDir) {
        this.transQuery = transQuery;
        this.tmpDir = "output_diversify";
        this.srcDir = "src/main/java";
        this.projectDir = projectDir;
        clojureTest = false;
        timeOut = 200;

        transformations = new ArrayList<Transformation>();
    }
    @Override
    public void run(int n) throws Exception {
        String dir = prepare(projectDir, tmpDir);

        for (int i = 0; i < n; i++) {
            Log.info("diversification number: " + i);
            run(transQuery.getTransformation(), dir);
        }
        FileUtils.cleanDirectory(dir);
        FileUtils.forceDelete(dir);
    }
    @Override
    public void run(List<Transformation> trans) throws Exception {
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
            trans.setJUnitResult(failures);
            transformations.add(trans);

        } catch (Exception e) {
            Log.warn("compile error during diversification", e);
        }
        trans.restore(tmpDir + "/" + srcDir);
        killUselessThread();

    }
}

package fr.inria.diversify.diversification;

import fr.inria.diversify.transformation.ITransformation;
import fr.inria.diversify.transformation.maven.RunBuild;
import fr.inria.diversify.transformation.query.ast.AbstractTransformationQuery;
import fr.inria.diversify.transformation.query.bytecode.ByteCodeTransformationQuery;
import fr.inria.diversify.util.Log;
import org.codehaus.plexus.util.FileUtils;

import java.util.ArrayList;

import java.util.Set;

/**
 * User: Simon
 * Date: 5/2/13
 * Time: 5:39 PM
 */
public class Diversify extends AbstractDiversify {
    protected int compileError = 0;
    protected int sosie = 0;
    protected int trial = 0;

    public Diversify(AbstractTransformationQuery transQuery, String projectDir, Class buildClass) {
        this.transQuery = transQuery;
        this.tmpDir = "output_diversify";
        this.projectDir = projectDir;
        clojureTest = false;
        this.buildClass = buildClass;
        transformations = new ArrayList<ITransformation>();
    }

    public Diversify(String projectDir, String workingDir) {
        this.tmpDir = "output_diversify";
        this.sourceDir = workingDir;
        this.projectDir = projectDir;
        clojureTest = false;

        transformations = new ArrayList<ITransformation>();
    }

    @Override
    public void run(int n) throws Exception {
        // todo bidon
        String dir = prepare(projectDir, tmpDir, newPomFile);
        Log.info("number of diversification: " + n);
        for (int i = 0; i < n; i++) {
            Log.info("diversification: " + i);
            run(transQuery.getTransformation(), dir);
        }
        FileUtils.cleanDirectory(dir);
        FileUtils.forceDelete(dir);

        Log.debug("{} compile error on {} compilation", compileError, n);
        Log.debug("{} sosie on {} trial", sosie, trial);
    }

    @Override
    public void run(Set<ITransformation> trans) throws Exception {
        String dir = prepare(projectDir, tmpDir,newPomFile);
        Log.info("number of diversification: " + trans.size());
        int i = 0;
        for (ITransformation tran : trans) {
            Log.info("diversification: " + i);
            run(tran, dir);
            i++;
        }
        FileUtils.cleanDirectory(dir);
        FileUtils.forceDelete(dir);
        Log.debug("{} compile error on {} compilation", compileError, trans.size());
        Log.debug("{} sosie on {} trial", sosie, trial);
    }

    protected void run(ITransformation trans, String tmpDir) throws Exception {
        initThreadGroup();
        Log.debug("output dir: " + tmpDir + "/" + sourceDir);
        try {
            trans.apply(tmpDir + "/" + sourceDir);
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
        trans.restore(tmpDir + "/" + sourceDir);
        Log.debug("run after restore: " + tmpDir + "/" + sourceDir);
        killUselessThread();
    }

    protected String[] getMavenPhase() {
        if(transQuery != null && transQuery instanceof ByteCodeTransformationQuery)
            return new String[]{"test"};
        else
            return new String[]{"clean", "test"};
    }
}

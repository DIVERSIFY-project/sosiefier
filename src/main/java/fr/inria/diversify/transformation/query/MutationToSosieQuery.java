package fr.inria.diversify.transformation.query;

import fr.inria.diversify.codeFragment.Statement;
import fr.inria.diversify.coverage.MultiCoverageReport;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationParser;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.transformation.query.ast.ASTTransformationQuery;
import org.json.JSONException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * User: Simon
 * Date: 19/02/14
 * Time: 14:49
 */
public class MutationToSosieQuery extends TransformationQuery {
    protected List<Transformation> mutations;
    protected String classesDir;
    protected File jacocoDir;

    public MutationToSosieQuery(String classesDir,String mutationDirectory ,File jacocoDir) throws IOException, JSONException {
        this.classesDir = classesDir;
        this.jacocoDir = jacocoDir;
        init(mutationDirectory);
    }

    protected void init(String mutationDirectory) throws IOException, JSONException {
        TransformationParser tf = new TransformationParser(true);
        mutations = new ArrayList<Transformation>(tf.parseDir(mutationDirectory));
    }


    @Override
    public void setType(String type) {

    }

    @Override
    public ASTTransformation getTransformation() throws Exception {
        Random r = new Random();
        Transformation mutation = mutations.get(r.nextInt(mutations.size()));
        while(mutation.getStatus() != -1)
            mutation = mutations.get(r.nextInt(mutations.size()));

        MultiCoverageReport coverageReport = new MultiCoverageReport(classesDir);
        for(String failure : mutation.getFailures())   {
            String test = formatTest(failure);
            for(File jacocoFile : jacocoDir.listFiles()) {
                if(test.equals(jacocoFile.getName()))
                    coverageReport.addJacocoFile(jacocoFile);
            }
        }

        ASTTransformationQuery query = new ASTTransformationQuery(coverageReport, Statement.class);

        ASTTransformation trans = query.getTransformation();
        trans.setParent(mutation);
        return trans;
    }

    protected String formatTest(String failure) {
        String[] tmp = failure.split("\\.");
        String ret = tmp[0];
        for(int i = 1; i < tmp.length - 1; i++) {
            ret += "." + tmp[i];
        }
        return ret + "#" +tmp[tmp.length - 1] + ".exec";
    }
}
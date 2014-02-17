package fr.inria.diversify.transformation.query.ast;

import fr.inria.diversify.CodeFragmentList;
import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.transformation.*;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import org.json.JSONException;
import spoon.reflect.factory.Factory;

import java.io.IOException;
import java.util.*;

/**
 * User: Simon
 * Date: 7/17/13
 * Time: 10:16 AM
 */
public class ASTTransformationQueryFromList extends AbstractTransformationQuery {
    protected ICoverageReport coverageReport;
    private List<Transformation> transformation;

    public ASTTransformationQueryFromList(ICoverageReport cr, Factory factory) {
        this.coverageReport = cr;
        init(factory);
    }

    public Set<Transformation> getTransformations(int nb) throws Exception {
        HashSet<Transformation> set = new HashSet<Transformation>();

        if(nb <= 0) {
            set.addAll(transformation);
        }
        else {
            while (set.size() < nb)
                set.add(getTransformation());
        }
        return set;
    }

    @Override
    public ASTTransformation delete() throws Exception {
        Random r = new Random();
        double coverage = 0;
        ASTTransformation t = null;
        while(coverage == 0 && t.getType().equals("delete")) {
            t = (ASTTransformation)transformation.get(r.nextInt(transformation.size()));
            coverage = coverageReport.codeFragmentCoverage(t.getPosition());
        }
        return t;
    }

    @Override
    public ASTTransformation add() throws Exception {
        Random r = new Random();
        double coverage = 0;
        ASTTransformation t = null;
        while(coverage == 0&& t.getType().equals("add") ) {
            t = (ASTTransformation)transformation.get(r.nextInt(transformation.size()));
            coverage = coverageReport.codeFragmentCoverage(t.getPosition());
        }
        return t;
    }

    @Override
    public ASTTransformation replace() throws Exception {
        Random r = new Random();
        double coverage = 0;
        ASTTransformation t = null;
        while(coverage == 0 && t.getType().equals("replace")) {
            t = (ASTTransformation)transformation.get(r.nextInt(transformation.size()));
            coverage = coverageReport.codeFragmentCoverage(t.getPosition());
        }
        return t;
    }

    protected void init(Factory factory, String transformationDirectory) throws IOException, JSONException {
        super.init(factory);
        TransformationParser tf = new TransformationParser(codeFragments, false);
        transformation = new ArrayList<Transformation>(tf.parseDir(transformationDirectory));
    }
}

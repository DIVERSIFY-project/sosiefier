package fr.inria.diversify.transformation.query.ast;

import fr.inria.diversify.CodeFragmentList;
import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.transformation.*;
import fr.inria.diversify.transformation.ast.ASTMultiTransformation;
import fr.inria.diversify.transformation.ast.ASTTransformation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

/**
 * User: Simon
 * Date: 7/17/13
 * Time: 10:16 AM
 */
public class ASTTransformationQueryFromList extends AbstractTransformationQuery {
    protected ICoverageReport coverageReport;
    private List<Transformation> transformation;

    public ASTTransformationQueryFromList(Collection<Transformation> transformation, ICoverageReport cr, CodeFragmentList codeFragments) {
        this.transformation = new ArrayList<Transformation>(transformation);
        this.coverageReport = cr;
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
}

package fr.inria.diversify.transformation.query.ast;

import fr.inria.diversify.CodeFragmentList;
import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.transformation.*;
import fr.inria.diversify.transformation.ast.ASTTransformation;

import java.util.List;
import java.util.Random;

/**
 * User: Simon
 * Date: 7/17/13
 * Time: 10:16 AM
 */
public class ASTTransformationQueryFromList extends AbstractTransformationQuery {
    protected ICoverageReport coverageReport;
    private List<ITransformation> transformation;

    public ASTTransformationQueryFromList(List<ITransformation> transformation, ICoverageReport cr, CodeFragmentList codeFragments) {
        this.transformation = transformation;
        this.coverageReport = cr;
    }

    @Override
    public ASTTransformation delete() throws Exception {
        Random r = new Random();
        double coverage = 0;
        ASTTransformation t = null;
        while(coverage == 0) {
            t = (ASTTransformation)transformation.get(r.nextInt(transformation.size()));
            coverage = coverageReport.codeFragmentCoverage(t.getPosition());
        }
        return t.toDelete();
    }

    @Override
    public ASTTransformation add() throws Exception {
        Random r = new Random();
        double coverage = 0;
        ASTTransformation t = null;
        while(coverage == 0) {
            t = (ASTTransformation)transformation.get(r.nextInt(transformation.size()));
            coverage = coverageReport.codeFragmentCoverage(t.getPosition());
        }
        return t.toAdd();
    }

    @Override
    public ASTTransformation replace() throws Exception {

        Random r = new Random();
        double coverage = 0;
        ASTTransformation t = null;
        while(coverage == 0) {
            t = (ASTTransformation)transformation.get(r.nextInt(transformation.size()));
            coverage = coverageReport.codeFragmentCoverage(t.getPosition());
        }
        return t.toReplace();
    }
}

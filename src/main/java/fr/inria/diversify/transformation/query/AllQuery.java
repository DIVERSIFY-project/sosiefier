package fr.inria.diversify.transformation.query;

import fr.inria.diversify.codeFragment.Statement;
import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.query.ast.ASTTransformationQuery;

import java.util.Random;

/**
 * Created by Simon on 19/03/14.
 */
public class AllQuery extends TransformationQuery  {
    protected MutationQuery mutation;
    protected ASTTransformationQuery ast;

    public AllQuery(ICoverageReport coverage) {
        ast = new ASTTransformationQuery(coverage,Statement.class, true);
        mutation = new MutationQuery(coverage);
    }

    @Override
    public void setType(String type) {

    }

    @Override
    public Transformation getTransformation() throws Exception {
        Random r = new Random();
        if(r.nextDouble() < 0.2)
            return mutation.getTransformation();
        else
            return ast.getTransformation();
    }
}

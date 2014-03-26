package fr.inria.diversify.transformation.query;

import fr.inria.diversify.codeFragment.Statement;
import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTTransformation;
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
        Transformation transformation = null;
        Random r = new Random();

        while (transformation == null) {
            T thread = new T(ast, mutation, r.nextDouble());
            thread.start();
            int count = 0;
            while (thread.trans == null && count < 50) {
                Thread.sleep(100);
                count++;
            }
            thread.interrupt();
            transformation = thread.trans;
        }
        return transformation;
    }

    class T extends Thread {
        public Transformation trans;
        ASTTransformationQuery query;
        MutationQuery mutation;
        double r;

        public T(ASTTransformationQuery query,  MutationQuery mutation, double r) {
            this.query = query;
            this.mutation = mutation;
            this.r = r;
        }
        public void run() {
            try {
                if(r < 0.05)
                    trans = mutation.getTransformation();
                else
                    trans =  ast.getTransformation();
            } catch (Exception e) {

            }
        }
    }
}

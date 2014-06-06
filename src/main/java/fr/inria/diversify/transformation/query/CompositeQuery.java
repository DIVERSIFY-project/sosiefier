package fr.inria.diversify.transformation.query;

import fr.inria.diversify.codeFragment.Statement;
import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.query.ast.ASTTransformationQuery;

import java.util.Random;

/**
 * Composite query to composite multiple types of queries
 *
 * Created by Simon on 19/03/14.
 */
public class CompositeQuery extends TransformationQuery  {

    /**
     * Mutation query of the composite
     */
    protected MutationQuery mutation;

    /**
     * Ast query of the composite
     */
    protected ASTTransformationQuery ast;


    public CompositeQuery(MutationQuery mutationQuery, ASTTransformationQuery astQuery) {
        ast = astQuery;
        mutation = mutationQuery;
    }

    @Override
    public void setType(String type) {}

    @Override
    public Transformation buildTransformation() throws Exception {
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
                    trans = mutation.buildTransformation();
                else
                    trans =  ast.buildTransformation();
            } catch (Exception e) {

            }
        }
    }
}

package fr.inria.diversify.transformation.query;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.util.Log;

import java.util.Random;

/**
 * Composite executeQuery to composite multiple types of queries
 *
 * Created by Simon on 19/03/14.
 */
public class CompositeQuery extends TransformationQuery  {

    /**
     * Mutation executeQuery of the composite
     */
    protected MutationQuery mutation;

    /**
     * Ast executeQuery of the composite
     */
    protected ASTTransformationQuery ast;


    public CompositeQuery(InputProgram inputProgram) {
        super(inputProgram);
        ast = new ASTTransformationQuery(inputProgram);
        mutation = new MutationQuery(inputProgram);
    }

    @Override
    public void setType(String type) {}

    @Override
    public Transformation query() {
        try {
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
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
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
                    trans = mutation.query();
                else
                    trans =  ast.query();
            } catch (Exception e) {
                Log.warn("Exception while running transformation: " + trans);
                e.printStackTrace();
            }
        }
    }
}

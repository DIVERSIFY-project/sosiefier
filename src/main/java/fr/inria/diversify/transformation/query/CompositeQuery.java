package fr.inria.diversify.transformation.query;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.util.Log;

import java.util.ArrayList;
import java.util.List;
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


    public CompositeQuery(InputProgram inputProgram) {
        super(inputProgram);
        ast = new ASTTransformationQuery(inputProgram);
        mutation = new MutationQuery(inputProgram);
    }

    @Override
    public void setType(String type) {}

    @Override
    public List<Transformation> query(int nb) {
        try {
            List<Transformation> result = new ArrayList<>();
            for ( int j = 0; j < nb; j++ ) {
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
                result.add(transformation);
            }
            return result;
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
                    trans = mutation.buildTransformation();
                else
                    trans =  ast.buildTransformation();
            } catch (Exception e) {
                Log.warn("Exception while running transformation: " + trans);
                e.printStackTrace();
            }
        }
    }
}

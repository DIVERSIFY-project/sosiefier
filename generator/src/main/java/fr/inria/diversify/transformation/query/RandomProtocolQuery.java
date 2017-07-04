package fr.inria.diversify.transformation.query;

import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.RandomProtocol;
import fr.inria.diversify.transformation.Transformation;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.reference.CtTypeReference;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by nharrand on 21/06/17.
 */
public class RandomProtocolQuery extends TransformationQuery {

    Random r = new Random();

    public RandomProtocolQuery(InputProgram inputProgram) {
        super(inputProgram);

        System.out.println("coucou");
    }

    @Override
    public Transformation query() throws QueryException {
        int n = 20;
        //int partitionID = r.nextInt((int) Math.pow(2,n-1));
        //int partitionID = 507647;
        int partitionID = 458667;
        List<byte[]> keys = new LinkedList<>();
        for(int i = 0; i < n; i ++) {
            byte[] bytes = new byte[5];
            r.nextBytes(bytes);
            keys.add(bytes);
        }
        return new RandomProtocol(getInputProgram().getFactory(),partitionID,n,keys);
    }
}

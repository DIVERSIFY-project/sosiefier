package fr.inria.diversify.transformation.query;

import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.transformation.*;

import java.util.List;
import java.util.Random;

/**
 * User: Simon
 * Date: 7/17/13
 * Time: 10:16 AM
 */
public class TransformationQueryT extends AbstractTransformationQuery {

    private List<Transformation> transformation;

    public TransformationQueryT(List<Transformation> transformation, CodeFragmentList codeFragments) {
        this.transformation = transformation;
        this.codeFragments = codeFragments;
    }

    @Override
    public Transformation delete() throws Exception {
        Delete tf = new Delete();
        Random r = new Random();
        for(int i = 0; i < nbTransformation; i++) {
            Transformation t = transformation.get(r.nextInt(transformation.size()));
            tf.addParent(t);
            tf.add(t.toDelete());
        }
        return tf;
    }

    @Override
    public Transformation add() throws Exception {
        Add tf = new Add();
        Random r = new Random();
        for(int i = 0; i < nbTransformation; i++) {
            Transformation t = transformation.get(r.nextInt(transformation.size()));
            tf.addParent(t);
            tf.add(t.toAdd());
        }
        return tf;
    }

    @Override
    public Transformation replace() throws Exception {
        Replace tf = new Replace();
        Random r = new Random();
        for(int i = 0; i < nbTransformation; i++) {
            Transformation t = transformation.get(r.nextInt(transformation.size()));
            tf.addParent(t);
            tf.add(t.toReplace());
        }
        return tf;
    }
}

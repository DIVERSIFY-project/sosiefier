package fr.inria.diversify.transformation.query;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.transformation.Add;
import fr.inria.diversify.transformation.Delete;
import fr.inria.diversify.transformation.Replace;
import fr.inria.diversify.transformation.Transformation;

import java.util.List;
import java.util.Random;

/**
 * User: Simon
 * Date: 7/17/13
 * Time: 10:16 AM
 */
public class TransformationQueryTL extends AbstractTransformationQuery {
    protected ICoverageReport coverageReport;
    private List<Transformation> transformation;

    public TransformationQueryTL(List<Transformation> transformation, ICoverageReport cr, CodeFragmentList codeFragments) {
        this.transformation = transformation;
        this.codeFragments = codeFragments;
        this.coverageReport = cr;
    }

    @Override
    public Transformation delete() throws Exception {
        Delete tf = new Delete();
//        Random r = new Random();
//        for(int i = 0; i < nbTransformation; i++) {
//            Transformation t = transformation.get(r.nextInt(transformation.size()));
//            tf.addParent(t);
//            tf.add(t.toDelete());
//        }
        return tf;
    }

    @Override
    public Transformation add() throws Exception {
        Add tf = new Add();
//        Random r = new Random();
//        for(int i = 0; i < nbTransformation; i++) {
//            Transformation t = transformation.get(r.nextInt(transformation.size()));
//            tf.addParent(t);
//            tf.add(t.toAdd());
//        }
        return tf;
    }

    @Override
    public Transformation replace() throws Exception {

        Random r = new Random();
        double coverage = 0;
        Transformation t = null;
        while(coverage == 0) {
            t = transformation.get(r.nextInt(transformation.size()));
            coverage = coverageReport.codeFragmentCoverage(t.getTransformation().get(0));
        }
        return t.toReplace();
    }
}

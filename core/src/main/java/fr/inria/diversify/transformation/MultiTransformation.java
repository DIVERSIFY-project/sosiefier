package fr.inria.diversify.transformation;

import java.util.List;

/**
 * Created by Simon on 28/01/15.
 */
public class MultiTransformation extends Transformation {
    List<Transformation> transformations;


    @Override
    public void apply(String srcDir) throws Exception {
        for(Transformation transformation: transformations) {
            transformation.apply(srcDir);
        }
    }

    @Override
    public void applyWithParent(String srcDir) throws Exception {
        for(Transformation transformation: transformations) {
            transformation.applyWithParent(srcDir);
        }

    }

    @Override
    public void restore(String srcDir) throws Exception {
        for(Transformation transformation: transformations) {
            transformation.restore(srcDir);
        }
    }
}

package fr.inria.diversify.transformation;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Simon on 28/01/15.
 */
public class MultiTransformation extends Transformation {
    List<Transformation> transformations;


    public  MultiTransformation() {
        transformations = new LinkedList<>();
        type = "multi";
    }

    @Override
    public String getTransformationString() throws Exception {
        return null;
    }

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

    public void add(Transformation transformation) {
        transformations.add(transformation);
    }

    public boolean remove(Transformation transformation) {
        return transformations.remove(transformation);
    }

    public int size() {
        return transformations.size();
    }
}

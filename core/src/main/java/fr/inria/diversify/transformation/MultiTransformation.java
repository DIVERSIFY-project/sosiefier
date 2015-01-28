package fr.inria.diversify.transformation;

import fr.inria.diversify.diversification.InputProgram;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by Simon on 28/01/15.
 */
public class MultiTransformation extends AbstractTransformation {
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

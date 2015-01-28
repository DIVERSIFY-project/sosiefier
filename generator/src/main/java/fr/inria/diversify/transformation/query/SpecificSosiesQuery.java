package fr.inria.diversify.transformation.query;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.SingleTransformation;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationJsonParser;
import fr.inria.diversify.transformation.TransformationParserException;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * A executeQuery to apply several specific single transformations. This is similar to KnownMultiSosie but instead of applying
 * previously found multisosies, apply an arbitrary set of single-sosies
 *
 * Created by marodrig on 19/08/2014.
 */
public class SpecificSosiesQuery extends TransformationQuery {

    private List<Integer> specificIndex;

    private ArrayList<Transformation> transformations;

    public SpecificSosiesQuery(InputProgram inputProgram, ArrayList<Transformation> transf) {
        super(inputProgram);
        transformations = transf;
    }

    public SpecificSosiesQuery(InputProgram inputProgram) throws TransformationParserException {
        super(inputProgram);
        TransformationJsonParser parser = new TransformationJsonParser(false, getInputProgram());
        File f = new File(getInputProgram().getPreviousTransformationsPath());
        Collection<Transformation> ts;
        if (f.isDirectory()) {
            ts = parser.parseDir(f.getAbsolutePath());
        } else {
            ts = parser.parseFile(f);
        }
        transformations = new ArrayList<>();
        transformations.addAll(ts);
    }

    @Override
    public void setType(String type) {

    }

    @Override
    public SingleTransformation query() throws QueryException {
        return null;
    }

    @Override
    public List<Transformation> query(int nb) throws QueryException {
        ArrayList<Transformation> ts = new ArrayList<>();
        for ( int i : specificIndex ) {
            ts.add(transformations.get(i));
        }
        return ts;
    }

    public List<Integer> getSpecificIndex() {
        return specificIndex;
    }

    /**
     * Specific index to apply in the transformation
     *
     * @param specificIndex
     */
    public void setSpecificIndex(List<Integer> specificIndex) {
        this.specificIndex = specificIndex;
    }
}

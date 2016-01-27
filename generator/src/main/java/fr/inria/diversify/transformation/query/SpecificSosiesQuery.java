package fr.inria.diversify.transformation.query;

import fr.inria.diversify.persistence.json.input.JsonTransformationLoader;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.Transformation;

import java.util.ArrayList;
import java.util.List;

/**
 * A executeQuery to apply several specific single transformations. This is similar to KnownMultiSosie but instead of applying
 * previously found multisosies, apply an arbitrary set of single-sosies
 *
 * Created by marodrig on 19/08/2014.
 */
@Deprecated
public class SpecificSosiesQuery extends TransformationQuery {

    private List<Integer> specificIndex;

    private ArrayList<Transformation> transformations;

    public SpecificSosiesQuery(InputProgram inputProgram, ArrayList<Transformation> transf) {
        super(inputProgram);
        transformations = transf;
    }

    public SpecificSosiesQuery(InputProgram inputProgram)  {
        super(inputProgram);
        JsonTransformationLoader parser = new JsonTransformationLoader(getInputProgram());
        transformations = new ArrayList<>(parser.load(getInputProgram().getPreviousTransformationsPath(), true));
    }

    @Override
    public Transformation query() throws QueryException {
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

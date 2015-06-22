package fr.inria.diversify.transformation.query;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.persistence.json.input.JsonTransformationLoader;
import fr.inria.diversify.transformation.Transformation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

/**
 * Created by Simon on 27/11/14.
 */
public class FromListQuery extends TransformationQuery {

    private final List<Transformation> transformations;
    boolean removeAfterQuery = true;
    boolean shuffle = false;

    public FromListQuery(InputProgram inputProgram) {
        super(inputProgram);
        JsonTransformationLoader parser = new JsonTransformationLoader(getInputProgram());

        Collection<Transformation> ts = parser.load(getInputProgram().getPreviousTransformationsPath(), true);
        transformations = new ArrayList(ts);
    }

    public FromListQuery(InputProgram inputProgram, int rangeMin, int rangeMax)  {
        super(inputProgram);

        JsonTransformationLoader parser = new JsonTransformationLoader(getInputProgram());

        Collection<Transformation> ts = parser.load(getInputProgram().getPreviousTransformationsPath(), true);
        ArrayList<Transformation> tmp = new ArrayList(ts);
        transformations = new ArrayList<>();
        for(int i = rangeMin; i < Math.min(rangeMax, tmp.size())  ; i++) {
             transformations.add(tmp.get(i));
        }
    }

    @Override
    public Transformation query() throws QueryException {
        int index = 0;
        if(shuffle) {
            Random r = new Random();
            index = r.nextInt(transformations.size());
        }
        if(removeAfterQuery) {
            return transformations.remove(index);
        } else {
            return transformations.get(index);
        }
    }

    public boolean hasNextTransformation() {
        return !transformations.isEmpty();
    }

    public void setShuffle(boolean shuffle) {
        this.shuffle = shuffle;
    }

    public void setRemoveAfterQuery(boolean removeAfterQuery) {
        this.removeAfterQuery = removeAfterQuery;
    }
}

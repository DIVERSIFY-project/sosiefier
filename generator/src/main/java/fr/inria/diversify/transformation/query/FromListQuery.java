package fr.inria.diversify.transformation.query;

import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.persistence.json.input.JsonTransformationLoader;
import fr.inria.diversify.transformation.Transformation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Created by Simon on 27/11/14.
 */
public class FromListQuery extends TransformationQuery {

    protected List<Transformation> transformations;
    protected boolean removeAfterQuery = true;
    protected boolean shuffle = false;
    protected boolean onlySosie;

    public FromListQuery(InputProgram inputProgram, boolean onlySosie) {
        super(inputProgram);
        JsonTransformationLoader parser = new JsonTransformationLoader(getInputProgram());

        transformations = parser.load(getInputProgram().getPreviousTransformationsPath(), true).stream()
                .filter(t -> !onlySosie || t.isSosie())
                .distinct()
                .collect(Collectors.toList());

    }

    public FromListQuery(InputProgram inputProgram, int rangeMin, int rangeMax, boolean onlySosie)  {
        super(inputProgram);

        JsonTransformationLoader parser = new JsonTransformationLoader(getInputProgram());
        List<Transformation> tmp = parser.load(getInputProgram().getPreviousTransformationsPath(), true).stream()
                .filter(t -> !onlySosie || t.isSosie())
                .distinct()
                .collect(Collectors.toList());

        transformations = new ArrayList<>();
        for(int i = rangeMin; i < Math.min(rangeMax, tmp.size())  ; i++) {
             transformations.add(tmp.get(i));
        }
    }

    @Override
    public synchronized Transformation query() throws QueryException {
        int index = 0;
        if(shuffle) {
            index = random.nextInt(transformations.size());
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

    public void setOnlySosie(boolean onlySosie) {
        this.onlySosie = onlySosie;
    }

    public void setRemoveAfterQuery(boolean removeAfterQuery) {
        this.removeAfterQuery = removeAfterQuery;
    }

    public List<Transformation> getTransformations() {
        return transformations;
    }
}

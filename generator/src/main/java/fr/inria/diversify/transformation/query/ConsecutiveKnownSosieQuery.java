package fr.inria.diversify.transformation.query;

import fr.inria.diversify.persistence.json.input.JsonTransformationLoader;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import java.io.File;
import java.util.*;

/**
 * Search for points of known sosies
 * <p/>
 * Created by marcel on 6/06/14.
 */
@Deprecated
public class ConsecutiveKnownSosieQuery extends TransformationQuery {

    private ArrayList<Transformation> sosies;

    private int currentTrial = 0;

    public ConsecutiveKnownSosieQuery(InputProgram inputProgram, ArrayList<Transformation> transf) {
        super(inputProgram);
        extractSosies(transf);
    }

    public ConsecutiveKnownSosieQuery(InputProgram inputProgram)  {
        super(inputProgram);
        JsonTransformationLoader parser = new JsonTransformationLoader(getInputProgram());
        parser.load(getInputProgram().getPreviousTransformationsPath(), true);
        extractSosies(parser.load(getInputProgram().getPreviousTransformationsPath(), false));
    }

    /**
     * Extracts the sosies from a transformation list
     *
     * @param transf
     */
    private void extractSosies(Collection<Transformation> transf) {
        sosies = new ArrayList<>();
        for (Transformation t : transf) {
            if (t.isSosie()) {
                sosies.add(t);
            }
        }
    }

    @Override
    public Transformation query() {
        Transformation t = sosies.get(currentTrial);
        currentTrial++;
        return t;
    }


    /**
     *  Gets the current running trial
     * @return
     */
    public int getCurrentTrial() {
        return currentTrial;
    }

    /**
     * Sets the trial. In case you want to start over
     * @param currentTrial
     */
    public void setCurrentTrial(int currentTrial) {
        this.currentTrial = currentTrial;
    }
}

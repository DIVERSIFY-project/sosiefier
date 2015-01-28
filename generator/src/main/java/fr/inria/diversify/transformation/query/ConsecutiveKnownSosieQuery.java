package fr.inria.diversify.transformation.query;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.SingleTransformation;
import fr.inria.diversify.transformation.TransformationJsonParser;
import fr.inria.diversify.transformation.TransformationParserException;
import java.io.File;
import java.util.*;

/**
 * Search for points of known sosies
 * <p/>
 * Created by marcel on 6/06/14.
 */
public class ConsecutiveKnownSosieQuery extends TransformationQuery {

    private ArrayList<SingleTransformation> sosies;

    private int currentTrial = 0;

    public ConsecutiveKnownSosieQuery(InputProgram inputProgram, ArrayList<SingleTransformation> transf) {
        super(inputProgram);
        extractSosies(transf);
    }

    public ConsecutiveKnownSosieQuery(InputProgram inputProgram) throws TransformationParserException {
        super(inputProgram);
        TransformationJsonParser parser = new TransformationJsonParser(false, getInputProgram());
        File f = new File(getInputProgram().getPreviousTransformationsPath());
        Collection<SingleTransformation> ts;
        if (f.isDirectory()) {
            ts = parser.parseDir(f.getAbsolutePath());
        } else {
            ts = parser.parseFile(f);
        }
        extractSosies(ts);
    }

    /**
     * Extracts the sosies from a transformation list
     *
     * @param transf
     */
    private void extractSosies(Collection<SingleTransformation> transf) {
        sosies = new ArrayList<>();
        for (SingleTransformation t : transf) {
            if (t.isSosie()) {
                sosies.add(t);
            }
        }
    }



    @Override
    public void setType(String type) {

    }

    @Override
    public SingleTransformation query() {
        SingleTransformation t = sosies.get(currentTrial);
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

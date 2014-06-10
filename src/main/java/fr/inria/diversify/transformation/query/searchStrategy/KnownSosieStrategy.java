package fr.inria.diversify.transformation.query.searchStrategy;

import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.AbstractTransformation;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationParser;
import fr.inria.diversify.util.Log;
import org.json.JSONException;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

/**
 * Search for points of known sosies
 * <p>
 * Created by marcel on 6/06/14.
 */
public class KnownSosieStrategy extends SearchStrategy implements ITransformationSearchStrategy {

    /**
     * Transformations found
     */
    List<Transformation> transformations;

    TransformationParser parser;

    private boolean findTransplants;

    public KnownSosieStrategy(InputProgram inputProgram) {
        super(inputProgram);
    }

    @Override
    public CodeFragmentList findFragments() {
        return null;
    }

    /**
     * Indicates if the trasnformation can be merged with the current ones
     * @param t
     * @return
     */
    protected boolean canBeMerged(Transformation t) {
        return true;
    }

    @Override
    public List<Transformation> findTransformations() throws SearchException {
        parser = new TransformationParser(false);
        try {
            List<Transformation> ts = parser.parseFile(
                    new File(getInputProgram().getPreviousTransformationsPath()));

            Random r = new Random();

            //Since r is uniformly distributed there is a very good probability that
            //making a maximum of ts.size attempts we tried most transformations in the list
            int attempts = 0;
            while ( transformations.size() < getInputProgram().getTransformationPerRun()
                    && attempts < ts.size() ) {
                Transformation t = ts.get(r.nextInt(ts.size()));
                if ( t.isSosie() && canBeMerged(t) ) {
                    transformations.add(t);
                }
                attempts++;
            }

        } catch (IOException e) {
            Log.error("Cannot open transformation file", e);
            throw new SearchException("Cannot open transformation file");
        } catch (JSONException e) {
            Log.error("Cannot parse JSON fule", e);
            throw new SearchException("Cannot parse JSON fule");
        }

        return transformations;
    }
}

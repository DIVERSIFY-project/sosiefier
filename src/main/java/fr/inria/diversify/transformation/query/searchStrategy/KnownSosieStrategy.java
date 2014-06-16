package fr.inria.diversify.transformation.query.searchStrategy;

import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationJsonParser;
import fr.inria.diversify.transformation.TransformationParserException;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import org.json.JSONException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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

    /**
     * Code fragments found
     */
    CodeFragmentList codeFragments;

    TransformationJsonParser parser;

    private boolean findTransplants;

    public KnownSosieStrategy(InputProgram inputProgram) {

        super(inputProgram);

    }

    @Override
    public CodeFragmentList findFragments() {
        if ( codeFragments == null ) {
            codeFragments = new CodeFragmentList();
            for ( Transformation t : findTransformations() ) {
                codeFragments.add(((ASTTransformation)t).getTransplantationPoint());
            }
        }
        return codeFragments;
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
    public List<Transformation> findTransformations() {

        if ( transformations == null ) {
            transformations = new ArrayList();
            parser = new TransformationJsonParser(false, getInputProgram());
            try {
                List<Transformation> ts = parser.parseFile(
                        new File(getInputProgram().getPreviousTransformationsPath()));

                //Get all the sosie
                ArrayList<Transformation> sosies = new ArrayList();
                for ( Transformation t : ts ) {
                    if ( t.isSosie() && t instanceof ASTTransformation) { sosies.add(t); }
                }

                Random r = new Random();
                while (transformations.size() < getPointCount() && sosies.size() > 0) {
                    int index = r.nextInt(sosies.size());
                    Transformation t = sosies.get(index);
                    transformations.add(t);
                    sosies.remove(index);
                }

            } catch (TransformationParserException e) {
                throw new RuntimeException(e);
            }
        }
        return transformations;
    }
}

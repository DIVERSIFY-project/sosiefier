package fr.inria.diversify.transformation.query;

import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationJsonParser;
import fr.inria.diversify.transformation.TransformationParserException;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Search for points of known sosies
 * <p>
 * Created by marcel on 6/06/14.
 */
public class KnownSosieQuery extends TransformationQuery {

    /**
     * Code fragments found
     */
    CodeFragmentList codeFragments;

    TransformationJsonParser parser;

    private boolean findTransplants;

    public KnownSosieQuery(InputProgram inputProgram) {

        super(inputProgram);

    }

    @Override
    public void setType(String type) {

    }

    @Override
    protected List<Transformation> query(int nb) {
        if ( transformations == null ) {
            transformations = new ArrayList();
            parser = new TransformationJsonParser(false, inputProgram);
            try {
                List<Transformation> ts = parser.parseFile(
                        new File(inputProgram.getPreviousTransformationsPath()));

                //Get all the sosie
                ArrayList<Transformation> sosies = new ArrayList();
                for ( Transformation t : ts ) {
                    if ( t.isSosie() && t instanceof ASTTransformation) { sosies.add(t); }
                }

                Random r = new Random();
                while (transformations.size() < nb && sosies.size() > 0) {
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

    /**
     * Indicates if the trasnformation can be merged with the current ones
     * @param t
     * @return
     */
    protected boolean canBeMerged(Transformation t) {
        return true;
    }

}

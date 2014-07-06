package fr.inria.diversify.transformation.query;

import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationJsonParser;
import fr.inria.diversify.transformation.TransformationParserException;
import fr.inria.diversify.transformation.ast.ASTTransformation;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

/**
 * Search for points of known sosies
 * <p/>
 * Created by marcel on 6/06/14.
 */
public class KnownSosieQuery extends TransformationQuery {
    /**
     * Previous sosies found.
     */
    ArrayList<Transformation> sosies;

    private boolean findTransplants;

    public KnownSosieQuery(InputProgram inputProgram) throws TransformationParserException {

        super(inputProgram);
        TransformationJsonParser parser = new TransformationJsonParser(false, getInputProgram());
        File f = new File(getInputProgram().getPreviousTransformationsPath());
        Collection<Transformation> ts;
        if (f.isDirectory()) {
            ts = parser.parseDir(f.getAbsolutePath());
        } else {
            ts = parser.parseFile(f);
        }
        //Get all the sosie
        sosies = new ArrayList<>();
        for (Transformation t : ts) {
            if (t.isSosie()) {
                sosies.add(t);
            }
        }

    }

    @Override
    public void setType(String type) {

    }

    @Override
    public List<Transformation> query(int nb) {

        //Check that all what we need is OK to fetch the transformations
        if (getInputProgram().getPreviousTransformationsPath() == null) {
            throw new RuntimeException("Input program has no previous transformation information");
        }

        transformations = new ArrayList();

        Random r = new Random();
        if (nb > sosies.size()) nb = sosies.size();
        int attempts = 0;
        while (transformations.size() < nb && attempts <= sosies.size()) {
            int index = r.nextInt(sosies.size());
            Transformation t = sosies.get(index);
            if (canBeMerged(t)) {
                transformations.add(t);
            }
            attempts++;
        }
        return transformations;
    }

    /**
     * Indicates if the trasnformation can be merged with the current ones
     *
     * @param t
     * @return
     */
    protected boolean canBeMerged(Transformation t) {

        boolean result = true;
        ASTTransformation ast = (ASTTransformation) t;
        String classFileT = ast.getTransplantationPoint().getCompilationUnit().getFile().getName();
        for (int i = 0; i < transformations.size() && result; i++) {
            ASTTransformation a = (ASTTransformation) transformations.get(i);
            String classFileA = a.getTransplantationPoint().getCompilationUnit().getFile().getName();
            result &= result && !classFileA.equals(classFileT);
        }
        return result;
    }

}

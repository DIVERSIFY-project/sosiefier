package fr.inria.diversify.transformation.query;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationJsonParser;
import fr.inria.diversify.transformation.TransformationParserException;
import fr.inria.diversify.transformation.ast.ASTTransformation;

import java.io.File;
import java.util.*;

/**
 * Search for points of known sosies
 * <p/>
 * Created by marcel on 6/06/14.
 */
public class KnownSosieQuery extends TransformationQuery {

    /**
     * Previous sosies found.
     */
    public ArrayList<Transformation> getSosies() {
        return sosies;
    }

    private ArrayList<Transformation> sosies;

    private boolean findTransplants;



    public KnownSosieQuery(InputProgram inputProgram, ArrayList<Transformation> transf) {
        super(inputProgram);
        extractSosies(transf);
    }

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
        extractSosies(ts);
    }

    /**
     * Extracts the sosies from a transformation list
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
    public void setType(String type) {

    }


    /**
     * Estimate the max number of multisosie transformations
     */
    private long maxNumberOfTransformations(int nb) {

        long z = getSosies().size();
        long max = z;
        for (int i = 0; i < nb - 1; i++) {
            z--;
            long preMax = max * z;
            //Avoid overflow
            if ( preMax < 0 ) return Long.MAX_VALUE;
            max = preMax;
        }

        z = nb;
        for ( int i = nb; i > 1; i-- ) {
            nb--;
            z = z * nb;
        }
        return max/z;
    }

    @Override
    public List<Transformation> query(int nb) {

        transformations = new ArrayList();

        Random r = new Random();

        if (nb > getSosies().size()) nb = getSosies().size();
        long maxTransfNumbers = maxNumberOfTransformations(nb);

        int transAttempts = 0;

        boolean found = true;

        //Try several times searching for a transformation we haven't found before.
        Integer[] indexes = new Integer[nb];
        while (found && transAttempts < maxTransfNumbers) {
            int attempts = 0;
            int i = 0;
            Arrays.fill(indexes,-1);
            //Build the transformation
            while (transformations.size() < nb && attempts < getSosies().size()) {
                int index = r.nextInt(getSosies().size());
                Transformation t = getSosies().get(index);
                if (canBeMerged(t)) {
                    indexes[i] = index;
                    i++;
                    transformations.add(t);
                }
                attempts++;
            }

            //See if the transformation was already found
            found = alreadyFound(indexes);

            transAttempts++;
        }

        if (transAttempts >= maxTransfNumbers) {
            throw new MaxNumberOfAttemptsReach(maxTransfNumbers, transAttempts);
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

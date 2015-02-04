package fr.inria.diversify.transformation.query;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationJsonParser;
import fr.inria.diversify.transformation.TransformationParserException;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

/**
 * Created by Simon on 27/11/14.
 */
public class FromListQuery extends TransformationQuery {

    private final List<Transformation> list;
    boolean shuffle = false;

    public FromListQuery(InputProgram inputProgram) throws TransformationParserException {
        super(inputProgram);
        TransformationJsonParser parser = new TransformationJsonParser(false, getInputProgram());
        File f = new File(getInputProgram().getPreviousTransformationsPath());
        Collection<Transformation> ts;
        if (f.isDirectory()) {
            ts = parser.parseDir(f.getAbsolutePath());
        } else {
            ts = parser.parseFile(f);
        }
        list = new ArrayList(ts);
    }

    @Override
    public Transformation query() throws QueryException {
        int index = 0;
        if(shuffle) {
            Random r = new Random();
            index = r.nextInt(list.size());
        }
        return list.remove(index);
    }

    public void setShuffle(boolean shuffle) {
        this.shuffle = shuffle;
    }
}

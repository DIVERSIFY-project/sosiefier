package fr.inria.diversify.transformation.switchsosie;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.persistence.json.input.JsonTransformationLoader;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.transformation.query.FromListQuery;
import fr.inria.diversify.transformation.query.QueryException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 16/09/15
 * Time: 11:49
 */
public class SwitchQuery extends FromListQuery {

    public SwitchQuery(InputProgram inputProgram) {
        super(inputProgram);
    }

    public SwitchQuery(InputProgram inputProgram, int rangeMin, int rangeMax)  {
        super(inputProgram);

        JsonTransformationLoader parser = new JsonTransformationLoader(getInputProgram());

        Collection<Transformation> ts = parser.load(getInputProgram().getPreviousTransformationsPath(), true)
                .stream()
                .filter(transformation -> transformation.getType().equals("adrStmt"))
                .collect(Collectors.toSet());

        ArrayList<Transformation> tmp = new ArrayList(ts);
        transformations = new ArrayList<>();
        for(int i = rangeMin; i < Math.min(rangeMax, tmp.size())  ; i++) {
            transformations.add(tmp.get(i));
        }
    }

    @Override
    public Transformation query() throws QueryException {
       return new SwitchTransformation((ASTTransformation)super.query());
    }

}

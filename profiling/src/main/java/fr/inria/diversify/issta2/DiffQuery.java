package fr.inria.diversify.issta2;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.logger.Diff;
import fr.inria.diversify.logger.JsonDiffInput;
import fr.inria.diversify.persistence.json.input.JsonTransformationLoader;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.query.FromListQuery;
import fr.inria.diversify.transformation.query.TransformationQuery;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * User: Simon
 * Date: 04/11/15
 * Time: 16:13
 */
public class DiffQuery extends FromListQuery {
    protected final Map<Transformation, Set<Diff>> transToDiffs;

    public DiffQuery(InputProgram inputProgram) {
        super(inputProgram);
        JsonTransformationLoader parser = new JsonTransformationLoader(getInputProgram());
        JsonDiffInput jsonDiffInput = new JsonDiffInput();
        parser.addSection(jsonDiffInput.getClass(), jsonDiffInput);

        Collection<Transformation> ts = parser.load(getInputProgram().getPreviousTransformationsPath(), true);

        transToDiffs = jsonDiffInput.getTransToDiffs();
        transformations = new ArrayList(ts);
    }

    public Map<Transformation, Set<Diff>> getTransToDiffs() {
        return transToDiffs;
    }
}

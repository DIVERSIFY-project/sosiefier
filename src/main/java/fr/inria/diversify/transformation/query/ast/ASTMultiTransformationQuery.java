package fr.inria.diversify.transformation.query.ast;

import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTMultiTransformation;
import fr.inria.diversify.transformation.query.TransformationQuery;
import org.json.JSONException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Deprecated. Will be deleted eventually
 *
 * Created by Simon on 21/05/14.
 */
public class ASTMultiTransformationQuery extends TransformationQuery {

    protected int nbTransformation;

    protected TransformationQueryFromList queryFromList;

    public ASTMultiTransformationQuery(ICoverageReport cr, int nbTransformation,
                                       String transformationDirectory) throws IOException, JSONException {
        queryFromList = new TransformationQueryFromList(cr, transformationDirectory);
        this.nbTransformation = nbTransformation;
    }

    @Override
    public void setType(String type) {

    }

    @Override
    public Transformation buildTransformation() throws Exception {
        List<Transformation> transformations = new ArrayList<>();

        for (int i = 0; i < nbTransformation; i++) {
            transformations.add(queryFromList.buildTransformation());
        }

        return new ASTMultiTransformation(transformations);
    }
}

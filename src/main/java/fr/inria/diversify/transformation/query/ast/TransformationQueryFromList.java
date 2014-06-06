package fr.inria.diversify.transformation.query.ast;

import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.transformation.*;
import fr.inria.diversify.transformation.query.TransformationQuery;
import org.json.JSONException;

import java.io.IOException;
import java.util.*;

/**
 * User: Simon
 * Date: 7/17/13
 * Time: 10:16 AM
 */
public class TransformationQueryFromList extends TransformationQuery {
    protected ICoverageReport coverageReport;
    private List<Transformation> transformations;

    public TransformationQueryFromList(ICoverageReport cr, String transformationDirectory) throws IOException, JSONException {
        this.coverageReport = cr;
        init(transformationDirectory);
    }

    @Override
    public void setType(String type) {

    }

    @Override
    public Transformation buildTransformation() throws Exception {
        Random r = new Random();
        double coverage = 0;
        Transformation t =transformations.get(r.nextInt(transformations.size()));;
        while(coverage == 0 && t.getType().equals("delete")) {
            t = transformations.get(r.nextInt(transformations.size()));

        }
        return t;
    }

    public Set<Transformation> getTransformations(int nb) throws Exception {
        HashSet<Transformation> set = new HashSet<Transformation>();

        if(nb <= 0) {
            set.addAll(transformations);
        }
        else {
            while (set.size() < nb)
                set.add(buildTransformation());
        }
        return set;
    }

    protected void init(String transformationDirectory) throws IOException, JSONException {
        TransformationParser tf = new TransformationParser(false);
        transformations = new ArrayList<>(tf.parseDir(transformationDirectory));
    }
}

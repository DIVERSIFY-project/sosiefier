package fr.inria.diversify.persistence.json;

import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTDelete;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Collection;

/**
 * Created by marodrig on 08/01/2015.
 */
public class JsonASTAddSection extends JsonASTSectionOutput {
    @Override
    public void write(Collection<Transformation> transformations) {
        super.write(transformations);
        try {
            JSONObject to = getOutputObject().getJSONObject(TRANSFORMATIONS);
            for (Transformation t : transformations) {
                if ( t instanceof ASTAdd ) {
                    ASTAdd d = (ASTAdd)t;
                    to.put("transplantationPoint", codeFragmentToJSON(d.getTransplantationPoint()));
                    to.put("transplant", codeFragmentToJSON(d.getTransplant()));
                }
            }
        } catch (JSONException e) {
            throw new PersistenceException(e);
        }

    }
}

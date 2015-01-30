package fr.inria.diversify.persistence.json.output;

import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTReplace;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by marodrig on 08/01/2015.
 */
public class JsonAstReplaceOutput extends JsonAstTransformationOutput {


    /**
     * Puts the transformation data into the JSON Object.
     *
     * @param object         Objecto to putDataToJSON data
     * @param transformation Transformation to obtain data from
     */
    protected void putDataToJSON(JSONObject object, Transformation transformation) throws JSONException {
        if (transformation instanceof ASTReplace) {
            super.putDataToJSON(object, transformation);
            ASTReplace d = (ASTReplace) transformation;
            object.put(TRANSPLANT_POINT, codeFragmentToJSON(d.getTransplantationPoint()));
            object.put(TRANSPLANT, codeFragmentToJSON(d.getTransplant()));
            object.put(VARIABLE_MAP, d.getVarMapping());
        }
    }

    @Override
    public boolean canStore(Transformation t) {
        return t instanceof ASTReplace;
    }
}

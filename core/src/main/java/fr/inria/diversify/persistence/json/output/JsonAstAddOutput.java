package fr.inria.diversify.persistence.json.output;

import fr.inria.diversify.transformation.SingleTransformation;
import fr.inria.diversify.transformation.ast.ASTAdd;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by marodrig on 08/01/2015.
 */

//C:\MarcelStuff\projects\DIVERSE\sosie_generator\sosies-generator\src\main\java\fr\inria\diversify\persistence\json\output\JsonAstAddOutput.java
public class JsonAstAddOutput extends JsonAstTransformationOutput {

    /**
     * Puts the transformation data into the JSON Object.
     *
     * @param object         Objecto to putDataToJSON data
     * @param transformation Transformation to obtain data from
     */
    @Override
    protected void putDataToJSON(JSONObject object, SingleTransformation transformation) throws JSONException {
        if (transformation instanceof ASTAdd) {
            super.putDataToJSON(object, transformation);
            ASTAdd d = (ASTAdd) transformation;
            object.put(TRANSPLANT_POINT, codeFragmentToJSON(d.getTransplantationPoint()));
            object.put(TRANSPLANT, codeFragmentToJSON(d.getTransplant()));
            object.put(VARIABLE_MAP, d.getVarMapping());
        }
    }

    @Override
    public boolean canStore(SingleTransformation t) {return t instanceof ASTAdd;}
}

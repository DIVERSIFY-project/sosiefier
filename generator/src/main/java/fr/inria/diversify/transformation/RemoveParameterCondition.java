package fr.inria.diversify.transformation;

import com.fasterxml.uuid.Generators;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.code.CtIf;

/**
 * User: Simon
 * Date: 27/05/16
 * Time: 10:53
 */
public class RemoveParameterCondition extends SpoonTransformation<CtIf, CtIf> {

    public RemoveParameterCondition() {
        type = "special";
        name = "removeParameterCondition";
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("type", type);
        object.put("name", name);
        object.put("failures", failuresToJSON());
        object.put("status", status);
        if ( index == null ) {
            globalID++;
            index = Generators.timeBasedGenerator().generate();
        }
        object.put("tindex", index);
        object.put("series", getSeries());

        if(parent != null)
            object.put("parent",parent.toJSONObject());

        object.put("transplantationPoint", CtElemToJSON(transplantationPoint));
        return object;
    }
}

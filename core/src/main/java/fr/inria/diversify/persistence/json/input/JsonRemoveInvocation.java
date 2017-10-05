package fr.inria.diversify.persistence.json.input;

import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import org.json.JSONObject;

/**
 * Created by nharrand on 09/08/17.
 */
public class JsonRemoveInvocation extends JsonTransformationInput {

    public JsonRemoveInvocation(InputProgram inputProgram) {
        super(inputProgram);
    }

    public JsonRemoveInvocation(InputProgram inputProgram, JSONObject jsonObject) {
        super(inputProgram, jsonObject);
    }

    @Override
    protected Transformation build() {
        return null;
    }

    @Override
    public boolean canRead(String s) {
        String[] r = s.split("\\.");
        if ( r.length != 2 ) return false;
        return r[0].equals("del") && r[1].toLowerCase().contains("removeinvocation");
    }
}

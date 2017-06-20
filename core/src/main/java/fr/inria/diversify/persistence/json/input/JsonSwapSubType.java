package fr.inria.diversify.persistence.json.input;

import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import org.json.JSONObject;

/**
 * Created by nharrand on 31/05/17.
 */
public class JsonSwapSubType extends JsonTransformationInput {
    public JsonSwapSubType(InputProgram inputProgram) {
        super(inputProgram);
    }

    public JsonSwapSubType(InputProgram inputProgram, JSONObject jsonObject) {
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
        return  r[0].equals("replace") && r[1].toLowerCase().contains("swapsubtype");
    }
}
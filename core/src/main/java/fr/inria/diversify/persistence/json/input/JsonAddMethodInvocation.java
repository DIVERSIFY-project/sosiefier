package fr.inria.diversify.persistence.json.input;

import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import org.json.JSONObject;

/**
 * Created by nharrand on 06/12/16.
 */
public class JsonAddMethodInvocation extends JsonTransformationInput {
    public JsonAddMethodInvocation(InputProgram inputProgram) {
        super(inputProgram);
    }

    public JsonAddMethodInvocation(InputProgram inputProgram, JSONObject jsonObject) {
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
        return  r[0].equals("add") && r[1].toLowerCase().contains("addMethodInvocation");
    }
}

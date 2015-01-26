package fr.inria.diversify.persistence.json.input;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import org.json.JSONObject;

import java.util.HashMap;

/**
 * Created by marodrig on 14/01/2015.
 */
public class JsonHeaderInput extends JsonSectionInput {

    public JsonHeaderInput(InputProgram inputProgram, JSONObject jsonObject) {
        super(inputProgram, jsonObject);
    }

    @Override
    public void read(HashMap<Integer, Transformation> transformations) {

    }
}

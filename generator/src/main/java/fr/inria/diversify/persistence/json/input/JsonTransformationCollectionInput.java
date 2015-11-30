package fr.inria.diversify.persistence.json.input;

import fr.inria.diversify.runner.InputProgram;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collection;

/**
 * User: Simon
 * Date: 23/03/15
 * Time: 13:35
 */
public class JsonTransformationCollectionInput extends JsonAstTransformationCollectionInput {

    public JsonTransformationCollectionInput(InputProgram inputProgram, JSONObject jsonObject) {
        super(inputProgram, jsonObject);
    }


    protected Collection<JsonTransformationInput> buildSections() {
        ArrayList<JsonTransformationInput> sections = new ArrayList<>();
        sections.add(new JsonAstAddInput(getInputProgram()));
        sections.add(new JsonAstReplaceInput(getInputProgram()));
        sections.add(new JsonAstDeleteInput(getInputProgram()));
        sections.add(new InstanceTransformationInput(getInputProgram()));

        return sections;
    }
}

package fr.inria.diversify.ut.json.input;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.persistence.json.input.JsonHeaderInput;
import fr.inria.diversify.persistence.json.input.JsonSosiesInput;

import java.io.InputStreamReader;

/**
 * Created by marodrig on 18/02/2015.
 */
public class JsonSosiesInputForUT extends JsonSosiesInput {

    public JsonSosiesInputForUT(InputStreamReader r, InputProgram inputProgram) {
        super(r, inputProgram);
        setSection(JsonHeaderInput.class, new JsonHeaderInputTest.JsonHeaderInputForUT());
    }

}

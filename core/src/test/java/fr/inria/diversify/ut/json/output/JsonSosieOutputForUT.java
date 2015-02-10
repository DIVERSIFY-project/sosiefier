package fr.inria.diversify.ut.json.output;

import fr.inria.diversify.persistence.json.output.JsonHeaderOutput;
import fr.inria.diversify.persistence.json.output.JsonSosiesOutput;
import fr.inria.diversify.transformation.Transformation;
import org.json.JSONObject;

import java.util.Collection;

import static fr.inria.diversify.ut.json.output.JsonHeaderOutputTest.*;
import static fr.inria.diversify.ut.json.output.JsonHeaderOutputTest.GEN_VER;

/**
 * Created by marodrig on 14/01/2015.
 */
public class JsonSosieOutputForUT extends JsonSosiesOutput {

    public JsonSosieOutputForUT(Collection<Transformation> transformations, String uri,
                                String srcPom, String generatorPom) {
        super(transformations, uri, srcPom, generatorPom);

        //Mocks the header section
        setSection(JsonHeaderOutput.class, new JsonHeaderOutputForUT(SRC_POM, GEN_VER));
    }

    public JSONObject getJSONObject() {
        return outputObject;
    }

    public JSONObject writeToJsonNow() {
        writeToJson();
        return getJSONObject();
    }
}

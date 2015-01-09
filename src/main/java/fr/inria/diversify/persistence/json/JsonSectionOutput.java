package fr.inria.diversify.persistence.json;

import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.persistence.SectionOuput;
import fr.inria.diversify.transformation.Transformation;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Collection;
import java.util.List;

/**
 * Created by marodrig on 08/01/2015.
 */
public abstract class JsonSectionOutput extends SectionOuput {

    public static final String TRANSFORMATIONS = "transformations";

    /**
     * Resulting global object
     */
    JSONObject outputObject;


    public void setOutputObject(JSONObject outputObject) {
        this.outputObject = outputObject;
    }

    /**
     * Resulting global object
     * @return A JSON Object to write to
     */
    public JSONObject getOutputObject() {
        return outputObject;
    }


}

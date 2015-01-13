package fr.inria.diversify.persistence.json.output;

import fr.inria.diversify.persistence.SectionOutput;
import org.json.JSONObject;

/**
 * Created by marodrig on 08/01/2015.
 */
public abstract class JsonSectionOutput extends SectionOutput {

    public static final String TRANSFORMATIONS = "transformations";

    public static final String TRANSPLANT_POINT = "transplantationPoint";

    public static final String TRANSPLANT = "transplant";

    public static final String POSITION = "position";

    public static final String SOURCE_CODE = "sourcecode";

    public static final String STATUS = "status";

    public static final String TINDEX = "tindex";

    public static final String NAME = "name";

    public static final String TRANSF_TYPE = "type";

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

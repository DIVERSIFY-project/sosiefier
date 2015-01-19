package fr.inria.diversify.persistence.json.output;

import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.persistence.SectionOutput;
import fr.inria.diversify.persistence.TransformationsOutput;
import fr.inria.diversify.transformation.Transformation;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

/**
 * A transformation output to a JSON file
 * <p>
 * Created by marodrig on 08/01/2015.
 */
public class JsonTransformationOutput extends TransformationsOutput {

    private static final String UNABLE_WRITE_JSON_MSG = "Unable to write json file. Cause: ";

    /**
     * Resulting global object
     */
    protected JSONObject outputObject;

    public JsonTransformationOutput(Collection<Transformation> transformations, String uri, List<SectionOutput> sections) {
        super(transformations, uri, sections);
    }

    public JsonTransformationOutput(Collection<Transformation> transformations, String uri) {
        super(transformations, uri);
    }


    @Override
    protected void prepareSection(SectionOutput s) {
        if (s instanceof JsonSectionOutput) ((JsonSectionOutput) s).setOutputObject(outputObject);
    }

    /**
     * Creates the JSON object
     */
    @Override
    protected void initialize() {
        outputObject = new JSONObject();
    }

    /**
     * Writes the JSON object
     */
    @Override
    protected void close() {
        try {
            FileWriter fw = new FileWriter(uri);
            outputObject.write(fw);
            fw.close();
        } catch (IOException | JSONException e) {
            throw new PersistenceException(UNABLE_WRITE_JSON_MSG + e.getMessage(), e);
        }
    }

}

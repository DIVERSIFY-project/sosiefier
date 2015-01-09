package fr.inria.diversify.persistence.json;

import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.persistence.SectionOuput;
import fr.inria.diversify.persistence.TransformationOutput;
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
public class JsonTransformationOutput extends TransformationOutput {

    private static final String UNABLE_WRITE_JSON_MSG = "Unable to write json file. Cause: ";

    /**
     * Resulting global object
     */
    JSONObject outputObject;

    public JsonTransformationOutput(List<SectionOuput> sections, String uri, Collection<Transformation> transformations) {
        super(sections, uri, transformations);
    }

    public JsonTransformationOutput(List<SectionOuput> sections, String uri) {
        super(sections, uri);
    }

    public JsonTransformationOutput(Collection<Transformation> transformations, String uri) {
        super(transformations, uri);
    }


    @Override
    protected void prepareSection(SectionOuput s) {
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

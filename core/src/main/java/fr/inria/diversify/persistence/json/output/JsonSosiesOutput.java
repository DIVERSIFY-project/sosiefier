package fr.inria.diversify.persistence.json.output;

import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.transformation.Transformation;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by marodrig on 09/01/2015.
 */
public class JsonSosiesOutput {

    private static final String UNABLE_WRITE_JSON_MSG = "Unable write to json";

    protected final JSONObject outputObject;

    private final Collection<Transformation> transformations;

    private final String path;

    public JsonSosiesOutput(Collection<Transformation> transformations, String path) {
        this.transformations = transformations;
        this.path = path;
        outputObject = new JSONObject();
    }

    public void write() {

        //Make sure all transformations have unique id. //TODO: Investigate the advantages of adding a UUId
        int id = 0;
        for ( Transformation t : transformations ) t.setIndex(id++);

        //Write failures to file
        JsonFailuresOutput failures = new JsonFailuresOutput();
        failures.setTransformations(transformations);
        failures.write(outputObject);

        Collection<JsonAstTransformationOutput> sections =Arrays.asList(new JsonAstTransformationOutput[] {
                new JsonAstReplaceOutput(),
                new JsonAstAddOutput(),
                new JsonAstDeleteOutput()
        });

        //Write transformations to file
        for ( JsonAstTransformationOutput s : sections ) {
            s.setTransformations(transformations);
            s.setFailuresDict(failures.getFailuresDict());
            s.write(outputObject);
        }

        try {
            FileWriter fw = new FileWriter(path);
            outputObject.write(fw);
            fw.close();
        } catch (IOException | JSONException e) {
            throw new PersistenceException(UNABLE_WRITE_JSON_MSG + e.getMessage(), e);
        }
    }
}

package fr.inria.diversify.persistence.json.input;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.transformation.Transformation;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/**
 * Created by marodrig on 09/01/2015.
 */
public class JsonSosiesInput {

    /**
     * Path of the json file
     */
    private final String jsonPath;

    /**
     * Stream reader to obtain the JSON text from
     */
    private InputStreamReader streamReader;

    /**
     * JSON Object loaded
     */
    private JSONObject jsonObject;

    /**
     * Input program to obtain the code fragments for the transformations
     */
    private InputProgram inputProgram;
    private Collection<String> errors;

    public JsonSosiesInput(InputStreamReader r, InputProgram inputProgram) {
        this("", inputProgram);
        this.streamReader = r;

    }

    public JsonSosiesInput(String jsonPath, InputProgram inputProgram) {
        this.jsonPath = jsonPath;
        this.inputProgram = inputProgram;
    }

    protected void open() {
        BufferedReader br = null;
        try {
            if ( streamReader == null ) streamReader = new FileReader(jsonPath);
            br = new BufferedReader(streamReader);
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                line = br.readLine();
            }
            if (sb.length() == 0) throw new PersistenceException("Empty JSON. No lines to read");

            jsonObject = null;
            try {
                jsonObject = new JSONObject(sb.toString());
            } catch (JSONException e) {
                throw new PersistenceException("Unable to parse text into JSON file", e);
            }
        } catch (IOException e) {
            throw new PersistenceException("Unable to parse text file into JSON file", e);
        } finally {
            if (br != null) try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Read the transformations from the JSON file
     * @return A collection the transformations
     */
    public Collection<Transformation> read() {
        open(); //Open the json file

        HashMap<Integer, Transformation> result = new HashMap<>();
        JsonFailuresInput failures = new JsonFailuresInput(inputProgram, jsonObject);
        failures.setErrors(getErrors());
        failures.read(result);

        JsonAstTransformationCollectionInput asts = new
                JsonAstTransformationCollectionInput(inputProgram, jsonObject);
        asts.setFailures(failures.getFailures());
        asts.read(result);

        return result.values();
    }

    public void setInputProgram(InputProgram inputProgram) {
        this.inputProgram = inputProgram;
    }

    /**
     * Input program to obtain the code fragments for the transformations
     */
    public InputProgram getInputProgram() {
        return inputProgram;
    }

    /**
     * Errors during the loading process
     * @return
     */
    public Collection<String> getErrors() {
        if ( errors == null ) errors = new ArrayList<>();
        return errors;
    }

}

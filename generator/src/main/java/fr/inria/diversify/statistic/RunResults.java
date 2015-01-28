package fr.inria.diversify.statistic;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.SingleTransformation;
import fr.inria.diversify.transformation.TransformationJsonParser;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Class to store and retrieve information on the results of each Diversify run
 * <p>
 * Created by marcel on 22/06/14.
 */
public class RunResults {

    private int id;

    private int status;

    private int incrementalSeries;

    /**
     * Description of the test failed for this transformation
     */
    private List<String> failedTests;

    /**
     * List of transformations applied in the run already serialized to JSON
     */
    private JSONArray transformationsJSON;


    /**
     * Deserialises the run result from a JSON object
     *
     * @param run JSON object containing the result information
     */
    public void fromJSONObject(JSONObject run) throws JSONException {
        try {
            id = run.getInt("id");
            status = run.getInt("status");
            incrementalSeries = run.getInt("incrementalSeries");
            JSONArray failedArray = run.getJSONArray("failedTests");
            failedTests = new ArrayList<>();
            for (int i = 0; i < failedArray.length(); i++) {
                failedTests.add(failedArray.getString(i));
            }
            transformationsJSON = run.getJSONArray("transformations");
        } catch (JSONException e) {
            throw new JSONException(
                    "Make sure the .json file given is a Sosie Run. Cannot parse the Results object because: "
                            + e.getMessage());
        }
    }

    /**
     * Serializes the result to JSON Format
     *
     * @return A JSON object
     * @throws JSONException
     */
    public JSONObject toJSONObject() throws JSONException {
        JSONObject result = new JSONObject();
        result.put("id", id);
        result.put("incrementalSeries", incrementalSeries);
        result.put("status", status);
        result.put("failedTests", failedTests);
        result.put("transformations", transformationsJSON);
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(getIncrementalSeries()).append("Sz: ").append(getTransformationSize());
        return sb.toString();
    }

    /**
     * Saves the result to file
     */
    public void saveToFile(String fileName) throws IOException, JSONException {
        FileWriter fw = null;
        try {
            fw = new FileWriter(fileName);
            JSONObject obj = toJSONObject();
            obj.write(fw);
        } finally {
            if (fw != null) {
                fw.close();
            }
        }
    }


    /**
     * Loads the serialization from file to this RunResult object
     *
     * @param file Json file containing this object
     * @throws IOException
     * @throws JSONException
     */
    public void loadFromFile(File file) throws IOException, JSONException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                line = br.readLine();
            }

            JSONObject jsonObject = new JSONObject(sb.toString());
            fromJSONObject(jsonObject);

        } finally {
            if (br != null) {
                br.close();
            }
        }
    }

    /**
     * Loads the serialization from file to this RunResult object
     *
     * @param fileName Name of the json file containing this object
     * @throws IOException
     * @throws JSONException
     */
    public void loadFromFile(String fileName) throws IOException, JSONException {
        loadFromFile(new File(fileName));
    }

    /**
     * Parse the stored transformations.
     *
     * @param inputProgram Input program over which the transformations where made
     * @return
     */
    public List<SingleTransformation> parseTransformations(InputProgram inputProgram) {
        TransformationJsonParser parser = new TransformationJsonParser(false, inputProgram);
        ArrayList<SingleTransformation> result = new ArrayList<>();
        for (int i = 0; i < transformationsJSON.length(); i++) {
            try {
                SingleTransformation t = parser.parseTransformation(transformationsJSON.getJSONObject(i));
                result.add(t);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return result;
    }

    /**
     * List of transformations applied in the run
     */
    public JSONArray getTransformationJSON() {
        return transformationsJSON;
    }

    public void setTransformations(Collection<SingleTransformation> transformations) {
        JSONArray array = new JSONArray();
        for (SingleTransformation t : transformations) {
            try {
                array.put(t.toJSONObject());
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
        setTransformations(array);
    }

    public void setTransformations(JSONArray transformations) {
        this.transformationsJSON = transformations;
    }

    /**
     * Description of the test failed for this transformation
     */
    public List<String> getFailedTests() {
        return failedTests;
    }

    public void setFailedTests(List<String> failedTests) {
        this.failedTests = failedTests;
    }

    /**
     * Number of transformations applied in this run
     */
    public int getTransformationSize() {
        return transformationsJSON != null ? transformationsJSON.length() : 0;
    }

    /**
     * Status of the run:
     * 0 - Sosie
     * -1 - Failed test
     * -2 - Failed compilation
     * -3 - Not run
     */
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * Index of the trial. I.e. trial number.
     * <p>
     * The first run has id : milliseconds()_0.
     * The second run has id : milliseconds()_1.
     * ....
     * The Nth run has id : milliseconds()_(n-1).
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isSosieRun() {
        return status == 0;
    }

    public int getIncrementalSeries() {
        return incrementalSeries;
    }

    public void setIncrementalSeries(int incrementalSeries) {
        this.incrementalSeries = incrementalSeries;
    }


}

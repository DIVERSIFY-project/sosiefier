package fr.inria.diversify.persistence.json.input;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.persistence.Header;
import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.util.*;

/**
 * User: Simon
 * Date: 23/03/15
 * Time: 16:01
 */
public class JsonTransformationLoader {

    private String jsonPath;

    private InputStreamReader streamReader;

    /**
     * JSON Object loaded
     */
    private JSONObject jsonObject;

    /**
     * Input program to obtain the code fragments for the transformations
     */
    private InputProgram inputProgram;

    /**
     * Errors from the reader
     */
    private List<String> loadMessages;

    /**
     * Header from the reader
     */
    private Header header;

    /**
     * Visibles section for reading customization
     */
    private HashMap<String, JsonSectionInput> sections;

    public JsonTransformationLoader(InputProgram inputProgram) {
        assert inputProgram.getFactory() != null;

        this.inputProgram = inputProgram;
        initSections();
    }

    public JsonTransformationLoader(InputStreamReader r, InputProgram inputProgram) {
        this("", inputProgram);
        this.setStreamReader(r);
    }

    public JsonTransformationLoader(String jsonPath, InputProgram inputProgram) {
        this.setJsonPath(jsonPath);
        this.inputProgram = inputProgram;
        initSections();
    }

    /**
     * Sets a section in the list of sections.
     * There is only one section per class in the output object
     * @param section Output Section to be set
     */
    public void setSection(Class<? extends JsonSectionInput> aClass, JsonSectionInput section) {
        sections.put(aClass.getName(), section);
    }

    /**
     * Get the section from the list
     * @param aClass
     * @return
     */
    public JsonSectionInput getSection(Class<? extends JsonSectionInput> aClass){
        return sections.get(aClass.getName());
    }


    protected void open() {
        BufferedReader br = null;
        try {
//            if ( getStreamReader() == null ) setStreamReader(new FileReader(getJsonPath()));
            br = new BufferedReader(new FileReader(getJsonPath()));
//            br = new BufferedReader(getStreamReader());
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
     * Init all sections in the input
     */
    private void initSections() {
        sections = new HashMap<>();
        setSection(JsonFailuresInput.class, new JsonFailuresInput(inputProgram, jsonObject));
        setSection(JsonTransformationCollectionInput.class,
                new JsonTransformationCollectionInput(inputProgram, jsonObject));
        setSection(JsonHeaderInput.class, new JsonHeaderInput(inputProgram, jsonObject));
    }

    /**
     * Read the transformations from the JSON file
     * @return A collection the transformations
     * @throws fr.inria.diversify.persistence.PersistenceException in case the read has to many errors
     */
    public Collection<Transformation> read() {
        open(); //Open the json file

        HashMap<UUID, Transformation> result = new HashMap<>();
        JsonHeaderInput headerInput = (JsonHeaderInput)getSection(JsonHeaderInput.class);
        headerInput.setJsonObject(jsonObject);
        headerInput.setInputProgram(inputProgram);
        headerInput.setLoadMessages(getLoadMessages());
        headerInput.read(result);
        header = headerInput.getHeader();

        JsonFailuresInput failures = (JsonFailuresInput) getSection(JsonFailuresInput.class);
        failures.setJsonObject(jsonObject);
        failures.setInputProgram(inputProgram);
        failures.setLoadMessages(getLoadMessages());
        failures.read(result);

        JsonTransformationCollectionInput asts = (JsonTransformationCollectionInput)
                getSection(JsonTransformationCollectionInput.class);
        asts.setJsonObject(jsonObject);
        asts.setInputProgram(inputProgram);
        asts.setLoadMessages(getLoadMessages());
        asts.setFailures(failures.getFailures());
        asts.read(result);

        for ( JsonSectionInput s : sections.values() ) {
            if ( s.equals(headerInput) || s.equals(failures) || s.equals(asts) ) continue;
            s.setInputProgram(inputProgram);
            s.setJsonObject(jsonObject);
            s.read(result);
        }

        return result.values();
    }

    public Collection<Transformation> load(String dirOrFile, boolean set) {
        Collection<Transformation> transformations;
        if(set) {
            transformations = new HashSet<>();
        } else {
            transformations = new ArrayList<>();
        }
        File file = new File(dirOrFile);

        if(file.isDirectory()) {
            for(File f: file.listFiles()) {
                try {
                    jsonPath = f.getAbsolutePath();
                    transformations.addAll(read());
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.debug("");
                }
            }
        }  else {
            jsonPath = dirOrFile;
            transformations.addAll(read());
        }

        return transformations;
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
    public List<String> getLoadMessages() {
        if ( loadMessages == null ) loadMessages = new ArrayList<>();
        return loadMessages;
    }

    public Header getHeader() {
        if ( header == null ) throw new PersistenceException("Handler unset. Must call read method first");
        return header;
    }

    /**
     * Path of the json file
     */
    public String getJsonPath() {
        return jsonPath;
    }

    public void setJsonPath(String jsonPath) {
        this.jsonPath = jsonPath;
    }

    /**
     * Stream reader to obtain the JSON text from
     */
    public InputStreamReader getStreamReader() {
        return streamReader;
    }

    public void setStreamReader(InputStreamReader streamReader) {
        this.streamReader = streamReader;
    }


}

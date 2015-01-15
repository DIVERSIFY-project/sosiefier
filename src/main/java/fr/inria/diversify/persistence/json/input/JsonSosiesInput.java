package fr.inria.diversify.persistence.json.input;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.persistence.SectionInput;
import fr.inria.diversify.persistence.TransformationsInput;
import fr.inria.diversify.transformation.Transformation;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by marodrig on 09/01/2015.
 */
public class JsonSosiesInput extends TransformationsInput {


    private InputStreamReader streamReader;

    private JSONObject jsonObject;

    /**
     * Input program to obtain the code fragments for the transformations
     */
    private InputProgram inputProgram;

    public JsonSosiesInput(InputStreamReader reader) {
        this("");
        this.streamReader = reader;
    }

    public JsonSosiesInput(String uri) {
        super(uri);
        sections = new ArrayList<>();
        sections.add(new JsonAstTransformationCollectionInput());
        sections.add(new JsonAstDeleteInput());
        sections.add(new JsonAstAddInput());
        sections.add(new JsonAstReplaceInput());
        sections.add(new JsonHeaderInput());
    }

    public JsonSosiesInput(InputStreamReader r, InputProgram inputProgram) {
        this(r);
        this.inputProgram = inputProgram;
    }

    public JsonSosiesInput(String uri, InputProgram inputProgram) {
        super(uri);
        this.inputProgram = inputProgram;
    }

    @Override
    protected void close() {

    }

    @Override
    protected void open() {
        BufferedReader br = null;
        try {
            if ( streamReader == null ) streamReader = new FileReader(uri);
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

    @Override
    public Collection<Transformation> read() {
        if ( inputProgram == null ) throw new PersistenceException("Input program not set");
        return super.read();
    }

    @Override
    protected void initializeSection(SectionInput section) {
        super.initializeSection(section);
        if ( section instanceof JsonSectionInput) {
            JsonSectionInput s = (JsonSectionInput) section;
            s.setJsonObject(jsonObject);
            s.setInputProgram(inputProgram);
        }
    }

    @Override
    protected Collection<String> sectionNames() {
        ArrayList<String> result = new ArrayList<>();
        Iterator<?> keys = jsonObject.keys();
        while( keys.hasNext() ){
            result.add((String)keys.next());
        }
        return result;
    }

    public void setInputProgram(InputProgram inputProgram) {
        this.inputProgram = inputProgram;
    }

    public InputProgram getInputProgram() {
        return inputProgram;
    }
}

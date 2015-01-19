package fr.inria.diversify.persistence.json.input;

import fr.inria.diversify.persistence.InputSectionLocator;
import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.persistence.SectionInput;
import fr.inria.diversify.persistence.TransformationsInput;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by marodrig on 09/01/2015.
 */
public class JsonSosiesInput extends TransformationsInput {


    private JSONObject jsonObject;

    public JsonSosiesInput(String uri, InputSectionLocator sectionLocator) {
        super(uri, sectionLocator);
    }

    @Override
    protected void close() {

    }

    @Override
    protected void open() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(uri));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                line = br.readLine();
            }
            if (sb.length() == 0) throw new PersistenceException("Empty JSON file");

            jsonObject = null;
            try {
                jsonObject = new JSONObject(sb.toString());
            } catch (JSONException e) {
                throw new PersistenceException("Unable to parse text file into JSON file", e);
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
    protected void initializeSection(SectionInput section) {
        if ( section instanceof JsonSectionInput) {
            ((JsonSectionInput)section).setJsonObject(jsonObject);
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
}

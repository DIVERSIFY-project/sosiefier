package fr.inria.diversify.sosie;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationJsonParser;
import fr.inria.diversify.transformation.TransformationParserException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;

/**
 * A class to create a pool of sosies from a transformation directory
 * <p/>
 * Created by marodrig on 19/06/2014.
 */
public class SosiePoolCreator {

    InputProgram inputProgram;

    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public SosiePoolCreator(InputProgram inputProgram) {

        this.inputProgram = inputProgram;
        setProperties(new Properties());
        //Collecto only sosies, this is for the parser and should not be
        getProperties().setProperty("status", "0");
        //Types fo transformations that we want by default
        getProperties().setProperty("type", "adrStmt");
        //Names of the transformations that we want by default
        getProperties().setProperty("name", "replace replaceRandom replaceReaction replaceWittgenstein  delete");
    }

    /**
     * Creates the pool of transformations
     */
    public void create(String outputFile) throws TransformationParserException {
        try {
            //Check that all what we need is OK to fetch the transformations
            if (inputProgram.getPreviousTransformationsPath() == null) {
                throw new RuntimeException("Input program has no previous transformation information");
            }

            TransformationJsonParser parser = new TransformationJsonParser(false, inputProgram);
            //Collecto only sosies, this is for the parser and should not be changed.
            // Overwrite in case the user has changed this.
            getProperties().setProperty("status", "0");
            parser.setFilterProperties(properties);
            Collection<Transformation> ts = parser.parseDir(inputProgram.getPreviousTransformationsPath());

            JSONArray array = new JSONArray();
            for (Transformation t : ts) {
                //Allow only sosies
                if (t.isSosie()) {
                    //Avoid repeated transformations
                    boolean unique = true;
                    int index = 0;
                    JSONObject transJson = t.toJSONObject();
                    while (unique && array.length() > index) {
                        unique = !transJson.toString().equals(array.getJSONObject(index).toString());
                        index++;
                    }
                    String type = getProperties().getProperty("type", "");
                    String names = getProperties().getProperty("name", "");
                    if (unique &&
                            (type.equals("") || transJson.get("type").equals(type)) &&
                            (names.equals("") || names.contains((String) transJson.get("name")))) {
                        array.put(transJson);
                    }
                }
            }
            FileWriter fw = new FileWriter(outputFile);
            array.write(fw);
            fw.close();
        } catch (JSONException | IOException e) {
            throw new TransformationParserException(e);
        }

    }


}

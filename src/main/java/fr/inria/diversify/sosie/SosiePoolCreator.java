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
 *
 * Created by marodrig on 19/06/2014.
 */
public class SosiePoolCreator {

    InputProgram inputProgram;

    private Properties properties;

    public SosiePoolCreator(InputProgram inputProgram) {

        this.inputProgram = inputProgram;
        setProperties(new Properties());
        getProperties().setProperty("status", "0");
        getProperties().setProperty("type", "adrStmt");
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
                    while ( unique && array.length() > index ) {
                        unique = !transJson.toString().equals(array.getJSONObject(index).toString());
                        index++;
                    }
                    if ( unique ) array.put(transJson);
                }
            }
            FileWriter fw = new FileWriter(outputFile);
            array.write(fw);
            fw.close();
        } catch (JSONException | IOException e) {
            throw new TransformationParserException(e);
        }

    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}

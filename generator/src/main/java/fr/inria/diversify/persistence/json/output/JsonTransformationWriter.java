package fr.inria.diversify.persistence.json.output;

import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.transformation.Transformation;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * User: Simon
 * Date: 23/03/15
 * Time: 16:08
 */
public class JsonTransformationWriter {

    protected static final String UNABLE_WRITE_JSON_MSG = "Unable write to json";

    protected JSONObject outputObject;

    protected Collection<Transformation> transformations;

    protected String outputPath;

    /**
     * Customizable sections by the user of the output
     */
    protected Map<Class<? extends JsonSectionOutput>, JsonSectionOutput> sections;

    /**
//     * Saves the sosies with version information
//     *
//     * @param transformations Transformations to be stored
//     * @param outPutPath      Path where the sosies are going to be stored
//     * @param srcPOM          POM's path for the project where the sosies are extracted
//     * @param generatorVersion    POM of the sosies generator
//     */
//    public JsonTransformationWriter(Collection<Transformation> transformations, String outPutPath,
//                            String srcPOM, String generatorVersion) {
//        assert outPutPath != null;
//        assert srcPOM != null;
//        assert generatorVersion != null;
//
//        this.transformations = transformations;
//        this.outputPath = outPutPath;
//        outputObject = new JSONObject();
//        initSections(srcPOM, generatorVersion);
//    }

    public JsonTransformationWriter() {
        sections = new HashMap<>();
    }

    /**
     * Init sections
     * @param srcPOM
     * @param generatorVersion
     */
    private void initSections(String srcPOM, String generatorVersion) {


        JsonHeaderOutput s = new JsonHeaderOutput(srcPOM, generatorVersion);
        s.setTransformations(transformations);
        sections.put(JsonHeaderOutput.class, s);

        sections.put(JsonFailuresOutput.class, new JsonFailuresOutput());

        sections.put(JsonTransformationsOutput.class, new JsonTransformationsOutput());
    }

    /**
     * Sets a section in the list of sections.
     * There is only one section per class in the output object
     * @param section Output Section to be set
     */
    public void addSection(Class<? extends JsonSectionOutput> aClass, JsonSectionOutput section) {
        sections.put(aClass, section);
    }

    public void write(Collection<Transformation> transformations, String outPutPath,
                      String srcPOM) {
        this.transformations = transformations;
        this.outputPath = outPutPath;
        outputObject = new JSONObject();
        initSections(srcPOM, getGeneratorVersion());

        write();
    }

    protected String getGeneratorVersion() {
        return "1.0";
//        if(getClass().getResource("pom.xml") != null) {
//            return getClass().getResource("pom.xml").getFile().toString();
//        } else {
//            return getClass().getResource("./../../../../../..").getFile().toString() + "../../pom.xml";
//        }
    }

    /**
     * Writes the transformation into a JSON object
     */
    protected void writeToJson() {
        //Write the header
        JsonSectionOutput header = sections.get(JsonHeaderOutput.class);
        header.setTransformations(transformations);
        header.write(outputObject);

        //Write failures to file
        JsonFailuresOutput failures = (JsonFailuresOutput) sections.get(JsonFailuresOutput.class);
        failures.setTransformations(transformations);
        failures.write(outputObject);

        //Write transformations to file
        JsonTransformationsOutput transformationsOutput = (JsonTransformationsOutput) sections.get(JsonTransformationsOutput.class);
        transformationsOutput.setTransformations(transformations);
        transformationsOutput.setFailuresDict(failures.getFailuresDict());
        transformationsOutput.write(outputObject);

        //Write the rest of the trasnformations
        for ( JsonSectionOutput s : sections.values() ) {
            if (s.equals(header) || s.equals(failures) || transformationsOutput.equals(s)) continue;
            s.setTransformations(transformations);
            s.write(outputObject);
        }
    }

    /**
     * Writes the transformation into a JSON file
     */
    public void write() {

        System.out.println("Attempt to write in: " + outputPath);
        writeToJson();
        try {
            FileWriter fw = new FileWriter(outputPath);
            outputObject.write(fw);
            fw.close();
        } catch (IOException | JSONException e) {
            throw new PersistenceException(UNABLE_WRITE_JSON_MSG + "\n" + e.getMessage(), e);
        }
    }
}

package fr.inria.diversify.persistence.json.output;

import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.transformation.Transformation;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/**
 * Created by marodrig on 09/01/2015.
 */
public class JsonSosiesOutput {

    private static final String UNABLE_WRITE_JSON_MSG = "Unable write to json";

    protected final JSONObject outputObject;

    private final Collection<Transformation> transformations;

    private final String outputPath;

    private List<JsonAstTransformationOutput> astSections;

    /**
     * Customizable sections by the user of the output
     */
    private HashMap<Class<? extends JsonSectionOutput>, JsonSectionOutput> visibleSections;

    /**
     * Saves the sosies with version information
     *
     * @param transformations Transformations to be stored
     * @param outPutPath      Path where the sosies are going to be stored
     * @param srcPOM          POM's path for the project where the sosies are extracted
     * @param generatorVersion    POM of the sosies generator
     */
    public JsonSosiesOutput(Collection<Transformation> transformations, String outPutPath,
                            String srcPOM, String generatorVersion) {
        assert outPutPath != null;
        assert srcPOM != null;
        assert generatorVersion != null;

        this.transformations = transformations;
        this.outputPath = outPutPath;
        outputObject = new JSONObject();
        initSections(srcPOM, generatorVersion);
    }

    /**
     * Init sections
     * @param srcPOM
     * @param generatorVersion
     */
    private void initSections(String srcPOM, String generatorVersion) {
        astSections = Arrays.asList(new JsonAstTransformationOutput[]{
                        new JsonAstReplaceOutput(),
                        new JsonAstAddOutput(),
                        new JsonAstDeleteOutput(),
                });
        visibleSections = new HashMap<>();
        for (JsonSectionOutput s : astSections) visibleSections.put(s.getClass(), s);
        JsonHeaderOutput s = new JsonHeaderOutput(srcPOM, generatorVersion);
        s.setTransformations(transformations);
        visibleSections.put(JsonHeaderOutput.class, s);
    }

    /**
     * Sets a section in the list of sections.
     * There is only one section per class in the output object
     * @param section Output Section to be set
     */
    public void setSection(Class<? extends JsonSectionOutput> aClass, JsonSectionOutput section) {
        visibleSections.put(aClass, section);
    }

    /**
     * Get the section from the list
     * @param aClass
     * @return
     */
    public JsonSectionOutput getSection(Class<? extends JsonSectionOutput> aClass){
        return visibleSections.get(aClass.getClass());
    }

    /**
     * Writes the transformation into a JSON object
     */
    protected void writeToJson() {
        //Make sure all transformations have unique id. //TODO: Investigate the advantages of adding a UUId
        int id = 0;
        for (Transformation t : transformations) t.setIndex(id++);

        //Write the header
        visibleSections.get(JsonHeaderOutput.class).setTransformations(transformations);
        visibleSections.get(JsonHeaderOutput.class).write(outputObject);

        //Write failures to file
        JsonFailuresOutput failures = new JsonFailuresOutput();
        failures.setTransformations(transformations);
        failures.write(outputObject);

        //Write transformations to file
        for (JsonAstTransformationOutput s : astSections) {
            s.setTransformations(transformations);
            s.setFailuresDict(failures.getFailuresDict());
            s.write(outputObject);
        }
    }

    /**
     * Writes the transformation into a JSON file
     */
    public void write() {

        writeToJson();

        try {
            FileWriter fw = new FileWriter(outputPath);
            outputObject.write(fw);
            fw.close();
        } catch (IOException | JSONException e) {
            throw new PersistenceException(UNABLE_WRITE_JSON_MSG + e.getMessage(), e);
        }
    }
}

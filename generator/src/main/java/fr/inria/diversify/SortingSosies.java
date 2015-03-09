package fr.inria.diversify;

import fr.inria.diversify.buildSystem.maven.MavenDependencyResolver;
import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.factories.SpoonMetaFactory;
import fr.inria.diversify.persistence.json.input.JsonSectionInput;
import fr.inria.diversify.persistence.json.input.JsonSosiesInput;
import fr.inria.diversify.persistence.json.output.JsonSosiesOutput;
import fr.inria.diversify.testMutation.FloatInputModification;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.*;

/**
 *
 * Sorts sosies by its classification strenght
 *
 * Created by marodrig on 09/03/2015.
 */
public class SortingSosies {

    private static final String CONF_PATH = "C:\\MarcelStuff\\data\\DIVERSE\\input_configurations\\SortingSosies-CommonColl.properties";


    /**
     * Reads the coverage information
     * <p/>
     * Created by marodrig on 17/02/2015.
     */
    public static class JsonClassificationInput extends JsonSectionInput {

        private static String STRENGTH = "strength";

        private HashMap<UUID, Float> classifications;

        public HashMap<UUID, Float> getClassifications() {
            if ( classifications == null ) classifications = new HashMap<>();
            return classifications;
        }

        @Override
        public void read(HashMap<UUID, Transformation> transformations) {
            try {
                if ( !getJsonObject().has(STRENGTH) ) return;
                JSONObject st = getJsonObject().getJSONObject(STRENGTH);
                Iterator<String> keys = st.keys();

                while( keys.hasNext() ) {
                    String key = keys.next();
                    if ( st.has(key) ) {
                        getClassifications().put(UUID.fromString(key), (float)st.getDouble(key));
                    }
                }

            } catch (JSONException e) {
                throwError("Unable to read tags", e, false);
            }
        }

    }

    /**
     * Loads and sorts the sosies given a TEST
     * @param configurationPath
     * @return
     * @throws Exception
     */
    public static ArrayList<Transformation> loadSortedSosies(String configurationPath) throws Exception {
        InputConfiguration inputConfiguration = new InputConfiguration(CONF_PATH);

        MavenDependencyResolver dr = new MavenDependencyResolver();
        dr.DependencyResolver(inputConfiguration.getProjectPath() + "\\pom.xml");

        InputProgram p = new InputProgram();
        p.configure(inputConfiguration);

        long t = System.currentTimeMillis();
        p.setFactory(new SpoonMetaFactory().buildNewFactory(p.getAbsoluteSourceCodeDir(), 7));
        Log.info("Build: " + Math.abs(System.currentTimeMillis() - t));

        t = System.currentTimeMillis();
        p.processCodeFragments();
        Log.info("Process code fragment Time: " + Math.abs(System.currentTimeMillis() - t));

        t = System.currentTimeMillis();
        JsonSosiesInput input = new JsonSosiesInput(inputConfiguration.getResultPath(), p);
        JsonClassificationInput c = new JsonClassificationInput();
        input.setSection(JsonClassificationInput.class, c);
        ArrayList<Transformation> r = new ArrayList<>(input.read());
        Log.info("Read Time: " + Math.abs(System.currentTimeMillis() - t));
        Collections.sort(r, new Comparator<Transformation>() {
            @Override
            public int compare(Transformation o1, Transformation o2) {
                Float f1 = c.getClassifications().get(o1.getIndex());
                Float f2 = c.getClassifications().get(o2.getIndex());
                return Math.round(f2 - f1);
            }
        });

        //ArrayList<Transformation> r = loadSortedSosies(CONF_PATH);
        for (Transformation trs : r) {
            Log.info(trs.toString() + ", " + c.getClassifications().get(trs.getIndex()));
        }

        return r;
    }

    public static void main(String[] args) throws Exception {

        Log.INFO();
        loadSortedSosies(CONF_PATH);

   }

}

package fr.inria.diversify;

import fr.inria.diversify.buildSystem.maven.MavenBuilder;
import fr.inria.diversify.buildSystem.maven.MavenDependencyResolver;
import fr.inria.diversify.runner.InputConfiguration;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.factories.SpoonMetaFactory;
import fr.inria.diversify.persistence.json.input.JsonSosiesInput;
import fr.inria.diversify.persistence.json.output.JsonSosiesOutput;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.util.Log;
import org.codehaus.plexus.util.FileUtils;

import java.io.File;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.Collection;

import static fr.inria.diversify.transformation.Transformation.EXCEPTION;
import static fr.inria.diversify.transformation.Transformation.SOSIE;

/**
 * Takes a series of corrected transformations and check if they are still sosies
 */
public class CorrectedTransformationsToSosie {

    //private static final String CONF_PATH = "C:\\MarcelStuff\\data\\DIVERSE\\input_configurations\\CheckSosies-CommonColl.properties";

    //Readed transformations
    private ArrayList<Transformation> transformations;

    //Confirmed soses
    private ArrayList<Transformation> sosies;

    public static void main(String[] args) throws Exception {

        new CorrectedTransformationsToSosie().start(args[0]);


    }

    private void start(String confPath) throws Exception {
        Log.INFO();

        InputConfiguration inputConfiguration = new InputConfiguration(confPath);

        verifyTransformations(inputConfiguration);
    }


    /**
     * Verify that transformations are indeed sosies
     *
     * @param inputConfiguration
     */
    private void verifyTransformations(InputConfiguration inputConfiguration) throws Exception {

        Log.info("Creating tmp dir");
        initPath(inputConfiguration);
        Log.info("Creating tmp dir completed");

        //Path for resulting files of sosies and non-sosies

        String transfPath = inputConfiguration.getOutputDirectory() + "/coll-minus_sosies.json";

        String sosiePath = inputConfiguration.getOutputDirectory() + System.currentTimeMillis() + ".sosies.json" ;

        sosies = new ArrayList<>();

        //Load transformations and previously created sosies (if any)
        Log.info("Loading transformations");
        if ( new File(transfPath).exists() )
            transformations = loadWithSosiesInput(inputConfiguration, transfPath);
        else
            transformations = loadWithSosiesInput(inputConfiguration,
                    inputConfiguration.getPreviousTransformationPath());
        Log.info("Loading transformations completed");



        Log.info("Transformation size: " + transformations.size());
        while (transformations.size() > 0) {

            Transformation t = transformations.get(transformations.size() - 1);

            int status;
            try {
                Log.info("Applying transformation");
                status = applyTransformation(inputConfiguration, t);
                Log.info("Transformation applied successfully. Build status: " + status);
            } catch (Exception e) {
                status = EXCEPTION;
            }

            if (status == EXCEPTION) {
                Log.info("Exception!!");
                //Try to recover by reseting the whole thing
                initPath(inputConfiguration);
                if (new File(transfPath).exists())
                    transformations = loadWithSosiesInput(inputConfiguration, transfPath);
                Log.info("Recovering from exception successful");
            }

            transformations.remove(transformations.size() - 1);
            //Save the transformations
            JsonSosiesOutput transfOut =  new JsonSosiesOutput(
                    transformations, transfPath, inputConfiguration.getProjectPath() + "\\pom.xml",
                    InputConfiguration.LATEST_GENERATOR_VERSION);
            transfOut.write();


            if (status == SOSIE) {
                sosies.add(t);
                //Save the sosies
                JsonSosiesOutput sosieOut = new JsonSosiesOutput(transformations, sosiePath,
                        inputConfiguration.getProjectPath() + "\\pom.xml", InputConfiguration.LATEST_GENERATOR_VERSION);
                sosieOut.write();
            }

            Log.info("Sosies so far: " + sosies.size());
            Log.info("Transformation remaining: " + transformations.size());
        }

    }

    private void initPath(InputConfiguration inputConfiguration) throws IOException {
        //Copy project to tmp folder
        File prj = new File(inputConfiguration.getProjectPath());
        File tmp = new File(inputConfiguration.getTempDir());
        FileUtils.copyDirectoryStructure(prj, tmp);
    }

    /**
     * Applies the transformation:
     * 1. Creates a new factory
     * 2.
     *
     * @param inputConfiguration
     * @param t
     */
    private int applyTransformation(InputConfiguration inputConfiguration, Transformation t) throws Exception {
        String s = inputConfiguration.getTempDir() + "/src/main/java";
        int status = Transformation.NOT_TESTED;
        try {
            t.apply(s);

            status = runTests(inputConfiguration);

            t.restore(s);
        } catch (Exception e) {
            return EXCEPTION;
        }
        return status;//AbstractTransformation.NOT_TESTED;
    }

    private int runTests(InputConfiguration inputConfiguration) throws InterruptedException, IOException {
        MavenBuilder rb = new MavenBuilder(inputConfiguration.getTempDir());
        rb.setTimeOut(0);
        rb.runGoals(new String[]{"clean", "test"}, true);
        return rb.getStatus();
    }


    /**
     * Loads the sosies with the JsonSosiesInput
     *
     * @param inputConfiguration Input configuration to load
     * @return The collection of transformations loaded
     * @throws Exception
     */
    private ArrayList<Transformation> loadWithSosiesInput(
            InputConfiguration inputConfiguration, String transfPath) throws Exception {
        MavenDependencyResolver dr = MavenDependencyResolver.dependencyResolver();
        dr.resolveDependencies(inputConfiguration.getInputProgram());

        InputProgram p = new InputProgram();
        p.configure(inputConfiguration);

        long t = System.currentTimeMillis();
        p.setFactory(new SpoonMetaFactory().buildNewFactory(inputConfiguration.getRelativeSourceCodeDir(), 7));
        Log.info("Build: " + Math.abs(System.currentTimeMillis() - t));

        t = System.currentTimeMillis();
        p.processCodeFragments();
        Log.info("Process code fragment Time: " + Math.abs(System.currentTimeMillis() - t));

        t = System.currentTimeMillis();
        JsonSosiesInput input = new JsonSosiesInput(transfPath, p);
        Collection<Transformation> r = input.read();
        Log.info("Read Time: " + Math.abs(System.currentTimeMillis() - t));
        return new ArrayList<>(r);
    }

    protected static void suicide() {
        String pid = ManagementFactory.getRuntimeMXBean().getName().split("@")[0];
        Log.debug("suicide");
        Log.debug("PID :" + pid);
        Runtime r = Runtime.getRuntime();
        try {
            r.exec("kill " + pid);
        } catch (Exception e) {
            Log.error("suicide ", e);
        }
    }

}

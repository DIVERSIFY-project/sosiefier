package fr.inria.diversify.runner;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.Statement;

import fr.inria.diversify.util.Log;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 * The input configuration class encapsulates all the data and asociated behavior we obtain from the input properties
 * given by the user.
 * <p>
 * The InputConfiguration makes other objects life easier by not only being a data holder but also by implementing
 * behaviors related from this data as the building of new CodeFragments given the CodeFragmentClass property
 * <p>
 * Created by marcel on 8/06/14.
 */
public class InputConfiguration {

    //GENERATOR VERSIONS
    public static final String GEN_VERSION_1_0_0 = "1.0.0";
    public static final String LATEST_GENERATOR_VERSION = GEN_VERSION_1_0_0;

    /**
     * Internal properties
     */
    protected Properties prop;

    /**
     * resulting input program from the input configuration
     */
    private InputProgram inputProgram;

    /*
     * Output path to all operations resulting in output
     */
    //private String outputPath;

    /**
     * Errors raised during validation
     */
    private List<String> errors;

    private String rootPath;


    public InputConfiguration() {
        prop = new Properties();
        setDefaultProperties();
        setCodeFragmentClass();
        errors = new ArrayList<>();
        rootPath = prop.getProperty("root.path");
    }

    public InputConfiguration(InputStream stream) throws IOException {
        prop = new Properties();
        setDefaultProperties();
        prop.load(stream);
        setCodeFragmentClass();
        errors = new ArrayList<>();
        rootPath = prop.getProperty("root.path");
    }


    public InputConfiguration(String file) throws IOException {
        this(new FileInputStream(file));
        if (rootPath == null || rootPath.equals("")) rootPath = System.getProperty("user.dir");
    }

    /**
     * Return the internal properties
     *
     * @return Proprties instance
     */
    public Properties getProperties() {
        return prop;
    }

    /**
     * Gets the specific value of a property
     *
     * @param key Key to the value
     * @return A string with the value
     */
    public String getProperty(String key) {
        return getProperties().getProperty(key);
    }

    /**
     * Gets the specific value of a property
     *
     * @param key          Key to the value
     * @param defaultValue Default value to set
     * @return A string with the value
     */
    public String getProperty(String key, String defaultValue) {
        return getProperties().getProperty(key, defaultValue);
    }

    /**
     * The input program we are sosieficating.
     */
    public InputProgram getInputProgram() {
        return inputProgram;
    }

    /**
     * The input program we are sosieficating.
     */
    public void setInputProgram(InputProgram inputProgram) {
        this.inputProgram = inputProgram;
    }

    /**
     * Gets the project path. The project path is the parent directory where all files concerning a project are.
     *
     * @return String with the path
     */
    public String getProjectPath() {
        return getAbsolutePath(getProperty("project"));
    }

    /**
     * Returns the full path of the production (source) code of a project.
     *
     * @return String with the path
     */
    public String getRelativeSourceCodeDir() {
        return prop.getProperty("src");
    }

    /**
     * Returns the full path of the test (source) code of a project.
     *
     * @return String with the path
     */
    public String getRelativeTestSourceCodeDir() {
        return prop.getProperty("testSrc", "src/test/java");
    }


    /**
     * Returns the path of the previously found transformations
     *
     * @return
     */
    public String getPreviousTransformationPath() {
        String s = prop.getProperty("transformation.directory", "");
        return getAbsolutePath(s);
    }

    /**
     * Returns the path of the built classes
     *
     * @return String with the path
     */
    public String getClassesDir() {
        return  prop.getProperty("classes");
    }

    /**
     * Get coverage dir of a project
     *
     * @return
     */
    public String getCoverageDir() {
        String s = prop.getProperty("jacoco") == null ? prop.getProperty("coverage", "") : prop.getProperty("jacoco");
        return getAbsolutePath(s);
    }

    /**
     * Returns the results path
     * <p>
     * NOTE: Possible duplicate of getOutputDirectory
     *
     * @return
     */
    public String getResultPath() {
        return prop.getProperty("result", prop.getProperty("outputDirectory", ""));
    }

    /**
     * If some path is given as relative path, this root will be used to resolve it
     */
    public String getRootPath() {
        return rootPath;
    }

    /**
     * Errors found during the validation
     *
     * @return A collection of messages of errors found during the validation
     */
    public Collection<String> getValidationErrors() {
        return errors;
    }

    /**
     * Returns a new code fragment given the processing level set by the user in the input properties
     * <p>
     * Defaults to statement in case of any error
     *
     * @return
     */
    public CodeFragment getNewCodeFragment() {
        CodeFragment result;
        try {
            Class cl = Class.forName(getProperties().getProperty("CodeFragmentClass"));
            result = (CodeFragment) cl.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            result = new Statement();
            Log.warn("Unable to create the code fragment requested, resolved to Statement level", e);
            e.printStackTrace();
        }
        return result;
    }

    protected void setCodeFragmentClass() {
        if (getProperties().getProperty("processor").equals("fr.inria.diversify.codeFragmentProcessor.StatementProcessor"))
            getProperties().setProperty("CodeFragmentClass", "fr.inria.diversify.codeFragment.Statement");
        if (getProperties().getProperty("processor").equals("fr.inria.diversify.codeFragmentProcessor.ExpressionProcessor"))
            getProperties().setProperty("CodeFragmentClass", "fr.inria.diversify.codeFragment.Expression");
        if (getProperties().getProperty("processor").equals("fr.inria.diversify.codeFragmentProcessor.BlockProcessor"))
            getProperties().setProperty("CodeFragmentClass", "fr.inria.diversify.codeFragment.Block");
    }

    protected void setDefaultProperties() {
        prop.setProperty("src", "src/main/java");
        prop.setProperty("testSrc", "src/test/java");
        prop.setProperty("classes", "target/classes");
        prop.setProperty("clojure", "false");
        prop.setProperty("javaVersion", "5");
        prop.setProperty("transformation.type", "all");
        prop.setProperty("transformation.size", "1");
        prop.setProperty("stat", "false");
        prop.setProperty("sosie", "false");

        //Indicates if the Diversify must report early
        prop.setProperty("early.report", "0");

        //tempory directory
        prop.setProperty("tmpDir", "tmpDir");

        //directory for output (ex sosie)
        prop.setProperty("outputDirectory", "output");
        //directory for output result (ex sosie)
        prop.setProperty("result", "output_diversify");

        prop.setProperty("sosieOnMultiProject", "false");
        prop.setProperty("timeOut", "-1");
        prop.setProperty("logLevel", "2");
        prop.setProperty("gitRepository", "null");
        prop.setProperty("processor", "fr.inria.diversify.codeFragmentProcessor.StatementProcessor");
        prop.setProperty("transplant.point.search.strategy",
                "fr.inria.diversify.transformation.executeQuery.searchStrategy.SimpleRandomStrategy");
        prop.setProperty("transplant.search.strategy",
                "fr.inria.diversify.transformation.executeQuery.searchStrategy.SimpleRandomStrategy");

        prop.setProperty("syncroRange", "0");
        prop.setProperty("newPomFile", "");
        prop.setProperty("transformation.level", "statement");
        prop.setProperty("builder", "maven");
    }

    protected String getAbsolutePath(String path) {
        Path p = Paths.get(path);
        if ( new File(path).exists() || p.isAbsolute() ) return path;
        if (rootPath != null && !rootPath.equals("")) p = Paths.get(rootPath + "/" + path);
        else p = Paths.get(path);
        return p.normalize().toString().replace(File.separator, "/");
    }


    private void addError(String error) {
        errors.add(error);
    }

    private void checkPath(String desc, String path, boolean mustExist) {
        if (path == null) {
            if (mustExist) addError(desc + " at " + path + " does not exists");
        } else if (!new File(path).exists() && (mustExist || !path.equals("")))
            addError(desc + " at " + path + " does not exists");
    }

    /**
     * Checks that the configuration is valid
     */
    public boolean validate() {
        checkPath("Project path", getProjectPath(), true);
        checkPath("Source path", getProjectPath() + "/"+ getResultPath() , true);
        checkPath("Previous transformation path", getPreviousTransformationPath(), false);
        checkPath("Coverage dir", getCoverageDir(), false);
        checkPath("Root dir", getRootPath(), false);
        checkPath("Temp directory", getTempDir(), false);
        return errors.size() == 0;
    }

    /**
     * Gets the temporary directory for all operations
     * @return
     */
    public String getTempDir() {
        return getAbsolutePath(getProperty("tmpDir"));
    }
}
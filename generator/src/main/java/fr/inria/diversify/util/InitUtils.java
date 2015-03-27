package fr.inria.diversify.util;

import fr.inria.diversify.buildSystem.android.InvalidSdkException;
import fr.inria.diversify.buildSystem.maven.MavenDependencyResolver;
import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.factories.SpoonMetaFactory;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Level;
import spoon.Launcher;
import spoon.reflect.factory.Factory;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 18/03/15
 * Time: 10:58
 */
public class InitUtils {



    public static void initLogLevel(InputConfiguration inputConfiguration) {
        Launcher.logger.setLevel(Level.OFF);
        int level = Integer.parseInt(inputConfiguration.getProperty("logLevel"));
        Log.set(level);

    }

    public static void initDependency(InputConfiguration inputConfiguration) throws Exception, InvalidSdkException {
        MavenDependencyResolver t = new MavenDependencyResolver();
        String builder = inputConfiguration.getProperty("builder");

        String dependencyPom = inputConfiguration.getProperty("dependencyPom");
        if (builder.equals("maven") && dependencyPom != null) {
            File pom = new File(inputConfiguration.getProperty("project") + "/pom.xml");
            File originalPom = new File(inputConfiguration.getProperty("project") + "/_originalPom.xml");
            FileUtils.copyFile(pom, originalPom);

            if(dependencyPom != null) {
                FileUtils.copyFile(new File(inputConfiguration.getProperty("project") + "/" +dependencyPom), pom);
            }

            t.DependencyResolver(inputConfiguration.getProperty("project") + "/pom.xml");

            FileUtils.copyFile(originalPom, pom);
            FileUtils.forceDelete(originalPom);
        } else {
            t.DependencyResolver(inputConfiguration.getProperty("project") + "/pom.xml");
        }

        String androidSdk = inputConfiguration.getProperty("AndroidSdk");
        if(androidSdk != null) {
            t.resolveAndroidDependencies(androidSdk);
        }
    }

    /**
     * Initializes the InputProgram dataset
     */
    public static InputProgram initInputProgram(InputConfiguration inputConfiguration) throws IOException, InterruptedException {
        InputProgram inputProgram = new InputProgram();
        inputConfiguration.setInputProgram(inputProgram);
        inputProgram.setProgramDir(inputConfiguration.getProperty("project"));
        inputProgram.setRelativeSourceCodeDir(inputConfiguration.getRelativeSourceCodeDir());

        if(inputConfiguration.getProperty("externalSrc") != null) {
            List<String> list = Arrays.asList(inputConfiguration.getProperty("externalSrc").split(System.getProperty("path.separator")));
            String sourcesDir = list.stream()
                    .map(src -> inputProgram.getProgramDir() + "/" + src)
                    .collect(Collectors.joining(System.getProperty("path.separator")));
            inputProgram.setExternalSourceCodeDir(sourcesDir);
        }

        inputProgram.setTransformationPerRun(
                Integer.parseInt(inputConfiguration.getProperty("transformation.size", "1")));

        //Path to pervious transformations made to this input program
        inputProgram.setPreviousTransformationsPath(
                inputConfiguration.getProperty("transformation.directory"));

        inputProgram.setClassesDir(inputConfiguration.getProperty("project") + "/" +
                inputConfiguration.getProperty("classes"));

        inputProgram.setCoverageDir(inputConfiguration.getProperty("jacoco"));

        inputProgram.setJavaVersion(Integer.parseInt(inputConfiguration.getProperty("javaVersion", "6")));

        return inputProgram;
    }

    public static Factory initSpoon(InputProgram inputProgram) {
        try {
            Factory factory =  new SpoonMetaFactory().buildNewFactory(inputProgram);
            inputProgram.setFactory(factory);
            return factory;
        } catch (ClassNotFoundException  | IllegalAccessException | InstantiationException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

}

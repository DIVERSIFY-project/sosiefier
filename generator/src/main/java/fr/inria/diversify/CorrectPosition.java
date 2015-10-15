package fr.inria.diversify;

import fr.inria.diversify.buildSystem.maven.MavenDependencyResolver;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.factories.SpoonMetaFactory;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationJsonParser;
import fr.inria.diversify.util.Log;
import org.json.JSONArray;
import spoon.reflect.factory.Factory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Collection;
import java.util.Properties;

/**
 *
 *
 * Given a JSON file with transformations and a project, finds the transformations in the project and corrects
 * the positions so they match in the given project. This will solve situations in wich sosies where created using
 * one source and then tried to be replicated using another.
 * <p>
 * Created by marodrig on 22/12/2014.
 */
@Deprecated
public class CorrectPosition {

    public CorrectPosition(String fileName) throws Exception {
        Properties prop = new Properties();
        prop.load(new FileInputStream(fileName));

        logInputVariables(prop, fileName);

        //Configuration
        String project = prop.getProperty("project");
        String src = prop.getProperty("src");
        String out = prop.getProperty("outputDirectory");
        String prevTransfPath = prop.getProperty("transformation.directory");

//        MavenDependencyResolver resolver = new MavenDependencyResolver();
//        resolver.DependencyResolver(project + "/pom.xml");

        Factory factory = new SpoonMetaFactory().buildNewFactory(project + "/" + src, 7);
        InputProgram inputProgram = new InputProgram();
        inputProgram.setFactory(factory);
        inputProgram.setRelativeSourceCodeDir(src);
        inputProgram.setPreviousTransformationsPath(prevTransfPath);
        inputProgram.processCodeFragments();

        Collection<Transformation> ts = new TransformationJsonParser(false, inputProgram).parseFile(new File(prevTransfPath));

        JSONArray array = new JSONArray();
        for (Transformation t : ts) {
            array.put(t.toJSONObject());
        }
        FileWriter fw = new FileWriter(out);
        try {
            array.write(fw);
        } finally {
            fw.close();
        }
    }

    private void logInputVariables(Properties props, String propertiesFile) {
        Log.info("Property file: " + propertiesFile);
        String project = props.getProperty("project");
        Log.info("project: " + project);
        String src = props.getProperty("src");
        Log.info("src: " + src);
        String out = props.getProperty("outputDirectory");
        Log.info("out: " + out);
        String prevTransfPath = props.getProperty("transformation.directory");
        Log.info("Prev Transf Path: " + prevTransfPath);
    }

    public static void main(String[] args) throws Exception {
        new CorrectPosition(args[0]);
    }

}

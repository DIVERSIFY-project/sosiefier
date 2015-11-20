package fr.inria.diversify;

import fr.inria.diversify.runner.InputConfiguration;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.factories.SpoonMetaFactory;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationJsonParser;
import fr.inria.diversify.transformation.TransformationOldParser;
import spoon.reflect.factory.Factory;

import java.io.File;
import java.util.List;

/**
 * Created by marodrig on 29/07/2014.
 */
@Deprecated
public class OldParserToNewJsonFormat {

    public static void main(String[] args) throws Exception {
        InputConfiguration configuration = new InputConfiguration(args[0]);
        Factory factory = new SpoonMetaFactory().buildNewFactory(configuration.getProjectPath(), 5);

        InputProgram inputProgram = new InputProgram();
        inputProgram.setFactory(factory);
        inputProgram.configure(configuration);
        inputProgram.processCodeFragments();

        TransformationOldParser parser = new TransformationOldParser(false, inputProgram);
        List<Transformation> transf = parser.parseFile(new File(inputProgram.getPreviousTransformationsPath()));

        TransformationJsonParser.saveToFile(transf, configuration.getResultPath());
    }

}

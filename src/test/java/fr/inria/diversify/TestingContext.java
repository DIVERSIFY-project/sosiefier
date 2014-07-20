package fr.inria.diversify;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.factories.SpoonMetaFactory;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationJsonParser;
import fr.inria.diversify.transformation.TransformationParserException;
import spoon.reflect.factory.Factory;

import java.io.File;
import java.util.List;

/**
 * Created by marodrig on 18/07/2014.
 */
public class TestingContext {

    private static InputProgram inputProgram = null;

    public static void createInputProgram(String srcPath) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        if ( inputProgram == null ) {
            Factory factory = new SpoonMetaFactory().buildNewFactory(srcPath, 5);
            inputProgram = new InputProgram();
            inputProgram.setFactory(factory);
            inputProgram.setSourceCodeDir(srcPath);
            inputProgram.processCodeFragments();
        }

    }

    public static boolean isNullProgram() {
        return inputProgram == null;
    }

    public static InputProgram getInputProgram() {
        return inputProgram;
    }

    public static void setInputProgram(InputProgram inputProgram) {
        TestingContext.inputProgram = inputProgram;
    }

    public static void loadTransformations(String resourcePath) throws TransformationParserException {
        TransformationJsonParser parser = new TransformationJsonParser(false, inputProgram);
        List<Transformation> transf = parser.parseFile(new File(resourcePath));
    }
}

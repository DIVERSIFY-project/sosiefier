package fr.inria.diversify;

import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.factories.SpoonMetaFactory;
import fr.inria.diversify.sosie.SosiePoolCreator;
import fr.inria.diversify.util.DiversifyEnvironment;
import fr.inria.diversify.util.DiversifyProperties;
import fr.inria.diversify.util.Log;
import spoon.compiler.SpoonCompiler;
import spoon.reflect.factory.Factory;
import spoon.reflect.factory.FactoryImpl;
import spoon.support.DefaultCoreFactory;
import spoon.support.StandardEnvironment;
import spoon.support.compiler.jdt.JDTBasedSpoonCompiler;

import java.io.File;
import java.io.IOException;

/**
 * A program to create a pool of sosies out of a directory of transformations
 *
 * Created by marodrig on 19/06/2014.
 */
public class SosiePoolCreatorMain {

    public static void main(String[] args) throws Exception {

        SosiePoolCreatorMain creator = new SosiePoolCreatorMain();

        //Create a boost trap checking someday
        creator.init(new InputConfiguration(args[0]));

    }

    public void init(InputConfiguration configuration) {

        try {
            Factory factory = new SpoonMetaFactory().buildNewFactory(configuration.getProperty("project"), 5);

            InputProgram inputProgram = new InputProgram();
            inputProgram.setFactory(factory);
            inputProgram.setPreviousTransformationsPath(
                    configuration.getProperty("transformation.directory"));
            inputProgram.processCodeFragments();
            SosiePoolCreator creator = new SosiePoolCreator(inputProgram);

            creator.create(configuration.getProperty("output.directory"));
        } catch (Exception e ) {
            throw new RuntimeException(e);
        }

    }

}

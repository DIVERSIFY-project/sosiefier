package fr.inria.diversify.ut;

import fr.inria.diversify.factories.SpoonMetaFactory;
import fr.inria.diversify.util.Log;
import spoon.reflect.factory.Factory;

import java.io.File;
import java.io.IOError;
import java.io.IOException;

/**
 * Created by marodrig on 22/01/2015.
 */
public class SpoonMetaFactoryTest extends SpoonMetaFactory {

    public static final String PROBABLE_FAIL_CAUSE = "This test fails if the basepath is incorrect. Check basepath";

    public Factory build() {
        try {

            File f = new File("src\\test\\java\\fr\\inria\\diversify\\ut\\samples");
            if ( !f.exists() ) {
                Log.error("File not found: " + f.getAbsolutePath());
                throw new IOException(PROBABLE_FAIL_CAUSE);
            }

            return buildNewFactory("src\\test\\java\\fr\\inria\\diversify\\ut\\samples", 7);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

package fr.inria.diversify.ut;

import fr.inria.diversify.factories.SpoonMetaFactory;
import fr.inria.diversify.util.Log;
import spoon.reflect.factory.Factory;

import java.io.File;

/**
 * Created by marodrig on 22/01/2015.
 */
public class SpoonMetaFactoryTest extends SpoonMetaFactory {

    public static final String PROBABLE_FAIL_CAUSE = "This test fails if the basepath is incorrect. Check basepath";

    public Factory build() {
        try {
            String separator = System.getProperty("file.separator");
            File f = new File("src.test.resources.samples.".replace(".", separator));
            if ( !f.exists() ) Log.error("File not found: " + f.getAbsolutePath());

            return buildNewFactory("src.test.resources.samples.".replace(".", separator), 7);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

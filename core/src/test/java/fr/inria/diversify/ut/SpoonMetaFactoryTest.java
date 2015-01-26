package fr.inria.diversify.ut;

import fr.inria.diversify.factories.SpoonMetaFactory;
import fr.inria.diversify.util.Log;
import spoon.reflect.factory.Factory;

import java.io.File;

/**
 * Created by marodrig on 22/01/2015.
 */
public class SpoonMetaFactoryTest extends SpoonMetaFactory {

    public Factory build() {
        try {

            File f = new File("src\\test\\java\\fr\\inria\\diversify\\ut\\samples");
            if ( !f.exists() ) Log.error("File not found: " + f.getAbsolutePath());

            return buildNewFactory("src\\test\\java\\fr\\inria\\diversify\\ut\\samples", 7);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

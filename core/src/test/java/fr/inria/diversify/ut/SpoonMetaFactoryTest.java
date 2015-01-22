package fr.inria.diversify.ut;

import fr.inria.diversify.factories.SpoonMetaFactory;
import spoon.reflect.factory.Factory;

/**
 * Created by marodrig on 22/01/2015.
 */
public class SpoonMetaFactoryTest extends SpoonMetaFactory {

    public Factory build() {
        try {
            return buildNewFactory("core\\src\\test\\java\\fr\\inria\\diversify\\ut\\samples", 7);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

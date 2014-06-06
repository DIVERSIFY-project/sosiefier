package fr.inria.diversify.factory;

import fr.inria.diversify.random.IRandom;
import fr.inria.diversify.random.Random;

/**
 *
 * Returns an instance of java.utils.Random
 *
 * Created by marcel on 6/06/14.
 */
public class RandomFactory implements IRandomFactory {

    public IRandom buildRandomizer() {
        return new Random();
    }

}

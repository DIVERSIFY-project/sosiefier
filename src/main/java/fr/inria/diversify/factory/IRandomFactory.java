package fr.inria.diversify.factory;

import fr.inria.diversify.random.IRandom;

/**
 * Created by marcel on 6/06/14.
 */
public interface IRandomFactory {

    /**
     * Builds a randomizer
     *
     * @return A randomizer
     */
    public IRandom buildRandomizer();

}

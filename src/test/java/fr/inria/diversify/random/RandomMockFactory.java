package fr.inria.diversify.random;


/**
 *
 * Returns an instance of RandomMock to be able to control de the random
 *
 * Created by marcel on 6/06/14.
 */
public class RandomMockFactory {

    public IRandom buildRandomizer() {
        return new RandomMock();
    }

}

package fr.inria.diversify.random;

/**
 *  A random wrapper to be able to control how the randomization is made
 *
 * Created by marcel on 6/06/14.
 */
public class Random extends java.util.Random implements IRandom {

    @Override
    public double nextDouble() {
        return super.nextDouble();
    }

    @Override
    public int nextInt(int bound) {
        return super.nextInt(bound);
    }
}

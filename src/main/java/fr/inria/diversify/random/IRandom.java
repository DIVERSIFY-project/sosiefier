package fr.inria.diversify.random;

/**
 * A random interface to be able to control how the randomization is made
 *
 * Created by marcel on 6/06/14.
 */
public interface IRandom {

    public double nextDouble();

    public int nextInt(int bound);
}

package fr.inria.diversify.transformation.query;

/**
 * Created by marodrig on 08/07/2014.
 */
public class MaxNumberOfAttemptsReach extends RuntimeException {

    private long max;

    private int attempts;

    public MaxNumberOfAttemptsReach(long max, int attempts) {
        super("Max number of possible transformations reached");
        this.max = max;
        this.attempts = attempts;
    }

    public long getMax() {
        return max;
    }

    public int getAttempts() {
        return attempts;
    }
}

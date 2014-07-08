package fr.inria.diversify.transformation.query;

/**
 *
 * An exception thrown when an operation cant be performed after several tries
 *
 * Created by marodrig on 04/07/2014.
 */
public class SeveralTriesUnsuccessful extends RuntimeException {

    private Exception[] causes;

    public SeveralTriesUnsuccessful(Exception[] exceptions) {
        causes = exceptions;
    }

    public Exception[] getCauses() {
        return causes;
    }

    @Override
    public String getMessage() {
        String result = "";
        for (Exception e : causes) {
            result += e.getMessage() + "\r\n";
        }
        return result;
    }
}

package fr.inria.diversify.transformation.query;

/**
 * Created by marodrig on 12/08/2014.
 */
public class QueryException extends Exception {

    public QueryException(Exception e) {
        super(e);
    }

    public Reasons getReason() {
        return reason;
    }

    public enum Reasons { UNKNOWN, UNABLE_TO_FIND_SOSIE_PARENT}

    private Reasons reason;

    public QueryException(Reasons reason) {
        this.reason = reason;
    }

    public QueryException(String msg) {
        super(msg);
    }

}
